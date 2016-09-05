package mc.gorongames.us.magicjoemod.items;

import mc.gorongames.us.magicjoemod.lib.Constants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

	public static Item goldenscrapsItem;
	public static Item goldenfleecefabricItem;
	public static Item rainbowscrapsItem;
	public static Item rainbowfleecefabricItem;
	public static Item enderfleecefabricItem;
	public static Item squidfleecefabricItem;
	public static Item woolfabricItem;
	
	public static void preinit(){
		
		goldenscrapsItem = new ItemGoldenScraps();
		goldenfleecefabricItem = new ItemGoldenFleeceFabric();
		rainbowscrapsItem = new ItemRainbowScraps();
		rainbowfleecefabricItem = new ItemRainbowFleeceFabric();
		enderfleecefabricItem = new ItemEnderFleeceFabric();
		squidfleecefabricItem = new ItemSquidFleeceFabric();
		woolfabricItem = new ItemWoolFabric();
		

    	GameRegistry.registerItem(goldenscrapsItem, "goldenscraps");
    	GameRegistry.registerItem(goldenfleecefabricItem, "goldenfleecefabric");
    	GameRegistry.registerItem(rainbowscrapsItem, "rainbowscraps");
    	GameRegistry.registerItem(rainbowfleecefabricItem, "rainbowfleecefabric");
    	GameRegistry.registerItem(enderfleecefabricItem, "enderfleecefabric");
    	GameRegistry.registerItem(squidfleecefabricItem, "squidfleecefabric");
    	GameRegistry.registerItem(woolfabricItem, "woolfabric");
		
	}
	
	public static void init() {
		
	}
}
