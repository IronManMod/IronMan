package com.ironman.main;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class imWorld {
	public static void mainclass(){
		initialiseWorldGen();
	}

	public static void initialiseWorldGen(){
		registerWorldGen(new WorldGenOre(), 1);
	}

	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProberblity){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProberblity);
	}
}