package com.ironman.block;

import com.ironman.item.IMItemRegistryOld;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class VibraniumOre extends Block {

	protected VibraniumOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	}


public Item getItemDropped(int metadata, Random rand, int fortune)
{
	return IMItemRegistryOld.vibraniummolecule;
	
}
}