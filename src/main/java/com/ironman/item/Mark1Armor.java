package com.ironman.item;

import com.ironman.Constants;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Mark1Armor extends ItemArmor {
	
	public Mark1Armor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		// TODO Auto-generated constructor stub
	}


	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if (stack.getItem() == IMItemRegistryOld.Mark1Helmet || stack.getItem() == IMItemRegistryOld.Mark1Chestplate || stack.getItem() == IMItemRegistryOld.Mark1Boots) {
			return Constants.MODID + ":textures/armor/Mark1_1.png";
		}else if(stack.getItem() == IMItemRegistryOld.Mark1Leggings){
			return Constants.MODID + ":textures/armor/Mark1_2.png";
		}else{
			return null;
		}
	}

	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if(player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(0) != null){
			ItemStack helmet = player.getCurrentArmor(3);
			ItemStack plate = player.getCurrentArmor(2);
			ItemStack pants = player.getCurrentArmor(1);
			ItemStack boots = player.getCurrentArmor(0);
			if(helmet.getItem() == IMItemRegistryOld.Mark1Helmet && plate.getItem() == IMItemRegistryOld.Mark1Chestplate && pants.getItem() == IMItemRegistryOld.Mark1Leggings && boots.getItem() == IMItemRegistryOld.Mark1Boots){
				//player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 100, 1));
				player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(),100, 0));
				player.addPotionEffect(new PotionEffect(Potion.resistance.getId(),100, 1));
				player.addPotionEffect(new PotionEffect(Potion.digSlowdown.getId(),100, 0));
				player.addPotionEffect(new PotionEffect(Potion.weakness.getId(),100, 1));
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(),100, 1));
                player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(),100, 1));

					
		
				
				{
				
			
			
				
			}
		}
	}
}
			}
