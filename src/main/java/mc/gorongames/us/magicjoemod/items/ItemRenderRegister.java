package mc.gorongames.us.magicjoemod.items;

import mc.gorongames.us.magicjoemod.lib.Constants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;

public class ItemRenderRegister {

	public static void registerItemRenderer() {

		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
    	
    	renderItem.getItemModelMesher().register(ModItems.goldenscrapsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemGoldenScraps) ModItems.goldenscrapsItem).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(ModItems.goldenfleecefabricItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemGoldenFleeceFabric) ModItems.goldenfleecefabricItem).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(ModItems.rainbowscrapsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemRainbowScraps) ModItems.rainbowscrapsItem).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(ModItems.rainbowfleecefabricItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemRainbowFleeceFabric) ModItems.rainbowfleecefabricItem).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(ModItems.enderfleecefabricItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemEnderFleeceFabric) ModItems.enderfleecefabricItem).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(ModItems.squidfleecefabricItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemSquidFleeceFabric) ModItems.squidfleecefabricItem).getName(), "inventory"));
    	renderItem.getItemModelMesher().register(ModItems.woolfabricItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemWoolFabric) ModItems.woolfabricItem).getName(), "inventory"));
	}
	
}
