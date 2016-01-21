package com.youtube.registers;

import com.youtube.inits.BlockInits;
import com.youtube.inits.CraftingRecipeHandler;
import com.youtube.inits.ItemInits;
import com.youtube.main.References;
import com.youtube.world.gen.WorldGenMod;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Registers {
	public static void init(){
		register();
		registerRecipes();
		registerWorld();
	}
	
	public static void register(){
		registerBlocks(BlockInits.sapphireOre);
		registerRender(BlockInits.sapphireOre);
		registerBlocks(BlockInits.rubyOre);
		registerRender(BlockInits.rubyOre);
		registerBlocks(BlockInits.topazOre);
		registerRender(BlockInits.topazOre);
		registerBlocks(BlockInits.laphiteOre);
		registerRender(BlockInits.laphiteOre);
		
		registerItems(ItemInits.sapphire);
		registerRender(ItemInits.sapphire);
		registerItems(ItemInits.ruby);
		registerRender(ItemInits.ruby);
		registerItems(ItemInits.topaz);
		registerRender(ItemInits.topaz);
		registerItems(ItemInits.laphite);
		registerRender(ItemInits.laphite);
		registerItems(ItemInits.laphiteDust);
		registerRender(ItemInits.laphiteDust);
		
		registerItems(ItemInits.sapphirePickaxe);
		registerRender(ItemInits.sapphirePickaxe);
		registerItems(ItemInits.sapphireSword);
		registerRender(ItemInits.sapphireSword);
		registerItems(ItemInits.sapphireAxe);
		registerRender(ItemInits.sapphireAxe);
		registerItems(ItemInits.sapphireSpade);
		registerRender(ItemInits.sapphireSpade);
		registerItems(ItemInits.sapphireHoe);
		registerRender(ItemInits.sapphireHoe);
		
		registerItems(ItemInits.rubyPickaxe);
		registerRender(ItemInits.rubyPickaxe);
		registerItems(ItemInits.rubySword);
		registerRender(ItemInits.rubySword);
		registerItems(ItemInits.rubyAxe);
		registerRender(ItemInits.rubyAxe);
		registerItems(ItemInits.rubySpade);
		registerRender(ItemInits.rubySpade);
		registerItems(ItemInits.rubyHoe);
		registerRender(ItemInits.rubyHoe);
		
		registerItems(ItemInits.topazPickaxe);
		registerRender(ItemInits.topazPickaxe);
		registerItems(ItemInits.topazSword);
		registerRender(ItemInits.topazSword);
		registerItems(ItemInits.topazAxe);
		registerRender(ItemInits.topazAxe);
		registerItems(ItemInits.topazSpade);
		registerRender(ItemInits.topazSpade);
		registerItems(ItemInits.topazHoe);
		registerRender(ItemInits.topazHoe);
		
		registerItems(ItemInits.emeraldPickaxe);
		registerRender(ItemInits.emeraldPickaxe);
		registerItems(ItemInits.emeraldSword);
		registerRender(ItemInits.emeraldSword);
		registerItems(ItemInits.emeraldAxe);
		registerRender(ItemInits.emeraldAxe);
		registerItems(ItemInits.emeraldSpade);
		registerRender(ItemInits.emeraldSpade);
		registerItems(ItemInits.emeraldHoe);
		registerRender(ItemInits.emeraldHoe);
		
		registerItems(ItemInits.laphitePickaxe);
		registerRender(ItemInits.laphitePickaxe);
		registerItems(ItemInits.laphiteSword);
		registerRender(ItemInits.laphiteSword);
		registerItems(ItemInits.laphiteAxe);
		registerRender(ItemInits.laphiteAxe);
		registerItems(ItemInits.laphiteSpade);
		registerRender(ItemInits.laphiteSpade);
		registerItems(ItemInits.laphiteHoe);
		registerRender(ItemInits.laphiteHoe);
	}
	
	public static void registerWorld(){
		GameRegistry.registerWorldGenerator(new WorldGenMod(), 1);
	}
	
	public static void registerRecipes(){
		CraftingRecipeHandler.registerRecipe(ItemInits.laphiteDust, new Item[]{ItemInits.laphite});
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
