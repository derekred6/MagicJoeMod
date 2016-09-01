package mc.gorongames.us.magicjoemod.armor;

import mc.gorongames.us.magicjoemod.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemRainbowFleeceChest extends ItemArmor {

	private final String name = "rainbowfleecechest";
	
	public ItemRainbowFleeceChest(ArmorMaterial material, int armorType) {
		super(material, 0, armorType);
		setUnlocalizedName(Constants.MODID + "_" + name);
//		setTextureName(Constants.MODID + ":" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(CreativeTabs.tabTools);
		
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
	  player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 500, 4));
	  player.addPotionEffect(new PotionEffect(Potion.jump.id, 500, 4));
	  
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity,int slot, String type){

		if(stack.getItem() == ModArmor.rainbowfleecechestItem){
			
			return Constants.MODID + ":textures/armor/models/armor/rainbowfleece_layer_1.png";		
		}
		else
		{
		
		System.out.println("Invalid Item RainbowFleeceArmor");
		return null;
		
		}
		
	}

	public String getName() {
		return name;
	}
}