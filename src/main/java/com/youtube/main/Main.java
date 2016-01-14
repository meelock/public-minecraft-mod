package com.youtube.main;

import com.youtube.proxy.ClientProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(name=References.MODNAME, version=References.VERISON, modid=References.MODID)
public class Main {
	
	@SidedProxy(clientSide="com.youtube.proxy.ClientProxy", serverSide="com.youtube.proxy.CommonProxy")
	public static ClientProxy proxy = new ClientProxy();
	
	@EventHandler
	public static void preinit(FMLInitializationEvent e){
		proxy.register();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent e){
		
	}
	
	@EventHandler
	public static void postinit(FMLInitializationEvent e){
		
	}
}
