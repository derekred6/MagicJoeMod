package mc.gorongames.us.magicjoemod.entity.layer;

import mc.gorongames.us.magicjoemod.entity.EntityGoldenJoe;
import mc.gorongames.us.magicjoemod.entity.RenderEntityGoldenJoe;
import mc.gorongames.us.magicjoemod.lib.Constants;
import net.minecraft.client.model.ModelSheep1;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderSheep;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.ResourceLocation;

public class LayerGoldenJoeWool implements LayerRenderer
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(Constants.MODID + ":" + "textures/entity/joe/models/GoldJoe_wool.png");
    private final RenderEntityGoldenJoe GoldenJoeRenderer;
    private final ModelGoldenJoeWool GoldenJoeWoolModel = new ModelGoldenJoeWool();
    private static final String __OBFID = "CL_00002413";

    public LayerGoldenJoeWool(RenderEntityGoldenJoe p_i46112_1_)
    {
        this.GoldenJoeRenderer = p_i46112_1_;
    }

    public void doRenderLayer(EntityGoldenJoe p_177162_1_, float p_177162_2_, float p_177162_3_, float p_177162_4_, float p_177162_5_, float p_177162_6_, float p_177162_7_, float p_177162_8_)
    {
        if (!p_177162_1_.getSheared() && !p_177162_1_.isInvisible())
        {
            this.GoldenJoeRenderer.bindTexture(TEXTURE);

//            if (p_177162_1_.hasCustomName() && "jeb_".equals(p_177162_1_.getCustomNameTag()))
//            {
//                boolean flag = true;
//                int i = p_177162_1_.ticksExisted / 25 + p_177162_1_.getEntityId();
//                int j = EnumDyeColor.values().length;
//                int k = i % j;
//                int l = (i + 1) % j;
//                float f7 = ((float)(p_177162_1_.ticksExisted % 25) + p_177162_4_) / 25.0F;
//                float[] afloat1 = EntitySheep.func_175513_a(EnumDyeColor.byMetadata(k));
//                float[] afloat2 = EntitySheep.func_175513_a(EnumDyeColor.byMetadata(l));
//                GlStateManager.color(afloat1[0] * (1.0F - f7) + afloat2[0] * f7, afloat1[1] * (1.0F - f7) + afloat2[1] * f7, afloat1[2] * (1.0F - f7) + afloat2[2] * f7);
//            }
//            else
//            {
//                float[] afloat = EntityGoldenJoe.func_175513_a(p_177162_1_.getFleeceColor());
//                GlStateManager.color(afloat[0], afloat[1], afloat[2]);
//            }

            this.GoldenJoeWoolModel.setModelAttributes(this.GoldenJoeRenderer.getMainModel());
            this.GoldenJoeWoolModel.setLivingAnimations(p_177162_1_, p_177162_2_, p_177162_3_, p_177162_4_);
            this.GoldenJoeWoolModel.render(p_177162_1_, p_177162_2_, p_177162_3_, p_177162_5_, p_177162_6_, p_177162_7_, p_177162_8_);
        }
    }

    public boolean shouldCombineTextures()
    {
        return true;
    }

    public void doRenderLayer(EntityLivingBase p_177141_1_, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_)
    {
        this.doRenderLayer((EntityGoldenJoe)p_177141_1_, p_177141_2_, p_177141_3_, p_177141_4_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_);
    }

}
