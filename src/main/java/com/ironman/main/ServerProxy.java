package com.ironman.main;


import net.minecraft.client.renderer.entity.RenderSnowball;

import com.ironman.Entity.EntityRepulsor;

import com.ironman.main.item.imitem;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ServerProxy {

	public void registerRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(EntityRepulsor.class, new RenderSnowball(imitem.repulsor));

	}
	
	public int addArmor(String armor){
		return 0;
	}
		
		
		public void registerNetworkStuff(){
		
		}

		public void registerTileEntities(){
		}
	}
	