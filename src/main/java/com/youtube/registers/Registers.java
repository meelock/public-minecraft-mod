package com.youtube.registers;

import com.youtube.inits.BlockInits;
import com.youtube.main.References;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Registers {
	public static void register(){
		registerBlocks(BlockInits.sapphireOre);
		registerRender(BlockInits.sapphireOre);
		registerBlocks(BlockInits.rubyOre);
		registerRender(BlockInits.rubyOre);
		registerBlocks(BlockInits.topazOre);
		registerRender(BlockInits.topazOre);
	}
	
	public static void registerBlocks(Block block){
		GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
	}
	
	public static void registerItems(Item item){
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Block block){
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(References.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(References.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
