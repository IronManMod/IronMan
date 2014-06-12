package com.ironman.main;


import ibxm.Player;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

import com.ironman.Entity.imEntity;
import com.ironman.block.imblock;
import com.ironman.lib.Strings;
import com.ironman.main.item.imitem;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version)

public class mainclass {
	
	@SidedProxy(clientSide = "com.ironman.main.ClientProxy", serverSide = "com.ironman.main.ServerProxy")
	public static ServerProxy proxy; 
	

	
	
	@Instance(Strings.MODID)
	public static mainclass modInstance;
	
	
	
	/**
	 * Loads before
	 * @param PreEvent
	 */
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		imitem.mainclass();
		imblock.mainclass();
		imWorld.mainclass();
		imEntity.mainclass();
		imcraftingmanager.mainclass();
		
		
		proxy.registerRenderThings();
		
		proxy.registerTileEntities();

	}
	
	


	

	/**
	 * Loads during
	 * @param event
	 */
	@EventHandler
	public static void load(FMLInitializa tionEvent event){
		proxy.registerNetworkStuff();
	}
	
	/*
	 * Loads after
	 * @param PostEvent
	 */
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
	}
	
	
}
