package mc.gorongames.us.magicjoemod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelRainbowJoe extends ModelBase {
	
	public ModelRenderer Head = new ModelRenderer(this, 0, 0);
	public ModelRenderer Body = new ModelRenderer(this, 0, 0);
	public ModelRenderer Leg1 = new ModelRenderer(this, 0, 0);
	public ModelRenderer Leg2 = new ModelRenderer(this, 0, 0);
	public ModelRenderer Leg3 = new ModelRenderer(this, 0, 0);
	public ModelRenderer Leg4 = new ModelRenderer(this, 0, 0);
  
  public ModelRainbowJoe() {
	  
    textureWidth = 64;
    textureHeight = 32;
    
    this.Head = new ModelRenderer(this, 2, 2);
    this.Head.addBox(-3F, -4F, -4F, 6, 6, 6);
    this.Head.setRotationPoint(0F, 6F, -8F);
    this.Head.setTextureSize(64, 32);
    this.Head.mirror = true;
    this.setRotation(Head, 0F, 0F, 0F);
    this.Body = new ModelRenderer(this, 28, 8);
    this.Body.addBox(-4F, -10F, -7F, 8, 16, 6);
    this.Body.setRotationPoint(0F, 5F, 2F);
    this.Body.setTextureSize(64, 32);
    this.Body.mirror = true;
    this.setRotation(Body, 1.570796F, 0F, 0F);
    this.Leg1.mirror = true;
    this.Leg1 = new ModelRenderer(this, 0, 16);
    this.Leg1.addBox(-2F, 0F, -2F, 4, 6, 4);
    this.Leg1.setRotationPoint(-3F, 12F, 7F);
    this.Leg1.setTextureSize(64, 32);
    this.Leg1.mirror = true;
    this.setRotation(Leg1, 0F, 3.141593F, 0F);
    this.Leg1.mirror = false;
    this.Leg2 = new ModelRenderer(this, 0, 16);
    this.Leg2.addBox(-2F, 0F, -2F, 4, 6, 4);
    this.Leg2.setRotationPoint(3F, 12F, 7F);
    this.Leg2.setTextureSize(64, 32);
    this.Leg2.mirror = true;
    this.setRotation(Leg2, 0F, 3.141593F, 0F);
    this.Leg3 = new ModelRenderer(this, 0, 16);
    this.Leg3.addBox(-2F, 0F, -2F, 4, 6, 4);
    this.Leg3.setRotationPoint(-3F, 12F, -5F);
    this.Leg3.setTextureSize(64, 32);
    this.Leg3.mirror = true;
    this.setRotation(Leg3, 0F, 3.141593F, 0F);
    this.Leg4 = new ModelRenderer(this, 0, 16);
    this.Leg4.addBox(-2F, 0F, -2F, 4, 6, 4);
    this.Leg4.setRotationPoint(3F, 12F, -5F);
    this.Leg4.setTextureSize(64, 32);
    this. Leg4.mirror = true;
    this.setRotation(Leg4, 0F, 3.141593F, 0F);
  }
  
  public void render(Entity entity, float time, float limbSwingDistance, float p_78088_4_, float headYRot, float headXRot, float YTrans) {
		
		this.setRotationAngles(YTrans, time, limbSwingDistance, p_78088_4_, headXRot, headYRot, entity);
		
		if(this.isChild) {
			
			float div = 2.0f;
			GlStateManager.pushMatrix();
			GlStateManager.scale(1.0f/div, 1.0f/div, 1.0f/div);
			GlStateManager.translate(0.0f, 24.0f*YTrans, 0.0f);
			
			this.Head.render(YTrans);
			this.Body.render(YTrans);
			this.Leg1.render(YTrans);
			this.Leg2.render(YTrans);
			this.Leg3.render(YTrans);
			this.Leg4.render(YTrans);
			
			GlStateManager.popMatrix();
			
		} else {
			
			this.Head.render(YTrans);
			this.Body.render(YTrans);
			this.Leg1.render(YTrans);
			this.Leg2.render(YTrans);
			this.Leg3.render(YTrans);
			this.Leg4.render(YTrans);
			
		}
//    super.render(entity, f, f1, f2, f3, f4, f5);
//    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
//    Head.render(f5);
//    Body.render(f5);
//    Leg1.render(f5);
//    Leg2.render(f5);
//    Leg3.render(f5);
//    Leg4.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float time, float limbSwingDistance, float p_78087_3_, float HeadYRot, float HeadXRot, float p_78087_6_, Entity entity) {

		this.Head.rotateAngleX = HeadXRot / (180f / (float)Math.PI);
		this.Head.rotateAngleY = HeadYRot / (180f / (float)Math.PI);
		

		this.Body.rotateAngleX = ((float)Math.PI / 2f);
		

		this.Leg1.rotateAngleX = MathHelper.cos(time * 0.6662f) * 1.4f * limbSwingDistance;
		this.Leg2.rotateAngleX = MathHelper.cos(time * 0.6662f + (float)Math.PI) * 1.4f * limbSwingDistance;
		this.Leg3.rotateAngleX = MathHelper.cos(time * 0.6662f + (float)Math.PI) * 1.4f * limbSwingDistance;
		this.Leg4.rotateAngleX = MathHelper.cos(time * 0.6662f) * 1.4f * limbSwingDistance;
  }
	
}