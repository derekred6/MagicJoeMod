package mc.gorongames.us.magicjoemod.items;

import mc.gorongames.us.magicjoemod.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemWoolFabric extends Item {
	
	private final String name = "woolfabric";
	
	public ItemWoolFabric(){
		
		setUnlocalizedName(Constants.MODID + "_" + name);
		//setTextureName(Constants.MODID + ":" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(CreativeTabs.tabMaterials);
		
	}

	public String getName() {
		return name;
	}
}
