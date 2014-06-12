package com.ironman.block;

import java.util.Random;

import com.ironman.main.item.imitem;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class vibraniumore extends Block {

	protected vibraniumore(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	}


public Item getItemDropped(int metadata, Random rand, int fortune)
{
	return imitem.vibraniummolecule;
	
}
}