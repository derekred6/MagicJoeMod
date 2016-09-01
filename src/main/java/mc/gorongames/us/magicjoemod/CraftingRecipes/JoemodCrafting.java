package mc.gorongames.us.magicjoemod.CraftingRecipes;

import mc.gorongames.us.magicjoemod.armor.ModArmor;
import mc.gorongames.us.magicjoemod.blocks.ModBlocks;
import mc.gorongames.us.magicjoemod.items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class JoemodCrafting{
	
	public static void init(){
		
	GameRegistry.addRecipe(new ItemStack(ModItems.goldenfleecefabricItem, 1), new Object[]{
		"   ",
        "SS ",
        "SS ",
        'S', ModItems.goldenscrapsItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.goldenfleeceBlock, 1), new Object[]{
		"   ",
		"GG ",
		"GG ",
		'G', ModItems.goldenfleecefabricItem
		});
	
	GameRegistry.addRecipe(new ItemStack(ModItems.goldenfleecefabricItem, 4), new Object[]{
		"   ",
		"   ",
		"B  ",
		'B', ModBlocks.goldenfleeceBlock
	});
	
	GameRegistry.addRecipe(new ItemStack(ModItems.rainbowfleecefabricItem, 1), new Object[]{
		"   ",
		"SS ",
		"SS ",
		'S', ModItems.rainbowscrapsItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.rainbowfleeceBlock, 1), new Object[]{
		"   ",
		"RR ",
		"RR ",
		'R', ModItems.rainbowfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModItems.rainbowfleecefabricItem, 4), new Object[]{
		"   ",
		"   ",
		"B  ",
		'B', ModBlocks.rainbowfleeceBlock
	});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.enderfleeceBlock, 1), new Object[]{
		"   ",
		"EE ",
		"EE ",
		'E', ModItems.enderfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModItems.enderfleecefabricItem, 4), new Object[]{
		"   ",
		"   ",
		"B  ",
		'B', ModBlocks.enderfleeceBlock
	});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.squidfleeceBlock, 1), new Object[]{
		"   ",
		"QQ ",
		"QQ ",
		'Q', ModItems.squidfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModItems.squidfleecefabricItem, 4), new Object[]{
		"   ",
		"   ",
		"B  ",
		'B', ModBlocks.squidfleeceBlock
	});
	
	GameRegistry.addRecipe(new ItemStack(Blocks.wool, 1), new Object[]{
		"   ",
		"FF ",
		"FF ",
		'F', ModItems.woolfabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModItems.woolfabricItem, 4), new Object[]{
		"   ",
		"   ",
		"B  ",
		'B', Blocks.wool
	});
		
	GameRegistry.addRecipe(new ItemStack(ModArmor.goldenfleecehelmetItem, 1), new Object[]{
		"FFF",
		"F F",
		"   ",
		'F', ModItems.goldenfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.goldenfleecechestItem, 1), new Object[]{
		"F F",
		"FFF",
		"FFF",
		'F', ModItems.goldenfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.goldenfleeceleggingsItem, 1), new Object[]{
		"FFF",
		"F F",
		"F F",
		'F', ModItems.goldenfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.goldenfleecebootsItem, 1), new Object[]{
		"   ",
		"F F",
		"F F",
		'F', ModItems.goldenfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.rainbowfleecehelmetItem, 1), new Object[]{
		"FFF",
		"F F",
		"   ",
		'F', ModItems.rainbowfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.rainbowfleecechestItem, 1), new Object[]{
		"F F",
		"FFF",
		"FFF",
		'F', ModItems.rainbowfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.rainbowfleeceleggingsItem, 1), new Object[]{
		"FFF",
		"F F",
		"F F",
		'F', ModItems.rainbowfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.rainbowfleecebootsItem, 1), new Object[]{
		"   ",
		"F F",
		"F F",
		'F', ModItems.rainbowfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.enderfleecehelmetItem, 1), new Object[]{
		"FFF",
		"F F",
		"   ",
		'F', ModItems.enderfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.enderfleecechestItem, 1), new Object[]{
		"F F",
		"FFF",
		"FFF",
		'F', ModItems.enderfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.enderfleeceleggingsItem, 1), new Object[]{
		"FFF",
		"F F",
		"F F",
		'F', ModItems.enderfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.enderfleecebootsItem, 1), new Object[]{
		"   ",
		"F F",
		"F F",
		'F', ModItems.enderfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.squidfleecehelmetItem, 1), new Object[]{
		"FFF",
		"F F",
		"   ",
		'F', ModItems.squidfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.squidfleecechestItem, 1), new Object[]{
		"F F",
		"FFF",
		"FFF",
		'F', ModItems.squidfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.squidfleeceleggingsItem, 1), new Object[]{
		"FFF",
		"F F",
		"F F",
		'F', ModItems.squidfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.squidfleecebootsItem, 1), new Object[]{
		"   ",
		"F F",
		"F F",
		'F', ModItems.squidfleecefabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.woolfleecehelmetItem, 1), new Object[]{
		"FFF",
		"F F",
		"   ",
		'F', ModItems.woolfabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.woolfleecechestItem, 1), new Object[]{
		"F F",
		"FFF",
		"FFF",
		'F', ModItems.woolfabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.woolfleeceleggingsItem, 1), new Object[]{
		"FFF",
		"F F",
		"F F",
		'F', ModItems.woolfabricItem
	});
	
	GameRegistry.addRecipe(new ItemStack(ModArmor.woolfleecebootsItem, 1), new Object[]{
		"   ",
		"F F",
		"F F",
		'F', ModItems.woolfabricItem
	});
	
	}
	
}