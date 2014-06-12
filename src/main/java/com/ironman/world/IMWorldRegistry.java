package com.ironman.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class IMWorldRegistry {

	public static void initialiseWorldGen(){
		registerWorldGen(new WorldGenOre(), 1);
	}

	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProberblity){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProberblity);
	}
}