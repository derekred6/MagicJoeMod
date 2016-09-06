package mc.gorongames.us.magicjoemod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelSheepTest2 extends ModelBase {
	

	public ModelRenderer Head = new ModelRenderer(this, 0, 0);
	public ModelRenderer Body = new ModelRenderer(this, 0, 0);
	
	public ModelSheepTest2() {
		
		textureWidth = 64;
		textureHeight = 32;

        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.addBox(-3.0F, -4.0F, -6.0F, 6, 6, 8, 0.0F);
        this.Head.setRotationPoint(0.0F, 6.0F, -8.0F);
        
        this.Body = new ModelRenderer(this, 28, 8);
        this.Body.addBox(-4.0F, -10.0F, -7.0F, 8, 16, 6, 0.0F);
        this.Body.setRotationPoint(0.0F, 5.0F, 2.0F);
		
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
			
			GlStateManager.popMatrix();
			
		} else {
			
			this.Head.render(YTrans);
			this.Body.render(YTrans);
			
		}
		
	}
	
	public void setRotationAngles(float time, float limbSwingDistance, float p_78087_3_, float HeadYRot, float HeadXRot, float p_78087_6_, Entity entity) {

		this.Head.rotateAngleX = HeadXRot / (180f / (float)Math.PI);
		this.Head.rotateAngleY = HeadYRot / (180f / (float)Math.PI);
		

		this.Body.rotateAngleX = ((float)Math.PI / 2f);
	
	}

}
