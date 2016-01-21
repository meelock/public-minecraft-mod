package com.youtube.inits.blocks;

import java.util.Random;

import com.youtube.inits.ItemInits;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LaphireOre extends BaseBlock {
	public LaphireOre(Material mat, float hardness, float resistance, float light, String name, CreativeTabs tab){
		super(mat, hardness, resistance, light, name, tab);
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return fortune == 0 ? random.nextInt(3) + 1 : fortune == 1 ? random.nextInt(3) + 2 : fortune == 2 ? random.nextInt(5) + 1 : 3;
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return ItemInits.laphite;
	}
}
