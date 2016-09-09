package mc.gorongames.us.magicjoemod.entity.model;

import mc.gorongames.us.magicjoemod.entity.EntityGoldenJoe;
import net.minecraft.client.model.ModelQuadruped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;

public class ModelGoldenJoe extends ModelQuadruped {
	
//	public ModelRenderer Head = new ModelRenderer(this, 0, 0);
//	public ModelRenderer Body = new ModelRenderer(this, 0, 0);
//	public ModelRenderer Leg1 = new ModelRenderer(this, 0, 0);
//	public ModelRenderer Leg2 = new ModelRenderer(this, 0, 0);
//	public ModelRenderer Leg3 = new ModelRenderer(this, 0, 0);
//	public ModelRenderer Leg4 = new ModelRenderer(this, 0, 0);
    private static final String __OBFID = "CL_00000853";	
    private float field_78153_i;
    
  public ModelGoldenJoe() {
	  
	  super(12, 0.0F);
//	  textureWidth = 64;
//	  textureHeight = 32;
	  

      this.head = new ModelRenderer(this, 0, 0);
      this.head.addBox(-3.0F, -4.0F, -6.0F, 6, 6, 8, 0.0F);
      this.head.setRotationPoint(0.0F, 6.0F, -8.0F);
      this.body = new ModelRenderer(this, 28, 8);
      this.body.addBox(-4.0F, -10.0F, -7.0F, 8, 16, 6, 0.0F);
      this.body.setRotationPoint(0.0F, 5.0F, 2.0F);
	  
	  
//      this.head = new ModelRenderer(this, 0, 0);
//      this.head.addBox(-3.0F, -4.0F, -4.0F, 6, 6, 6, 0.6F);
//      this.head.setRotationPoint(0.0F, 6.0F, -8.0F);
//      this.body = new ModelRenderer(this, 28, 8);
//      this.body.addBox(-4.0F, -10.0F, -7.0F, 8, 16, 6, 1.75F);
//      this.body.setRotationPoint(0.0F, 5.0F, 2.0F);
//      float f = 0.5F;
//      this.leg1 = new ModelRenderer(this, 0, 16);
//      this.leg1.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
//      this.leg1.setRotationPoint(-3.0F, 12.0F, 7.0F);
//      this.leg2 = new ModelRenderer(this, 0, 16);
//      this.leg2.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
//      this.leg2.setRotationPoint(3.0F, 12.0F, 7.0F);
//      this.leg3 = new ModelRenderer(this, 0, 16);
//      this.leg3.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
//      this.leg3.setRotationPoint(-3.0F, 12.0F, -5.0F);
//      this.leg4 = new ModelRenderer(this, 0, 16);
//      this.leg4.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
//      this.leg4.setRotationPoint(3.0F, 12.0F, -5.0F);
      

  }

  /**
   * Used for easily adding entity-dependent animations. The second and third float params here are the same second
   * and third as in the setRotationAngles method.
   */
  public void setLivingAnimations(EntityLivingBase p_78086_1_, float p_78086_2_, float p_78086_3_, float p_78086_4_)
  {
      super.setLivingAnimations(p_78086_1_, p_78086_2_, p_78086_3_, p_78086_4_);
      this.head.rotationPointY = 6.0F + ((EntityGoldenJoe)p_78086_1_).getHeadRotationPointY(p_78086_4_) * 9.0F;
      this.field_78153_i = ((EntityGoldenJoe)p_78086_1_).getHeadRotationAngleX(p_78086_4_);
  }
  
//  public void render(Entity entity, float time, float limbSwingDistance, float p_78088_4_, float headYRot, float headXRot, float YTrans) {
//		
//		this.setRotationAngles(YTrans, time, limbSwingDistance, p_78088_4_, headYRot, headXRot, entity);
//		
//		if(this.isChild) {
//			
//			float div = 2.0f;
//			GlStateManager.pushMatrix();	
//			GlStateManager.translate(0.0F, this.childYOffset * headXRot, this.childZOffset * headXRot);
//			GlStateManager.scale(1.0f/div, 1.0f/div, 1.0f/div);
//			GlStateManager.translate(0.0f, 24.0f*YTrans, 0.0f);
//			
//			this.Head.render(YTrans);
//			this.Body.render(YTrans);
//			this.Leg1.render(YTrans);
//			this.Leg2.render(YTrans);
//			this.Leg3.render(YTrans);
//			this.Leg4.render(YTrans);
//			
//			GlStateManager.popMatrix();
//			
//		} else {
//			
//			this.Head.render(YTrans);
//			this.Body.render(YTrans);
//			this.Leg1.render(YTrans);
//			this.Leg2.render(YTrans);
//			this.Leg3.render(YTrans);
//			this.Leg4.render(YTrans);
//			
//		}
//    super.render(entity, f, f1, f2, f3, f4, f5);
//    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
//    Head.render(f5);
//    Body.render(f5);
//    Leg1.render(f5);
//    Leg2.render(f5);
//    Leg3.render(f5);
//    Leg4.render(f5);
//  }
  
//  private void setRotation(ModelRenderer model, float x, float y, float z) {
//    model.rotateAngleX = x;
//    model.rotateAngleY = y;
//    model.rotateAngleZ = z;
//  }

  /**
   * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
   * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
   * "far" arms and legs can swing at most.
   */
  public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
  {
      super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, p_78087_7_);
      this.head.rotateAngleX = this.field_78153_i;
  }
	
}
