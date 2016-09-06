package mc.gorongames.us.magicjoemod.entity;

import mc.gorongames.us.magicjoemod.lib.Constants;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
//import net.minecraft.client.renderer.entity.layers.LayerSheepWool;
import net.minecraft.util.ResourceLocation;

public class RenderEntitySheepTest extends RenderLiving {

	private static ResourceLocation EntitySheepTestTexture = new ResourceLocation(Constants.MODID + ":" + "textures/entity/joe/GoldJoe.png");
	
	private static final String __OBFID = "CL_00000984";
	
	public RenderEntitySheepTest(RenderManager p_i46153_1_, ModelBase p_i46153_2_, float p_i46153_3_) {
		super(p_i46153_1_, p_i46153_2_, p_i46153_3_);
//		this.addLayer(new LayerSheepWool(this));
	}
	
	protected ResourceLocation func_180572_a(EntitySheepTest entity) {
		
		return EntitySheepTestTexture;
		
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		
		return this.func_180572_a((EntitySheepTest) entity);
		
	}
	
	
	
//	public RenderSheepTest(RenderManager rendermanager, ModelBase par1ModelBase, float parShadowSize) {
//		
//		super(renderManager, par1ModelBase, parShadowSize);
//		setEntityTexture();
//		
//	}
	
//	@Override
//	protected void preRenderCallback(EntityLivingBase entity, float f) {
//		
//		preRenderCallbackSheepTest((EntitySheepTest) entity, f);
//		
//	}
//	
//	protected void preRenderCallbackSheepTest(EntitySheepTest entity, float f) {
//		
//		
//		
//	}
//	
//	protected void setEntityTexture() {
//		
//		sheepTestTexture = new ResourceLocation(Constants.MODID + ":" + "textures/entity/joe/GoldJoe.png");
//		
//	}
//	
//	@Override
//	protected ResourceLocation getEntityTexture(Entity par1Entity) {
//		
//		return sheepTestTexture;
//		
//	}
	
	
//	private static final ResourceLocation sheepTestTextures = new ResourceLocation("textures/entity/joe/models/GoldJoe.png");
//	
//	public RenderSheepTest(RenderManager rendermanager, ModelBase model, float shadowsize) {
//		
//		super(rendermanager, model, shadowsize);
//		
//	}
//	
//	protected ResourceLocation func_180572_a(EntitySheepTest entity) {
//		
//		return sheepTestTextures;
//		
//	}
//	
//	protected ResourceLocation getEntityTexture(Entity entity) {
//		
//		return this.func_180572_a((EntitySheepTest)entity);
//		
//	}
	
}
