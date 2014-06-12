package com.ironman.main.item;

import com.ironman.lib.Strings;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class Mark1Armor extends ItemArmor {
	
	public Mark1Armor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		// TODO Auto-generated constructor stub
	}


	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if (stack.getItem() == imitem.Mark1Helmet || stack.getItem() == imitem.Mark1Chestplate || stack.getItem() == imitem.Mark1Boots) {
			return Strings.MODID + ":textures/armor/Mark1_1.png";
		}else if(stack.getItem() == imitem.Mark1Leggings){
			return Strings.MODID + ":textures/armor/Mark1_2.png";
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
			if(helmet.getItem() == imitem.Mark1Helmet && plate.getItem() == imitem.Mark1Chestplate && pants.getItem() == imitem.Mark1Leggings && boots.getItem() == imitem.Mark1Boots){
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
