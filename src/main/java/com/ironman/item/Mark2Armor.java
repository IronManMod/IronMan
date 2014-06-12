package com.ironman.item;

import com.ironman.Constants;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

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
	        
	       
	     if (((boots.getItem() == IMItemRegistryOld.Mark2Boots ? 1 : 0) | (legs.getItem() == IMItemRegistryOld.Mark2Leggings ? 1 : 0) | (plate.getItem() == IMItemRegistryOld.Mark2Chestplate ? 1 : 0) | (helmet.getItem() == IMItemRegistryOld.Mark2Helmet ? 1 : 0)) != 0)
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
    		
    		if (stack.getItem() == IMItemRegistryOld.Mark2Helmet || stack.getItem() == IMItemRegistryOld.Mark2Chestplate || stack.getItem() == IMItemRegistryOld.Mark2Boots) {
    			return Constants.MODID + ":textures/armor/Mark2_1.png";
    		}else if(stack.getItem() == IMItemRegistryOld.Mark2Leggings){
    			return Constants.MODID + ":textures/armor/Mark2_2.png";
    		}else{
    			return null;
    		}
    	}
}