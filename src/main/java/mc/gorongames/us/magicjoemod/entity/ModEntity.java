package mc.gorongames.us.magicjoemod.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public final class ModEntity{
	
	public static Entity goldenjoeEntity;
	
	int randomId = EntityRegistry.findGlobalUniqueEntityId();
	EntityRegistry.registerGlobalEntityID(EntityGoldenJoe, Golden Joe, randomId);
	EntityRegistry.registerModEntity(EntityGoldenJoe, Golden Joe, randomId, magicjoemod.class, 64, 1, true);
	EntityRegistry.addSpawn(EntityGoldenJoe, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest);
	
	createEgg(randomId, solidColor, spotColor);
	
	public static void init(){
		
		goldenjoeEntity = new EntityGoldenJoe(0x000000, 0xCFDB4D);
		
	}
	
	
	
	private static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}
}