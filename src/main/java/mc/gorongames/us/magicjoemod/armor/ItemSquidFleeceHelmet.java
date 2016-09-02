package mc.gorongames.us.magicjoemod.armor;

import mc.gorongames.us.magicjoemod.magicjoemod;
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

public class ItemSquidFleeceHelmet extends ItemArmor {
	
	private final String name = "squidfleecehelmet";
	
	public ItemSquidFleeceHelmet(ArmorMaterial material, int armorType) {
		super(material, 0, armorType);
		setUnlocalizedName(Constants.MODID + "_" + name);
//		setTextureName(Constants.MODID + ":" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(MagicJoeTab.tabMagicJoe);
		
	}
	
	
	
//	@Override
//	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
		
//		super.onArmorTick(world, player, armor);
//		ItemStack boots = player.inventory.armorInventory[0];
//		ItemStack pants = player.inventory.armorInventory[1];
//		ItemStack chest = player.inventory.armorInventory[2];
//		ItemStack head = player.inventory.armorInventory[3];
//		
//		if(boots != null && pants != null && chest != null)
//			if(boots.getItem() == ((ItemSquidFleeceBoots) squidfleeceboots).getname() && pants.getItem() == squidfleeceleggings && chest.getItem() == squidfleecechest)
//				player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 0));
//		
//	  player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 500, 4));
//	  player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 500, 4));
//	  
//	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity,int slot, String type){

		if(stack.getItem() == ModArmor.squidfleecehelmetItem){
			
			return Constants.MODID + ":textures/armor/models/armor/squidfleece_layer_1.png";		
		}
		else
		{
		
		System.out.println("Invalid Item SquidFleeceArmor");
		return null;
		
		}
		
	}

	public String getName() {
		return name;
	}
}