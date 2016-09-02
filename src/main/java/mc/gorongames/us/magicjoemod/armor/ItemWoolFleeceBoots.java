package mc.gorongames.us.magicjoemod.armor;

import mc.gorongames.us.magicjoemod.lib.Constants;
import mc.gorongames.us.magicjoemod.lib.MagicJoeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemWoolFleeceBoots extends ItemArmor {

	private final String name = "woolfleeceboots";
	
	public ItemWoolFleeceBoots(ArmorMaterial material, int armorType) {
		super(material, 0, armorType);
		setUnlocalizedName(Constants.MODID + "_" + name);
//		setTextureName(Constants.MODID + ":" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(MagicJoeTab.tabMagicJoe);
	  
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity,int slot, String type){

		if(stack.getItem() == ModArmor.woolfleecebootsItem){
			
			return Constants.MODID + ":textures/armor/models/armor/woolfleece_layer_2.png";		
		}
		else
		{
		
		System.out.println("Invalid Item WoolFleeceArmor");
		return null;
		
		}
		
	}

	public String getName() {
		return name;
	}
}