package mc.gorongames.us.magicjoemod.proxy;

import mc.gorongames.us.magicjoemod.CraftingRecipes.JoemodCrafting;
import mc.gorongames.us.magicjoemod.armor.ModArmor;
import mc.gorongames.us.magicjoemod.blocks.ModBlocks;
import mc.gorongames.us.magicjoemod.items.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
		
		ModItems.preinit();
		ModBlocks.preinit();
		ModArmor.preinit();
		
	}
	
	public void init(FMLInitializationEvent event) {

		JoemodCrafting.init();		
		
    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}
