package com.youtube.inits;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsHandler {
	public static CreativeTabs tabModBlocks = new CreativeTabs(12, "blocksTab"){
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(BlockInits.sapphireOre);
		}
	};
	
	public static CreativeTabs tabModItems = new CreativeTabs(13, "itemsTab"){
		@Override
		public Item getTabIconItem() {
			return ItemInits.sapphire;
		}
	};
	
	public static CreativeTabs tabModWeapons = new CreativeTabs(14, "weaponsTab"){
		@Override
		public Item getTabIconItem() {
			return ItemInits.sapphireSword;
		}
	};
	
	public static CreativeTabs tabModTools = new CreativeTabs(15, "toolsTab"){
		@Override
		public Item getTabIconItem() {
			return ItemInits.sapphirePickaxe;
		}
	};
	
}
