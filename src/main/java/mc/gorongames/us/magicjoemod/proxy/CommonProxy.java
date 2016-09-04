package mc.gorongames.us.magicjoemod.proxy;

import mc.gorongames.us.magicjoemod.items.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	public void init(FMLInitializationEvent event) {

		ModItems.init();
		
    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}
