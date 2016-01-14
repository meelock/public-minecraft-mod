package com.youtube.inits;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockInits {
	public static Block sapphireOre;
	public static Block rubyOre;
	public static Block topazOre;
	
	public static void init(){
		sapphireOre = new BaseBlock(Material.rock, 5F, 5F, 0.2F, "sapphireOre", CreativeTabs.tabBlock);
		rubyOre = new BaseBlock(Material.rock, 6F, 8F, 0.125F, "rubyOre", CreativeTabs.tabBlock);
		topazOre = new BaseBlock(Material.rock, 5F, 10F, 0.0F, "topazOre", CreativeTabs.tabBlock);
	}
}
