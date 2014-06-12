package com.ironman.item;

import com.ironman.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IMItemRegistry {

    public enum Items{
        TITANIUM_INGOT(Item.class, "titaniumingot", CreativeTabs.tabMaterials, Constants.MODID + ":titaniumingot"),
        COPPER_INGOT(Item.class, "copperingot", CreativeTabs.tabMaterials, Constants.MODID + ":copperingot"),
        PALLADIUM_FRAGMENT(Item.class, "palladiumfragment", CreativeTabs.tabMaterials, Constants.MODID + ":palladiumfragment"),
        GOLD_TITANIUM_ALLOY(Item.class, "goldtitaniumalloy", CreativeTabs.tabMaterials, Constants.MODID + ":goldtitaniumalloy"),
        COPPER_WIRE(Item.class, "copperwire", CreativeTabs.tabMaterials, Constants.MODID + ":copperwire"),
        VOICE_CHIP(Item.class, "voicechip", CreativeTabs.tabMaterials, Constants.MODID + ":voicechip"),
        MICRO_CHIP(Item.class, "microchip", CreativeTabs.tabMaterials, Constants.MODID + ":microchip"),
        JARVIS_CHIP(Item.class, "JARVISchip", CreativeTabs.tabMaterials, Constants.MODID + ":JARVISchip"),
        VIBRANIUM_MOLECULE(Item.class, "vibraniummolecule", CreativeTabs.tabMaterials, Constants.MODID +":vibraniummolecule"),
        ; //TODO: implement other items.



        private Class<? extends Item> clazz;
        private String unlocalizedName;
        private CreativeTabs creativeTab;
        private String textureName;


        private Items(Class<? extends Item> clazz, String unlocalizedName, CreativeTabs creativeTab, String textureName){
            this.clazz = clazz;
            this.unlocalizedName = unlocalizedName;
            this.creativeTab = creativeTab;
            this.textureName = textureName;
        }

        public Class<? extends Item> getClazz() {
            return clazz;
        }

        public void setClazz(Class<? extends Item> clazz) {
            this.clazz = clazz;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }

        public void setUnlocalizedName(String unlocalizedName) {
            this.unlocalizedName = unlocalizedName;
        }

        public CreativeTabs getCreativeTab() {
            return creativeTab;
        }

        public void setCreativeTab(CreativeTabs creativeTab) {
            this.creativeTab = creativeTab;
        }

        public String getTextureName() {
            return textureName;
        }

        public void setTextureName(String textureName) {
            this.textureName = textureName;
        }
    }

}
