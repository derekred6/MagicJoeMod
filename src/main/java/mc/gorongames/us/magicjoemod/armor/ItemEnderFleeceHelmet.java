package mc.gorongames.us.magicjoemod.armor;

import mc.gorongames.us.magicjoemod.lib.Constants;
import mc.gorongames.us.magicjoemod.lib.MagicJoeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemEnderFleeceHelmet extends ItemArmor {
	
	private final String name = "enderfleecehelmet";
	
	public ItemEnderFleeceHelmet(ArmorMaterial material, int armorType) {
		super(material, 0, armorType);
		setUnlocalizedName(Constants.MODID + "_" + name);
//		setTextureName(Constants.MODID + ":" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(MagicJoeTab.tabMagicJoe);
		
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity,int slot, String type){

		if(stack.getItem() == ModArmor.enderfleecehelmetItem){
			
			return Constants.MODID + ":textures/armor/models/armor/enderfleece_layer_1.png";		
		}
		else
		{
		
		System.out.println("Invalid Item EnderFleeceArmor");
		return null;
		
		}
		
	}

	public String getName() {
		return name;
	}
}