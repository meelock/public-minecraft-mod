package com.youtube.inits;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRecipeHandler {
	public static void registerRecipe(Item output, String s1, String s2, String s3, char c1, Item item1){
		GameRegistry.addRecipe(new ItemStack(output), new Object[]{
				s1, s2, s3, c1, item1
		});
	}
	
	public static void registerRecipe(Item output, String s1, String s2, String s3, char c1, Item item1, char c2, Item item2){
		GameRegistry.addRecipe(new ItemStack(output), new Object[]{
				s1, s2, s3, c1, item1, c2, item2
		});
	}
	
	public static void registerRecipe(Item output, String s1, String s2, String s3, char c1, Item item1, char c2, Item item2, char c3, Item item3){
		GameRegistry.addRecipe(new ItemStack(output), new Object[]{
				s1, s2, s3, c1, item1, c2, item2, c3, item3
		});
	}
	
	public static void registerRecipe(Block output, String s1, String s2, String s3, char c1, Item item1){
		GameRegistry.addRecipe(new ItemStack(output), new Object[]{
				s1, s2, s3, c1, item1
		});
	}
	
	public static void registerRecipe(Block output, String s1, String s2, String s3, char c1, Item item1, char c2, Item item2){
		GameRegistry.addRecipe(new ItemStack(output), new Object[]{
				s1, s2, s3, c1, item1, c2, item2
		});
	}
	
	public static void registerRecipe(Block output, String s1, String s2, String s3, char c1, Item item1, char c2, Item item2, char c3, Item item3){
		GameRegistry.addRecipe(new ItemStack(output), new Object[]{
				s1, s2, s3, c1, item1, c2, item2, c3, item3
		});
	}
	
	public static void registerRecipe(Block output, Item...items){
		GameRegistry.addShapelessRecipe(new ItemStack(output), (Object[]) items);
	}
	
	public static void registerRecipe(Item output, Item...items){
		GameRegistry.addShapelessRecipe(new ItemStack(output), (Object[]) items);
	}
	
	public static void registerBrewing(Item input, Item ingredient, Item output){
		BrewingRecipeRegistry.addRecipe(new ItemStack(input), new ItemStack(ingredient), new ItemStack(output));
	}
}
