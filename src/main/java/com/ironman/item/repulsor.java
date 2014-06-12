package com.ironman.item;


import com.ironman.entity.EntityRepulsor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class repulsor extends Item{

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player){
		if(!player.capabilities.isCreativeMode){
			--itemstack.stackSize;
		}
		world.playSoundAtEntity(player, "random.fizz", 0.7F, 0.8F);

		if(!world.isRemote){
			world.spawnEntityInWorld(new EntityRepulsor(world, player));
		}

		return itemstack;
	}
 public int getMaxItemUseDuration(ItemStack par1ItemStack)
{
    return 16;
}
}