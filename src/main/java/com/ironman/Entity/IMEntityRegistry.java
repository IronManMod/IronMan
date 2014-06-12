package com.ironman.entity;

import com.ironman.IronMan;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;

public enum IMEntityRegistry {

    REPULSOR(EntityRepulsor.class, "repulsor", 0x008521, 0x00FF08);


    private Class<? extends Entity> clazz;
    private String name;
    private int solidColour;
    private int spotColour;

    private IMEntityRegistry(Class<? extends Entity> clazz, String name, int solidColour, int spotColour) {
        this.clazz = clazz;
        this.name = name;
        this.solidColour = solidColour;
        this.spotColour = spotColour;
    }

    public Class<? extends Entity> getEntityClass() {
        return clazz;
    }

    public void setEntityClass(Class<? extends Entity> clazz) {
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSolidColour() {
        return solidColour;
    }

    public void setSolidColour(int solidColour) {
        this.solidColour = solidColour;
    }

    public int getSpotColour() {
        return spotColour;
    }

    public void setSpotColour(int spotColour) {
        this.spotColour = spotColour;
    }

    public static void registerEntities(){
		for (IMEntityRegistry entity : IMEntityRegistry.values()){
            createEntity(entity.getEntityClass(), entity.getName(), entity.getSolidColour(), entity.getSpotColour());
        }
	}

	public static void createEntity(Class entityClass, String entityName, int solidColour, int spotColour){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();

		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, IronMan.modInstance, 64, 1, true);
		createEgg(randomId, solidColour, spotColour);
	}

	private static void createEgg(int randomId, int solidColour, int spotColour) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColour, spotColour));
	}
}