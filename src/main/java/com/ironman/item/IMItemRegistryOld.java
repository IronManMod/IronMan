package com.ironman.item;

import com.ironman.Constants;
import com.ironman.IronMan;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class IMItemRegistryOld {

	public static void registerAll() {
		initialiseItem();
		registerItem();
	}

	 //armor item
	public static Item Mark2Helmet;
    public static Item Mark2Chestplate;
    public static Item Mark2Leggings;
    public static Item Mark2Boots;
   	public static Item Mark3Helmet;
    public static Item Mark3Chestplate;
    public static Item Mark3Leggings;
    public static Item Mark3Boots;
    public static Item Mark1Helmet;
    public static Item Mark1Chestplate;
    public static Item Mark1Leggings;
    public static Item Mark1Boots;
    public static Item TonyStarkHeadgear;
    public static Item TonyStarkshoes;
    
    //armor material
    public static ArmorMaterial Mark1ArmorMaterial = EnumHelper.addArmorMaterial("Mark1 Armor Material", 33, new int[]{2, 5, 4, 2}, 10);
    public static ArmorMaterial Mark2ArmorMaterial = EnumHelper.addArmorMaterial("Mark2 Armor Material", 33, new int[]{2, 5, 4, 2}, 10);
    public static ArmorMaterial Mark3ArmorMaterial = EnumHelper.addArmorMaterial("Mark3 Armor Material", 33, new int[]{2, 5, 4, 2}, 10);
    public static ArmorMaterial TonyStark = EnumHelper.addArmorMaterial("Tony Stark", 33, new int[]{0, 0, 0, 0}, 0);

    //items
		public static Item titaniumingot;
	    public static Item copperingot;
	    public static Item palladiumfragment;
	    public static Item goldtitaniumalloy;
	    public static Item copperwire;
	    public static Item voicechip;
	    public static Item microchip;
	    public static Item JARVISchip;
	    public static Item vibraniummolecule;
	    public static Item screen;
	    public static Item titaniumplate;
	    public static Item booster;
	    public static Item palladiumcore;
	    public static Item vibraniumcore;
	    public static Item palladiumarc;
	    public static Item vibraniumarc;
	    public static Item advancedbooster;
	    public static Item ironplate;
	    public static Item titaniumalloy;
	    public static Item rocket;
	    public static Item repulsor;

	
public static void initialiseItem() {
	//define items
	titaniumingot = new Item().setUnlocalizedName("titaniumingot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":titaniumingot");
    copperingot = new Item().setUnlocalizedName("copperingot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":copperingot");
    palladiumfragment = new Item().setUnlocalizedName("palladiumfragment").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":palladiumfragment");
    goldtitaniumalloy = new Item().setUnlocalizedName("goldtitaniumalloy").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":goldtitaniumalloy");
    copperwire = new Item().setUnlocalizedName("copperwire").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":copperwire");
    voicechip = new Item().setUnlocalizedName("voicechip").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":voicechip");
    microchip = new Item().setUnlocalizedName("microchip").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":microchip");
    JARVISchip = new Item().setUnlocalizedName("JARVISchip").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":JARVISchip");
    vibraniummolecule = new Item().setUnlocalizedName("vibraniummolecule").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":vibraniummolecule");
    screen = new Item().setUnlocalizedName("screen").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":screen");
    titaniumplate = new Item().setUnlocalizedName("titaniumplate").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":titaniumplate");
    booster = new Item().setUnlocalizedName("booster").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":booster");
    vibraniumcore = new Item().setUnlocalizedName("vibraniumcore").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":vibraniumcore");
    palladiumcore = new Item().setUnlocalizedName("palladiumcore").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":palladiumcore");
    palladiumarc = new Item().setUnlocalizedName("palladiumarc").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":palladiumarc");
    vibraniumarc = new Item().setUnlocalizedName("vibraniumarc").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":vibraniumarc");
    advancedbooster = new Item().setUnlocalizedName("advancedbooster").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":advancedbooster");
    ironplate = new Item().setUnlocalizedName("ironplate").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":ironplate");
    titaniumalloy = new Item().setUnlocalizedName("titaniumalloy").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":titaniumalloy");
    rocket = new Item().setUnlocalizedName("rocket").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(Constants.MODID + ":rocket");
    repulsor = new repulsor().setUnlocalizedName("repulsor").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Constants.MODID + ":repulsor");

    //define armor
	Mark2Helmet = new Mark2Armor(Mark2ArmorMaterial, IronMan.proxy.addArmor("Mark2Armor"), 0).setUnlocalizedName("Mark2Helmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Constants.MODID + ":Mark2Helmet");
	Mark2Chestplate = new Mark2Armor(Mark2ArmorMaterial, IronMan.proxy.addArmor("Mark2Armor"), 1).setUnlocalizedName("Mark2Chestplate").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Constants.MODID + ":Mark2Chestplate");
	Mark2Leggings = new Mark2Armor(Mark2ArmorMaterial, IronMan.proxy.addArmor("Mark2Armor"), 2).setUnlocalizedName("Mark2Leggings").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Constants.MODID + ":Mark2Leggings");
	Mark2Boots = new Mark2Armor(Mark2ArmorMaterial, IronMan.proxy.addArmor("Mark2Armor"), 3).setUnlocalizedName("Mark2Boots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Constants.MODID + ":Mark2Boots");
	Mark3Helmet = new Mark3Armor(Mark3ArmorMaterial, IronMan.proxy.addArmor("Mark3Armor"), 0).setUnlocalizedName("Mark3Helmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Constants.MODID + ":Mark3Helmet");
	Mark3Chestplate = new Mark3Armor(Mark3ArmorMaterial, IronMan.proxy.addArmor("Mark3Armor"),1).setUnlocalizedName("Mark3Chestplate").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Constants.MODID + ":Mark3Chestplate");
	Mark3Leggings = new Mark3Armor(Mark3ArmorMaterial, IronMan.proxy.addArmor("Mark3Armor"), 2).setUnlocalizedName("Mark3Leggings").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Constants.MODID + ":Mark3Leggings");
	Mark3Boots = new Mark3Armor(Mark3ArmorMaterial, IronMan.proxy.addArmor("Mark3Armor"), 3).setUnlocalizedName("Mark3Boots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Constants.MODID + ":Mark3Boots");
	Mark1Helmet = new Mark1Armor(Mark1ArmorMaterial, IronMan.proxy.addArmor("Mark1Armor"), 0).setUnlocalizedName("Mark1Helmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Constants.MODID + ":Mark1Helmet");
	Mark1Chestplate = new Mark1Armor(Mark1ArmorMaterial, IronMan.proxy.addArmor("Mark1Armor"),1).setUnlocalizedName("Mark1Chestplate").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Constants.MODID + ":Mark1Chestplate");
	Mark1Leggings = new Mark1Armor(Mark1ArmorMaterial, IronMan.proxy.addArmor("Mark1Armor"), 2).setUnlocalizedName("Mark1Leggings").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Constants.MODID + ":Mark1Leggings");
	Mark1Boots = new Mark1Armor(Mark1ArmorMaterial, IronMan.proxy.addArmor("Mark1Armor"), 3).setUnlocalizedName("Mark1Boots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Constants.MODID + ":Mark1Boots");
	TonyStarkHeadgear = new TonyStark(TonyStark, IronMan.proxy.addArmor("TonyStark"), 0).setUnlocalizedName("TonyStarkHeadgear").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Constants.MODID + ":TonyStarkHeadgear");
	vibraniumarc = new TonyStark(TonyStark, IronMan.proxy.addArmor("TonyStark"), 1).setUnlocalizedName("vibraniumarc").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Constants.MODID + ":vibranumarc");
	palladiumarc = new TonyStark(TonyStark, IronMan.proxy.addArmor("TonyStark"), 1).setUnlocalizedName("palladiumarc").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Constants.MODID + ":palladiumarc");
	TonyStarkshoes = new TonyStark(TonyStark, IronMan.proxy.addArmor("TonyStark"), 3).setUnlocalizedName("TonyStarkshoes").setCreativeTab(CreativeTabs.tabCombat).setTextureName(Constants.MODID + ":TonyStarkshoes");
}

	


public static void registerItem() {

	GameRegistry.registerItem(titaniumingot, titaniumingot.getUnlocalizedName());
	GameRegistry.registerItem(copperingot, copperingot.getUnlocalizedName());
	GameRegistry.registerItem(palladiumfragment, palladiumfragment.getUnlocalizedName());
	GameRegistry.registerItem(goldtitaniumalloy, goldtitaniumalloy.getUnlocalizedName());
	GameRegistry.registerItem(copperwire, copperwire.getUnlocalizedName());
	GameRegistry.registerItem(voicechip, voicechip.getUnlocalizedName());
	GameRegistry.registerItem(microchip, microchip.getUnlocalizedName());
	GameRegistry.registerItem(JARVISchip, JARVISchip.getUnlocalizedName());
	GameRegistry.registerItem(screen, screen.getUnlocalizedName());
	GameRegistry.registerItem(titaniumplate, titaniumplate.getUnlocalizedName());
	GameRegistry.registerItem(booster, booster.getUnlocalizedName());
	GameRegistry.registerItem(palladiumcore, palladiumcore.getUnlocalizedName());
	GameRegistry.registerItem(palladiumarc, palladiumarc.getUnlocalizedName());
	GameRegistry.registerItem(advancedbooster, advancedbooster.getUnlocalizedName());
	GameRegistry.registerItem(ironplate, ironplate.getUnlocalizedName());
	GameRegistry.registerItem(titaniumalloy, titaniumalloy.getUnlocalizedName());
	GameRegistry.registerItem(rocket, rocket.getUnlocalizedName());
	GameRegistry.registerItem(repulsor, repulsor.getUnlocalizedName());

//register armor
	GameRegistry.registerItem(Mark2Helmet, Mark2Helmet.getUnlocalizedName());
	GameRegistry.registerItem(Mark2Chestplate, Mark2Chestplate.getUnlocalizedName());
	GameRegistry.registerItem(Mark2Leggings, Mark2Leggings.getUnlocalizedName());
	GameRegistry.registerItem(Mark2Boots, Mark2Boots.getUnlocalizedName());
	GameRegistry.registerItem(Mark3Helmet, Mark3Helmet.getUnlocalizedName());
	GameRegistry.registerItem(Mark3Chestplate, Mark3Chestplate.getUnlocalizedName());
	GameRegistry.registerItem(Mark3Leggings, Mark3Leggings.getUnlocalizedName());
	GameRegistry.registerItem(Mark3Boots, Mark3Boots.getUnlocalizedName());
	GameRegistry.registerItem(Mark1Helmet, Mark1Helmet.getUnlocalizedName());
	GameRegistry.registerItem(Mark1Chestplate, Mark1Chestplate.getUnlocalizedName());
	GameRegistry.registerItem(Mark1Leggings, Mark1Leggings.getUnlocalizedName());
	GameRegistry.registerItem(Mark1Boots, Mark1Boots.getUnlocalizedName());
	


}
	
}
