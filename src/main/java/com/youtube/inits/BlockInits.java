package com.youtube.inits;

import com.youtube.inits.blocks.LaphireOre;
import com.youtube.inits.blocks.RubyOre;
import com.youtube.inits.blocks.SapphireOre;
import com.youtube.inits.blocks.TopazOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockInits {
	public static Block sapphireOre;
	public static Block rubyOre;
	public static Block topazOre;
	public static Block laphiteOre;
	
	public static void init(){
		sapphireOre = new SapphireOre(Material.rock, 5F, 5F, 0.2F, "sapphireOre", CreativeTabsHandler.tabModBlocks, 3);
		rubyOre = new RubyOre(Material.rock, 6F, 8F, 0.125F, "rubyOre", CreativeTabsHandler.tabModBlocks);
		topazOre = new TopazOre(Material.rock, 5F, 10F, 0.0F, "topazOre", CreativeTabsHandler.tabModBlocks, 3);
		laphiteOre = new LaphireOre(Material.rock, 10F, 10F, 1F, "laphiteOre", CreativeTabsHandler.tabModBlocks);
	}
}
