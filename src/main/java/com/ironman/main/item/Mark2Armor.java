package com.ironman.main.item;

import com.ironman.lib.Strings;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class Mark2Armor extends ItemArmor{
        
	 public Mark2Armor(ArmorMaterial parMaterial, int parRender, int parType) {
         super(parMaterial, parRender, parType);
 }
                                         
	 public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
	        if ((player.getCurrentArmor(3) != null) && (player.getCurrentArmor(2) != null) && (player.getCurrentArmor(1) != null) && (player.getCurrentArmor(0) != null))
	{
	             ItemStack helmet = player.getCurrentArmor(3);
	             ItemStack plate = player.getCurrentArmor(2);
	             ItemStack legs = player.getCurrentArmor(1);
	             ItemStack boots = player.getCurrentArmor(0);
	        
	       
	     if (((boots.getItem() == imitem.Mark2Boots ? 1 : 0) | (legs.getItem() == imitem.Mark2Leggings ? 1 : 0) | (plate.getItem() == imitem.Mark2Chestplate ? 1 : 0) | (helmet.getItem() == imitem.Mark2Helmet ? 1 : 0)) != 0)        
	{
	player.capabilities.allowFlying = true;
	player.fallDistance = 0.0F;
	player.capabilities.setFlySpeed(0.2F);
	player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 100, 0));
	player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 100, 0));
	}
	}
	else if (!player.capabilities.isCreativeMode)
	{
	player.capabilities.allowFlying = false;
	}

	}
	

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
    		
    		if (stack.getItem() == imitem.Mark2Helmet || stack.getItem() == imitem.Mark2Chestplate || stack.getItem() == imitem.Mark2Boots) {
    			return Strings.MODID + ":textures/armor/Mark2_1.png";
    		}else if(stack.getItem() == imitem.Mark2Leggings){
    			return Strings.MODID + ":textures/armor/Mark2_2.png";
    		}else{
    			return null;
    		}
    	}
}