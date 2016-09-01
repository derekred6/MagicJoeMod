package mc.gorongames.us.magicjoemod.lib;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class MagicJoeTab {
	
	public static final CreativeTabs tabMagicJoe = new CreativeTabs("MagicJoe") {

		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return Items.string;
		}
		
	};
}