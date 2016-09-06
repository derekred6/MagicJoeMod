package mc.gorongames.us.magicjoemod.entity;

import mc.gorongames.us.magicjoemod.magicjoemod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntity {
	
	public static void preInit() { //aka create entity
		
	}
	
	public static void init() { //aka main aka register Entity
		createEntity(EntitySheepTest.class, "Sheep Test", 0x000000, 0xffffff);
		createEntity(EntityGoldenJoe.class, "Golden Joe", 0xf3f306, 0xe1c301);
		createEntity(EntityRainbowJoe.class, "Rainbow Joe", 0xffffff , 0xffffff);
		createEntity(EntityRainbowJoe.class, "Ender Joe", 0x0c0c0c, 0x000000);
		
	}
	
	public static void postInit() {
		
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, magicjoemod.modInstance, 64, 1, true);
		createEgg(randomId, solidColor, spotColor);
		
	}
	
	public static void createEgg(int randomId, int solidColor, int spotColor) {
		
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
		
	}

}
