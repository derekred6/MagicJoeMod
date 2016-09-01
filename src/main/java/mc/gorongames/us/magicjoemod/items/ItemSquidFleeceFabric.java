package mc.gorongames.us.magicjoemod.items;

import mc.gorongames.us.magicjoemod.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemSquidFleeceFabric extends Item {
	
	private final String name = "squidfleecefabric";

	public ItemSquidFleeceFabric(){
		
		setUnlocalizedName(Constants.MODID + "_" + name);
//		setTextureName(Constants.MODID + ":" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(CreativeTabs.tabMaterials);
		
	}

	public String getName() {
		return name;
	}
}
