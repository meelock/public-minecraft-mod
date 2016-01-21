package com.youtube.world.gen;

import java.util.Random;

import com.youtube.inits.BlockInits;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenMod implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimensionId()){
		case -1:
			break;
		case 0:
			generateInWorld(BlockInits.rubyOre, world, random, chunkX*16, chunkZ*16, 5, 40, 1, 3, 4, Blocks.stone);
			generateInWorld(BlockInits.sapphireOre, world, random, chunkX*16, chunkZ*16, 5, 40, 1, 5, 3, Blocks.stone);
			generateInWorld(BlockInits.topazOre, world, random, chunkX*16, chunkZ*16, 5, 55, 5, 10, 10, Blocks.stone);
			generateInWorld(BlockInits.laphiteOre, world, random, chunkX*16, chunkZ*16, 1, 20, 1, 3, 1, Blocks.stone);
			break;
		case 1:
			break;
		}
	}
	
	public void generateInWorld(Block block, World world, Random random, int chunkX, int chunkZ, int minY, int maxY, int minvs, int maxvs, int chance, Block spawnIn){
		int heightRange = minY + (maxY - minY);
		int veinSize = minvs + maxvs;
		for(int i = 0; i < chance;i++){
			int x = chunkX + random.nextInt(16);
			int y = random.nextInt(heightRange);
			int z = chunkZ + random.nextInt(16);
			(new WorldGenMinable(block.getDefaultState(), veinSize)).generate(world, random, new BlockPos(x, y, z));
		}
	}
	
}
