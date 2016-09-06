package mc.gorongames.us.magicjoemod.armor;

import mc.gorongames.us.magicjoemod.items.ItemGoldenScraps;
import mc.gorongames.us.magicjoemod.lib.Constants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public final class ModArmor {
	
	public static ItemArmor goldenfleecehelmetItem;
	public static ItemArmor goldenfleecechestItem;
	public static ItemArmor goldenfleeceleggingsItem;
	public static ItemArmor goldenfleecebootsItem;
	public static ItemArmor rainbowfleecehelmetItem;
	public static ItemArmor rainbowfleecechestItem;
	public static ItemArmor rainbowfleeceleggingsItem;
	public static ItemArmor rainbowfleecebootsItem;
	public static ItemArmor enderfleecehelmetItem;
	public static ItemArmor enderfleecechestItem;
	public static ItemArmor enderfleeceleggingsItem;
	public static ItemArmor enderfleecebootsItem;
	public static ItemArmor squidfleecehelmetItem;
	public static ItemArmor squidfleecechestItem;
	public static ItemArmor squidfleeceleggingsItem;
	public static ItemArmor squidfleecebootsItem;
	public static ItemArmor woolfleecehelmetItem;
	public static ItemArmor woolfleecechestItem;
	public static ItemArmor woolfleeceleggingsItem;
	public static ItemArmor woolfleecebootsItem;
	
	static ArmorMaterial GoldenArmorMaterial = EnumHelper.addArmorMaterial("GoldenArmorMaterial", "GoldenArmor", 66, new int[]{6, 16, 12, 6}, 20);
	static ArmorMaterial RainbowArmorMaterial = EnumHelper.addArmorMaterial("RainbowArmorMaterial", "RainbowArmor", 66, new int[]{6, 16, 12, 6}, 20);
	static ArmorMaterial EnderArmorMaterial = EnumHelper.addArmorMaterial("EnderArmorMaterial", "EnderArmor", 23, new int[]{3, 9, 8, 3}, 20);
	static ArmorMaterial SquidArmorMaterial = EnumHelper.addArmorMaterial("SquidArmorMaterial", "SquidArmor", 30, new  int[]{3, 9, 8, 3}, 20);
	static ArmorMaterial WoolArmorMaterial = EnumHelper.addArmorMaterial("WoolArmorMaterial", "WoolArmor", 5, new int[]{1, 3, 2, 1}, 15);
	
	public static void preinit(){
		
		goldenfleecehelmetItem = new ItemGoldenFleeceHelmet(GoldenArmorMaterial, 0);
		goldenfleecechestItem = new ItemGoldenFleeceChest(GoldenArmorMaterial, 1);
		goldenfleeceleggingsItem = new ItemGoldenFleeceLeggings(GoldenArmorMaterial, 2);
		goldenfleecebootsItem = new ItemGoldenFleeceBoots(GoldenArmorMaterial, 3);
		rainbowfleecehelmetItem = new ItemRainbowFleeceHelmet(RainbowArmorMaterial, 0);
		rainbowfleecechestItem = new ItemRainbowFleeceChest(RainbowArmorMaterial, 1);
		rainbowfleeceleggingsItem = new ItemRainbowFleeceLeggings(RainbowArmorMaterial, 2);
		rainbowfleecebootsItem = new ItemRainbowFleeceBoots(RainbowArmorMaterial, 3);
		enderfleecehelmetItem = new ItemEnderFleeceHelmet(EnderArmorMaterial, 0);
		enderfleecechestItem = new ItemEnderFleeceChest(EnderArmorMaterial, 1);
		enderfleeceleggingsItem = new ItemEnderFleeceLeggings(EnderArmorMaterial, 2);
		enderfleecebootsItem = new ItemEnderFleeceBoots(EnderArmorMaterial, 3);
		squidfleecehelmetItem = new ItemSquidFleeceHelmet(SquidArmorMaterial, 0);
		squidfleecechestItem = new ItemSquidFleeceChest(SquidArmorMaterial, 1);
		squidfleeceleggingsItem = new ItemSquidFleeceLeggings(SquidArmorMaterial, 2);
		squidfleecebootsItem = new ItemSquidFleeceBoots(SquidArmorMaterial, 3);
		woolfleecehelmetItem = new ItemWoolFleeceHelmet(WoolArmorMaterial, 0);
		woolfleecechestItem = new ItemWoolFleeceChest(WoolArmorMaterial, 1);
		woolfleeceleggingsItem = new ItemWoolFleeceLeggings(WoolArmorMaterial, 2);
		woolfleecebootsItem = new ItemWoolFleeceBoots(WoolArmorMaterial, 3);
		
	}
	
	public static void init() {
		
	}
}
