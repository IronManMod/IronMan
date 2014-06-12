package com.ironman.block;

import com.ironman.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class imblock {
	
	public static void mainclass(){
		initialiseBlock();
		registerBlock();
	}
	
		public static Block titaniumore;
	    public static Block copperore;
	    public static Block palladiumore;
	    public static Block vibraniumore;
	    
	    //compressor
	    
	
	public static void initialiseBlock(){
		titaniumore = new titaniumore(Material.iron).setBlockName("titaniumore").setCreativeTab(CreativeTabs.tabBlock).setHardness(2.5F).setResistance(5F).setBlockTextureName(Strings.MODID + ":titaniumore");titaniumore.setHarvestLevel("pickaxe", 2);
		copperore = new copperore(Material.iron).setBlockName("copperore").setCreativeTab(CreativeTabs.tabBlock).setHardness(2.5F).setResistance(5F).setBlockTextureName(Strings.MODID + ":copperore");copperore.setHarvestLevel("pickaxe", 2);
		palladiumore = new palladiumore(Material.iron).setBlockName("palladiumore").setCreativeTab(CreativeTabs.tabBlock).setHardness(3F).setResistance(5F).setBlockTextureName(Strings.MODID + ":palladiumore");palladiumore.setHarvestLevel("pickaxe", 2);
		vibraniumore = new vibraniumore(Material.iron).setBlockName("vibraniumore").setCreativeTab(CreativeTabs.tabBlock).setHardness(3F).setResistance(5F).setBlockTextureName(Strings.MODID + ":vibraniumore");vibraniumore.setHarvestLevel("pickaxe", 2);
		
		
	}
	
	public static void registerBlock(){
		GameRegistry.registerBlock(titaniumore, titaniumore.getUnlocalizedName());
		GameRegistry.registerBlock(copperore, copperore.getUnlocalizedName());
		GameRegistry.registerBlock(palladiumore, palladiumore.getUnlocalizedName());
		



	}
}
