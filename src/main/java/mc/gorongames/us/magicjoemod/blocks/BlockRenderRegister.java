package mc.gorongames.us.magicjoemod.blocks;

import mc.gorongames.us.magicjoemod.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister {
	
	public static Block goldenfleeceBlock;
	public static Block rainbowfleeceBlock;
	public static Block enderfleeceBlock;
	public static Block squidfleeceBlock;
	
	public static void registerBlockRenderer() {
		
RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(goldenfleeceBlock), 0, new ModelResourceLocation(Constants.MODID + ":" + ((BlockGoldenFleece) goldenfleeceBlock).getName(), "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(rainbowfleeceBlock), 0, new ModelResourceLocation(Constants.MODID + ":" + ((BlockRainbowFleece) rainbowfleeceBlock).getName(), "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(enderfleeceBlock), 0, new ModelResourceLocation(Constants.MODID + ":" + ((BlockEnderFleece) enderfleeceBlock).getName(), "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(squidfleeceBlock), 0, new ModelResourceLocation(Constants.MODID + ":" + ((BlockSquidFleece) squidfleeceBlock).getName(), "inventory"));
		
    }

}
