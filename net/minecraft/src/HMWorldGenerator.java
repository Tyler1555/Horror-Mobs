package net.minecraft.src;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;

public class HMWorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		for(int a = 1; a <= 8; a++) {
			for(int b = 1; b <= 8; b++) {
			world.setBlockWithNotify(chunkX + b, 16 + a, chunkZ +b, mod_HorrorMobs.GraveCobble.blockID);
			}
		}
		world.setBlockTileEntity(chunkX, 16, chunkZ, new TileEntitySummoningTable());
	}

}
