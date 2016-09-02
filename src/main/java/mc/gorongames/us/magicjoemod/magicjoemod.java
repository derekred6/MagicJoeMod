package mc.gorongames.us.magicjoemod;



import mc.gorongames.us.magicjoemod.CraftingRecipes.JoemodCrafting;
import mc.gorongames.us.magicjoemod.armor.ModArmor;
import mc.gorongames.us.magicjoemod.blocks.ModBlocks;
import mc.gorongames.us.magicjoemod.entity.ModEntity;
import mc.gorongames.us.magicjoemod.items.ItemEnderFleeceFabric;
import mc.gorongames.us.magicjoemod.items.ModItems;
import mc.gorongames.us.magicjoemod.lib.Constants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class magicjoemod {

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
    	
		ModBlocks.preinit();
	    ModItems.preinit();
	    ModArmor.preinit();
	    //ModEntity.init();
	    
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		
	    JoemodCrafting.init();
	    
	    //register renders
	    if(event.getSide() == Side.CLIENT) {
	    	
	    	ModItems.init();
	    	ModArmor.init();
	    	ModBlocks.init();
	    	
	    }
	    
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){

	}
}