package mc.gorongames.us.magicjoemod.blocks;

import mc.gorongames.us.magicjoemod.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block goldenfleeceBlock;
	public static Block rainbowfleeceBlock;
	public static Block enderfleeceBlock;
	public static Block squidfleeceBlock;
	
	public static void preinit(){
		
        goldenfleeceBlock = new BlockGoldenFleece();
        rainbowfleeceBlock = new BlockRainbowFleece();
        enderfleeceBlock = new BlockEnderFleece();
        squidfleeceBlock = new BlockSquidFleece();
		
        GameRegistry.registerBlock(goldenfleeceBlock, "goldenfleeceBlock");
        GameRegistry.registerBlock(rainbowfleeceBlock, "rainbowfleeceBlock");
        GameRegistry.registerBlock(enderfleeceBlock, "enderfleeceBlock");
        GameRegistry.registerBlock(squidfleeceBlock, "squidfleeceBlock");
        
        
	}
	
	public static void init(){
		
	}
}
