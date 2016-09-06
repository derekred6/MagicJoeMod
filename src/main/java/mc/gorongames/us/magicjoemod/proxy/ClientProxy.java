package mc.gorongames.us.magicjoemod.proxy;

import mc.gorongames.us.magicjoemod.armor.ArmorRenderRegister;
import mc.gorongames.us.magicjoemod.blocks.BlockRenderRegister;
import mc.gorongames.us.magicjoemod.entity.EntityGoldenJoe;
import mc.gorongames.us.magicjoemod.entity.EntitySheepTest;
import mc.gorongames.us.magicjoemod.entity.RenderEntityGoldenJoe;
import mc.gorongames.us.magicjoemod.entity.RenderEntitySheepTest;
import mc.gorongames.us.magicjoemod.entity.model.ModelGoldenJoe;
import mc.gorongames.us.magicjoemod.entity.model.ModelSheepTest3;
import mc.gorongames.us.magicjoemod.items.ItemRenderRegister;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	@Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        
        //register renders
        ItemRenderRegister.registerItemRenderer();
        ArmorRenderRegister.registerArmorRenderer();
        BlockRenderRegister.registerBlockRenderer();
        RenderingRegistry.registerEntityRenderingHandler(EntitySheepTest.class, new RenderEntitySheepTest(Minecraft.getMinecraft().getRenderManager(), new ModelSheepTest3(), 0));
        RenderingRegistry.registerEntityRenderingHandler(EntityGoldenJoe.class, new RenderEntityGoldenJoe(Minecraft.getMinecraft().getRenderManager(), new ModelGoldenJoe(), 0));
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

}
