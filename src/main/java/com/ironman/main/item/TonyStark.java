package com.ironman.main.item;

import com.ironman.lib.Strings;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TonyStark extends ItemArmor {
	
	public TonyStark(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		// TODO Auto-generated constructor stub
	}


	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if (stack.getItem() == imitem.TonyStarkHeadgear || stack.getItem() == imitem.palladiumarc || stack.getItem() == imitem.TonyStarkshoes) {
			return Strings.MODID + ":textures/armor/TonyStark_1.png";
		}else if(stack.getItem() == imitem.palladiumarc){
			return Strings.MODID + ":textures/armor/TonyStark_2.png";
		}else{
			return null;
		}
	}

	
		
				
				
				

				
		
		
	}
	
			