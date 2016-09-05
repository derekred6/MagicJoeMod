package mc.gorongames.us.magicjoemod.armor;

import mc.gorongames.us.magicjoemod.items.ItemEnderFleeceFabric;
import mc.gorongames.us.magicjoemod.items.ItemGoldenFleeceFabric;
import mc.gorongames.us.magicjoemod.items.ItemGoldenScraps;
import mc.gorongames.us.magicjoemod.items.ItemRainbowFleeceFabric;
import mc.gorongames.us.magicjoemod.items.ItemRainbowScraps;
import mc.gorongames.us.magicjoemod.items.ItemSquidFleeceFabric;
import mc.gorongames.us.magicjoemod.items.ItemWoolFabric;
import mc.gorongames.us.magicjoemod.lib.Constants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.ItemArmor;

public class ArmorRenderRegister {
	
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
	
	public static void registerArmorRenderer() {

		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		
		renderItem.getItemModelMesher().register(goldenfleecehelmetItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemGoldenFleeceHelmet) goldenfleecehelmetItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(goldenfleecechestItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemGoldenFleeceChest) goldenfleecechestItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(goldenfleeceleggingsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemGoldenFleeceLeggings) goldenfleeceleggingsItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(goldenfleecebootsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemGoldenFleeceBoots) goldenfleecebootsItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(rainbowfleecehelmetItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemRainbowFleeceHelmet) rainbowfleecehelmetItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(rainbowfleecechestItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemRainbowFleeceChest) rainbowfleecechestItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(rainbowfleeceleggingsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemRainbowFleeceLeggings) rainbowfleeceleggingsItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(rainbowfleecebootsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemRainbowFleeceBoots) rainbowfleecebootsItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(enderfleecehelmetItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemEnderFleeceHelmet) enderfleecehelmetItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(enderfleecechestItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemEnderFleeceChest) enderfleecechestItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(enderfleeceleggingsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemEnderFleeceLeggings) enderfleeceleggingsItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(enderfleecebootsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemEnderFleeceBoots) enderfleecebootsItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(squidfleecehelmetItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemSquidFleeceHelmet) squidfleecehelmetItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(squidfleecechestItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemSquidFleeceChest) squidfleecechestItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(squidfleeceleggingsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemSquidFleeceLeggings) squidfleeceleggingsItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(squidfleecebootsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemSquidFleeceBoots) squidfleecebootsItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(woolfleecehelmetItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemWoolFleeceHelmet) woolfleecehelmetItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(woolfleecechestItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemWoolFleeceChest) woolfleecechestItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(woolfleeceleggingsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemWoolFleeceLeggings) woolfleeceleggingsItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(woolfleecebootsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemWoolFleeceBoots) woolfleecebootsItem).getName(), "inventory"));
		
	}
}
