package mc.gorongames.us.magicjoemod.entity;

import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.LanguageRegistry;

public class ModEntity {
	
	public static void preInit() {
		
	}
	
	public static void init() {
		
		EntityRegistry.registerGlobalEntityID(sheepTest.class, "SheepTest", ModLoader.getUniqueEntityId(), 230, 78);
		LanguageRegistry.instance().addStringLocalization("entity.SheepTest.name", "en_US", "Epic Mob");
		EntityRegistry.addSpawn(sheepTest.class, 5, 1, 2, EnumCreatureType.creature, TutorialMain.TutorialBiome); //Go to the biome tutorial here
		
	}
	
	public static void postInit() {
		
	}

}
