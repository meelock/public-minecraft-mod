package com.youtube.inits;

import com.youtube.inits.items.ModPotion;
import com.youtube.inits.material.ToolMaterialHandler;
import com.youtube.inits.tools.ModAxe;
import com.youtube.inits.tools.ModHoe;
import com.youtube.inits.tools.ModPickaxe;
import com.youtube.inits.tools.ModSpade;
import com.youtube.inits.tools.ModSword;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;

public class ItemInits {
	public static Item sapphire;
	public static Item ruby;
	public static Item topaz;
	public static Item laphite;
	public static Item laphiteDust;
	
	public static Item sapphirePickaxe;
	public static Item sapphireSword;
	public static Item sapphireAxe;
	public static Item sapphireSpade;
	public static Item sapphireHoe;
	
	public static Item rubyPickaxe;
	public static Item rubySword;
	public static Item rubyAxe;
	public static Item rubySpade;
	public static Item rubyHoe;
	
	public static Item topazPickaxe;
	public static Item topazSword;
	public static Item topazAxe;
	public static Item topazSpade;
	public static Item topazHoe;
	
	public static Item emeraldPickaxe;
	public static Item emeraldSword;
	public static Item emeraldAxe;
	public static Item emeraldSpade;
	public static Item emeraldHoe;
	
	public static Item laphitePickaxe;
	public static Item laphiteSword;
	public static Item laphiteAxe;
	public static Item laphiteSpade;
	public static Item laphiteHoe;
	
//	public static Potion testPotion;
	
	public static void init(){
		sapphire = new Item().setCreativeTab(CreativeTabsHandler.tabModItems).setUnlocalizedName("sapphire");
		ruby = new Item().setCreativeTab(CreativeTabsHandler.tabModItems).setUnlocalizedName("ruby");
		topaz = new Item().setCreativeTab(CreativeTabsHandler.tabModItems).setUnlocalizedName("topaz");
		laphite = new Item().setCreativeTab(CreativeTabsHandler.tabModItems).setUnlocalizedName("laphite");
		laphiteDust = new Item().setCreativeTab(CreativeTabsHandler.tabModItems).setUnlocalizedName("laphiteDust");
		
		sapphirePickaxe = new ModPickaxe(ToolMaterialHandler.SAPPHIRE).setCreativeTab(CreativeTabsHandler.tabModTools).setUnlocalizedName("sapphirePickaxe");
		sapphireSword = new ModSword(ToolMaterialHandler.SAPPHIRE).setUnlocalizedName("sapphireSword").setCreativeTab(CreativeTabsHandler.tabModWeapons);
		sapphireAxe = new ModAxe(ToolMaterialHandler.SAPPHIRE).setUnlocalizedName("sapphireAxe").setCreativeTab(CreativeTabsHandler.tabModTools);
		sapphireSpade = new ModSpade(ToolMaterialHandler.SAPPHIRE).setUnlocalizedName("sapphireSpade").setCreativeTab(CreativeTabsHandler.tabModTools);
		sapphireHoe = new ModHoe(ToolMaterialHandler.SAPPHIRE).setUnlocalizedName("sapphireHoe").setCreativeTab(CreativeTabsHandler.tabModTools);
		
		rubyPickaxe = new ModPickaxe(ToolMaterialHandler.RUBY).setUnlocalizedName("rubyPickaxe").setCreativeTab(CreativeTabsHandler.tabModTools);
		rubySword = new ModSword(ToolMaterialHandler.RUBY).setUnlocalizedName("rubySword").setCreativeTab(CreativeTabsHandler.tabModWeapons);
		rubyAxe = new ModAxe(ToolMaterialHandler.RUBY).setUnlocalizedName("rubyAxe").setCreativeTab(CreativeTabsHandler.tabModTools);
		rubySpade = new ModSpade(ToolMaterialHandler.RUBY).setUnlocalizedName("rubySpade").setCreativeTab(CreativeTabsHandler.tabModTools);
		rubyHoe = new ModHoe(ToolMaterialHandler.RUBY).setUnlocalizedName("rubyHoe").setCreativeTab(CreativeTabsHandler.tabModTools);
		
		topazPickaxe = new ModPickaxe(ToolMaterialHandler.TOPAZ).setUnlocalizedName("topazPickaxe").setCreativeTab(CreativeTabsHandler.tabModTools);
		topazSword = new ModSword(ToolMaterialHandler.TOPAZ).setUnlocalizedName("topazSword").setCreativeTab(CreativeTabsHandler.tabModWeapons);
		topazAxe = new ModAxe(ToolMaterialHandler.TOPAZ).setUnlocalizedName("topazAxe").setCreativeTab(CreativeTabsHandler.tabModTools);
		topazSpade = new ModSpade(ToolMaterialHandler.TOPAZ).setUnlocalizedName("topazSpade").setCreativeTab(CreativeTabsHandler.tabModTools);
		topazHoe = new ModHoe(ToolMaterialHandler.TOPAZ).setUnlocalizedName("topazHoe").setCreativeTab(CreativeTabsHandler.tabModTools);
		
		emeraldPickaxe = new ModPickaxe(ToolMaterialHandler.EMERALD).setUnlocalizedName("emeraldPickaxe").setCreativeTab(CreativeTabsHandler.tabModTools);
		emeraldSword = new ModSword(ToolMaterialHandler.EMERALD).setUnlocalizedName("emeraldSword").setCreativeTab(CreativeTabsHandler.tabModWeapons);
		emeraldAxe = new ModAxe(ToolMaterialHandler.EMERALD).setUnlocalizedName("emeraldAxe").setCreativeTab(CreativeTabsHandler.tabModTools);
		emeraldSpade = new ModSpade(ToolMaterialHandler.EMERALD).setUnlocalizedName("emeraldSpade").setCreativeTab(CreativeTabsHandler.tabModTools);
		emeraldHoe = new ModHoe(ToolMaterialHandler.EMERALD).setUnlocalizedName("emeraldHoe").setCreativeTab(CreativeTabsHandler.tabModTools);
		
		laphitePickaxe = new ModPickaxe(ToolMaterialHandler.LAPHITE).setUnlocalizedName("laphitePickaxe").setCreativeTab(CreativeTabsHandler.tabModTools);
		laphiteSword = new ModSword(ToolMaterialHandler.LAPHITE).setUnlocalizedName("laphiteSword").setCreativeTab(CreativeTabsHandler.tabModWeapons);
		laphiteAxe = new ModAxe(ToolMaterialHandler.LAPHITE).setUnlocalizedName("laphiteAxe").setCreativeTab(CreativeTabsHandler.tabModTools);
		laphiteSpade = new ModSpade(ToolMaterialHandler.LAPHITE).setUnlocalizedName("laphiteSpade").setCreativeTab(CreativeTabsHandler.tabModTools);
		laphiteHoe = new ModHoe(ToolMaterialHandler.LAPHITE).setUnlocalizedName("laphiteHoe").setCreativeTab(CreativeTabsHandler.tabModTools);
	}
}
