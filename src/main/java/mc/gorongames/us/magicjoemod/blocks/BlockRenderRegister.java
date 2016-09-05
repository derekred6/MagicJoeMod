package mc.gorongames.us.magicjoemod.blocks;

import mc.gorongames.us.magicjoemod.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister {
	
	public static void registerBlockRenderer() {
		
RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.goldenfleeceBlock), 0, new ModelResourceLocation(Constants.MODID + ":" + ((BlockGoldenFleece) ModBlocks.goldenfleeceBlock).getName(), "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.rainbowfleeceBlock), 0, new ModelResourceLocation(Constants.MODID + ":" + ((BlockRainbowFleece) ModBlocks.rainbowfleeceBlock).getName(), "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.enderfleeceBlock), 0, new ModelResourceLocation(Constants.MODID + ":" + ((BlockEnderFleece) ModBlocks.enderfleeceBlock).getName(), "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.squidfleeceBlock), 0, new ModelResourceLocation(Constants.MODID + ":" + ((BlockSquidFleece) ModBlocks.squidfleeceBlock).getName(), "inventory"));
		
    }

}
