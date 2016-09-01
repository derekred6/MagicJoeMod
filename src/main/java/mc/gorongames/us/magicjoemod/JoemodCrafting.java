package mc.gorongames.us.magicjoemod;

import mc.gorongames.us.magicjoemod.items.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class JoemodCrafting{
	
	public static void init(){
		
	GameRegistry.addRecipe(new ItemStack(ModItems.goldenfleecefabricItem, 1), new Object[]{
		"   ",
        "II ",
        "II ",
        'I', ModItems.goldenscrapsItem   
 });
	}
}
