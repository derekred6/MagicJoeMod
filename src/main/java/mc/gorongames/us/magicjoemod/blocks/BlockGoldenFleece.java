package mc.gorongames.us.magicjoemod.blocks;

import mc.gorongames.us.magicjoemod.lib.Constants;
import mc.gorongames.us.magicjoemod.lib.MagicJoeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockGoldenFleece extends Block{
	
	private final String name = "goldenfleeceBlock";
	
	public BlockGoldenFleece(){
		super (Material.cloth);
		this.setHardness(0.8f);
		this.setResistance(4f);
		this.setHarvestLevel("sheers", 2);
		this.setStepSound(soundTypeCloth);
		setCreativeTab(MagicJoeTab.tabMagicJoe);
		this.setUnlocalizedName(Constants.MODID + "_" + name);
//		this.setBlockTextureName(Constants.MODID + ":" + name);
		GameRegistry.registerBlock(this, name);
		
	}

	public String getName() {
		return name;
	}
}
