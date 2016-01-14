package com.youtube.proxy;

import com.youtube.inits.BlockInits;
import com.youtube.registers.Registers;

public class ClientProxy{
	public void register(){
		BlockInits.init();
		Registers.register();
	}
}
