package mc.gorongames.us.magicjoemod.items;

import mc.gorongames.us.magicjoemod.lib.Constants;
import mc.gorongames.us.magicjoemod.lib.MagicJoeTab;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemWoolFabric extends Item {
	
	private final String name = "woolfabric";
	
	public ItemWoolFabric(){
		
		setUnlocalizedName(Constants.MODID + "_" + name);
		//setTextureName(Constants.MODID + ":" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(MagicJoeTab.tabMagicJoe);
		
	}

	public String getName() {
		return name;
	}
}
