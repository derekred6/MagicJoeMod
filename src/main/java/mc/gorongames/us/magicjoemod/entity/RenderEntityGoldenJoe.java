package mc.gorongames.us.magicjoemod.entity;

import mc.gorongames.us.magicjoemod.lib.Constants;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerSheepWool;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderEntityGoldenJoe extends RenderLiving {

    private static ResourceLocation EntityGoldenJoeTexture = new ResourceLocation(Constants.MODID + ":" + "textures/entity/joe/models/GoldJoe.png");
	
	private static final String __OBFID = "CL_00000984";
	
	public RenderEntityGoldenJoe(RenderManager p_i46153_1_, ModelBase p_i46153_2_, float p_i46153_3_) {
		super(p_i46153_1_, p_i46153_2_, p_i46153_3_);
		this.addLayer(new LayerJoeWool(this));
	}
	
	protected ResourceLocation func_180572_a(EntityGoldenJoe entity) {
		
		return EntityGoldenJoeTexture;
		
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		
		return this.func_180572_a((EntityGoldenJoe) entity);
		
	}
}