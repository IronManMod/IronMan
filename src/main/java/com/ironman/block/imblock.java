package com.ironman.block;

import com.ironman.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class IMBlock {
	
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
		titaniumore = new TitaniumOre(Material.iron).setBlockName("TitaniumOre").setCreativeTab(CreativeTabs.tabBlock).setHardness(2.5F).setResistance(5F).setBlockTextureName(Strings.MODID + ":TitaniumOre");titaniumore.setHarvestLevel("pickaxe", 2);
		copperore = new CopperOre(Material.iron).setBlockName("CopperOre").setCreativeTab(CreativeTabs.tabBlock).setHardness(2.5F).setResistance(5F).setBlockTextureName(Strings.MODID + ":CopperOre");copperore.setHarvestLevel("pickaxe", 2);
		palladiumore = new PalladiumOre(Material.iron).setBlockName("PalladiumOre").setCreativeTab(CreativeTabs.tabBlock).setHardness(3F).setResistance(5F).setBlockTextureName(Strings.MODID + ":PalladiumOre");palladiumore.setHarvestLevel("pickaxe", 2);
		vibraniumore = new VibraniumOre(Material.iron).setBlockName("VibraniumOre").setCreativeTab(CreativeTabs.tabBlock).setHardness(3F).setResistance(5F).setBlockTextureName(Strings.MODID + ":VibraniumOre");vibraniumore.setHarvestLevel("pickaxe", 2);
		
		
	}
	
	public static void registerBlock(){
		GameRegistry.registerBlock(titaniumore, titaniumore.getUnlocalizedName());
		GameRegistry.registerBlock(copperore, copperore.getUnlocalizedName());
		GameRegistry.registerBlock(palladiumore, palladiumore.getUnlocalizedName());
		



	}
}
