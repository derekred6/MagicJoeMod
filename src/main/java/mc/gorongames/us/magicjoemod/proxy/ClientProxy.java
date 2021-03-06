package mc.gorongames.us.magicjoemod.proxy;

import mc.gorongames.us.magicjoemod.armor.ArmorRenderRegister;
import mc.gorongames.us.magicjoemod.blocks.BlockRenderRegister;
import mc.gorongames.us.magicjoemod.items.ItemRenderRegister;
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
        
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

}
