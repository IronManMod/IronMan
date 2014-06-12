package com.ironman;


import com.ironman.item.IMItemRegistryOld;
import net.minecraft.client.renderer.entity.RenderSnowball;

import com.ironman.entity.EntityRepulsor;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ServerProxy {

	public void registerRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(EntityRepulsor.class, new RenderSnowball(IMItemRegistryOld.repulsor));

	}
	
	public int addArmor(String armor){
		return 0;
	}
		
		
		public void registerNetworkStuff(){
		
		}

		public void registerTileEntities(){
		}
	}
	