package com.ironman.main.item;

import ibxm.Player;

import com.ironman.lib.Strings;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class Mark3Armor extends ItemArmor {
	
	public Mark3Armor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		// TODO Auto-generated constructor stub
	}

	

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if (stack.getItem() == imitem.Mark3Helmet || stack.getItem() == imitem.Mark3Chestplate || stack.getItem() == imitem.Mark3Boots) {
			return Strings.MODID + ":textures/armor/Mark3_1.png";
		}else if(stack.getItem() == imitem.Mark3Leggings){
			return Strings.MODID + ":textures/armor/Mark3_2.png";
		}else{
			return null;
		}
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
        if ((player.getCurrentArmor(3) != null) && (player.getCurrentArmor(2) != null) && (player.getCurrentArmor(1) != null) && (player.getCurrentArmor(0) != null))
{
             ItemStack helmet = player.getCurrentArmor(3);
             ItemStack plate = player.getCurrentArmor(2);
             ItemStack legs = player.getCurrentArmor(1);
             ItemStack boots = player.getCurrentArmor(0);
        
       
     if (((boots.getItem() == imitem.Mark3Boots ? 1 : 0) | (legs.getItem() == imitem.Mark3Leggings ? 1 : 0) | (plate.getItem() == imitem.Mark3Chestplate ? 1 : 0) | (helmet.getItem() == imitem.Mark3Helmet ? 1 : 0)) != 0)        
{
player.capabilities.allowFlying = true;
player.fallDistance = 0.0F;

player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 100, 0));
player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 100, 0));
player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 100, 0));
player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 100, 1));
}
}
else if (!player.capabilities.isCreativeMode)
{
player.capabilities.allowFlying = false;
}

}



	private void spawnParticle(String string, float f, float g, float h) {
		// TODO Auto-generated method stub
		
	}
}