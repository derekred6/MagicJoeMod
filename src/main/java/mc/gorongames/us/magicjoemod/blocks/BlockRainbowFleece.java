package mc.gorongames.us.magicjoemod.blocks;

import mc.gorongames.us.magicjoemod.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRainbowFleece extends Block {
	
	private final String name = "rainbowfleeceBlock";
	
	public BlockRainbowFleece(){
		super (Material.cloth);
		this.setHardness(0.8f);
		this.setResistance(4f);
		this.setLightLevel(0.5f);
		this.setHarvestLevel("sheers", 2);
		this.setStepSound(soundTypeCloth);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName(Constants.MODID + "_" + name);
//		this.setBlockTextureName(Constants.MODID + ":" + name);
		GameRegistry.registerBlock(this, name);
		
	}

	public String getName() {
		return name;
	}
}
