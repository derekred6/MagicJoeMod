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
	
	public static void registerArmorRenderer() {

		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		
		renderItem.getItemModelMesher().register(ModArmor.goldenfleecehelmetItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemGoldenFleeceHelmet) ModArmor.goldenfleecehelmetItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.goldenfleecechestItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemGoldenFleeceChest) ModArmor.goldenfleecechestItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.goldenfleeceleggingsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemGoldenFleeceLeggings) ModArmor.goldenfleeceleggingsItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.goldenfleecebootsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemGoldenFleeceBoots) ModArmor.goldenfleecebootsItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.rainbowfleecehelmetItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemRainbowFleeceHelmet) ModArmor.rainbowfleecehelmetItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.rainbowfleecechestItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemRainbowFleeceChest) ModArmor.rainbowfleecechestItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.rainbowfleeceleggingsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemRainbowFleeceLeggings) ModArmor.rainbowfleeceleggingsItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.rainbowfleecebootsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemRainbowFleeceBoots) ModArmor.rainbowfleecebootsItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.enderfleecehelmetItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemEnderFleeceHelmet) ModArmor.enderfleecehelmetItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.enderfleecechestItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemEnderFleeceChest) ModArmor.enderfleecechestItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.enderfleeceleggingsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemEnderFleeceLeggings) ModArmor.enderfleeceleggingsItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.enderfleecebootsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemEnderFleeceBoots) ModArmor.enderfleecebootsItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.squidfleecehelmetItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemSquidFleeceHelmet) ModArmor.squidfleecehelmetItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.squidfleecechestItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemSquidFleeceChest) ModArmor.squidfleecechestItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.squidfleeceleggingsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemSquidFleeceLeggings) ModArmor.squidfleeceleggingsItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.squidfleecebootsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemSquidFleeceBoots) ModArmor.squidfleecebootsItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.woolfleecehelmetItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemWoolFleeceHelmet) ModArmor.woolfleecehelmetItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.woolfleecechestItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemWoolFleeceChest) ModArmor.woolfleecechestItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.woolfleeceleggingsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemWoolFleeceLeggings) ModArmor.woolfleeceleggingsItem).getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModArmor.woolfleecebootsItem, 0, new ModelResourceLocation(Constants.MODID + ":" + ((ItemWoolFleeceBoots) ModArmor.woolfleecebootsItem).getName(), "inventory"));
		
	}
}
