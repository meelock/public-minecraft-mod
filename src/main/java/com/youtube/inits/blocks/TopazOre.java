package com.youtube.inits.blocks;

import java.util.Random;

import com.youtube.inits.ItemInits;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TopazOre extends BaseBlock{
	public TopazOre(Material mat, float hardness, float resistance, float light, String name, CreativeTabs tab, int quantity){
		super(mat, hardness, resistance, light, name, tab, quantity);
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return quantity;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ItemInits.topaz;
	}
}
