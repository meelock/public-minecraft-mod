package com.youtube.inits.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaseBlock extends Block{
	public int quantity, harvest;
	public String tool;
	
	public BaseBlock(Material mat, float hardness, float resistance, float light, String name, CreativeTabs tab){
		this(mat, hardness, resistance, light, name, tab, 0, null, 0, null);
	}
	
	public BaseBlock(Material mat, float hardness, float resistance, float light, String name, CreativeTabs tab, int quantity){
		this(mat, hardness, resistance, light, name, tab, quantity, null, 0, null);
	}
	
	public BaseBlock(Material mat, float hardness, float resistance, float light, String name, CreativeTabs tab, int quantity, Item dropItem){
		this(mat, hardness, resistance, light, name, tab, quantity, dropItem, 0, null);
	}
	
	public BaseBlock(Material mat, float hardness, float resistance, float light, String name, CreativeTabs tab, int quantity, Item dropItem, int harvest, String tool){
		super(mat);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(light);
		this.setCreativeTab(tab);
		this.setUnlocalizedName(name);
		
		this.quantity = quantity;
		this.harvest = harvest;
		this.tool = tool;
	}
}
