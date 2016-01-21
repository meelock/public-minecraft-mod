package com.youtube.proxy;

import com.youtube.inits.BlockInits;
import com.youtube.inits.ItemInits;
import com.youtube.registers.Registers;

public class ClientProxy{
	public void register(){
		BlockInits.init();
		ItemInits.init();
		Registers.init();
	}
}
