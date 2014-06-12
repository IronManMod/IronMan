package com.ironman.item;

import com.ironman.lib.Strings;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class TonyStark extends ItemArmor {
	
	public TonyStark(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		// TODO Auto-generated constructor stub
	}


	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if (stack.getItem() == IMItemRegistryOld.TonyStarkHeadgear || stack.getItem() == IMItemRegistryOld.palladiumarc || stack.getItem() == IMItemRegistryOld.TonyStarkshoes) {
			return Strings.MODID + ":textures/armor/TonyStark_1.png";
		}else if(stack.getItem() == IMItemRegistryOld.palladiumarc){
			return Strings.MODID + ":textures/armor/TonyStark_2.png";
		}else{
			return null;
		}
	}

	
		
				
				
				

				
		
		
	}
	
			