package com.ironman.main;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.common.MinecraftForge;

import com.ironman.Entity.EntityRepulsor;
import com.ironman.block.imblock;
import com.ironman.main.item.imitem;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;


public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(EntityRepulsor.class, new RenderSnowball(imitem.repulsor));

	}

	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	
	}
	

	
	}

