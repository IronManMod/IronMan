package com.ironman.Entity;

import net.minecraft.entity.EntityList;

import com.ironman.main.mainclass;

import cpw.mods.fml.common.registry.EntityRegistry;

public class imEntity {

	public static void mainclass(){
		registerEntity();
		
	}

	public static void registerEntity(){
		
		createEntity(EntityRepulsor.class, "repulsor", 0x008521, 0x00FF08);
	}

	public static void createEntity(Class entityClass, String entityName, int solidColour, int spotColour){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();

		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, mainclass.modInstance, 64, 1, true);
		createEgg(randomId, solidColour, spotColour);
	}

	private static void createEgg(int randomId, int solidColour, int spotColour) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColour, spotColour));
	}
}