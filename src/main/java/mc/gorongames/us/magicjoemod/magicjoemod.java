package mc.gorongames.us.magicjoemod;



import mc.gorongames.us.magicjoemod.CraftingRecipes.JoemodCrafting;
import mc.gorongames.us.magicjoemod.armor.ModArmor;
import mc.gorongames.us.magicjoemod.blocks.ModBlocks;
import mc.gorongames.us.magicjoemod.items.ModItems;
import mc.gorongames.us.magicjoemod.lib.Constants;
import mc.gorongames.us.magicjoemod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class magicjoemod {

	@SidedProxy(clientSide="mc.gorongames.us.magicjoemod.proxy.ClientProxy", serverSide="mc.gorongames.us.magicjoemod.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
    	
		this.proxy.preInit(event);
	    //ModEntity.init();
	    
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		
		this.proxy.init(event);
	    
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){

		this.proxy.postInit(event);
		
	}
}