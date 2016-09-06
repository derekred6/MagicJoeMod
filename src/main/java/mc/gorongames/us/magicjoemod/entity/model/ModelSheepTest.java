package mc.gorongames.us.magicjoemod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelSheepTest extends ModelBase {

	public ModelRenderer Head = new ModelRenderer(this, 0, 0);
	public ModelRenderer Body = new ModelRenderer(this, 0, 0);
	public ModelRenderer Leg1 = new ModelRenderer(this, 0, 0);
	public ModelRenderer Leg2 = new ModelRenderer(this, 0, 0);
	public ModelRenderer Leg3 = new ModelRenderer(this, 0, 0);
	public ModelRenderer Leg4 = new ModelRenderer(this, 0, 0);
	
	public ModelSheepTest() {
		
		textureWidth = 64;
		textureHeight = 32;
		
		this.Head = new ModelRenderer(this, 1, 1);
		this.Head.addBox(-3.0F, -4.0F, -4.0F, 6, 6, 6, 0.6F);
        this.Head.setRotationPoint(0.0F, 6.0F, -8.0F);
        
        this.Body = new ModelRenderer(this, 28, 8);
        this.Body.addBox(-4.0F, -10.0F, -7.0F, 8, 16, 6, 1.75F);
        this.Body.setRotationPoint(0.0F, 5.0F, 2.0F);
        float f = 0.5F;
        
        this.Leg1 = new ModelRenderer(this, 0, 16);
        this.Leg1.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
        this.Leg1.setRotationPoint(-3.0F, 12.0F, 7.0F);
        
        this.Leg2 = new ModelRenderer(this, 0, 16);
        this.Leg2.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
        this.Leg2.setRotationPoint(3.0F, 12.0F, 7.0F);
        
        this.Leg3 = new ModelRenderer(this, 0, 16);
        this.Leg3.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
        this.Leg3.setRotationPoint(-3.0F, 12.0F, -5.0F);
        
        this.Leg4 = new ModelRenderer(this, 0, 16);
        this.Leg4.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
        this.Leg4.setRotationPoint(3.0F, 12.0F, -5.0F);
        
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