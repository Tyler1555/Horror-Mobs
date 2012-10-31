package net.minecraft.src;

import java.util.Random;

public class WorldGenCrypt extends WorldGenerator {

	public WorldGenCrypt() {
		
	}
	
	public boolean generate(World world, Random random, int x, int y, int z) {
		if(world.getBlockId(x, y, z)!=Block.grass.blockID) {
    		return false;
    	}
		int gravecobble = mod_HorrorMobs.GraveCobble.blockID;
		int glass = Block.glass.blockID;
		int stairs = Block.stairsBrick.blockID;
		//Floor Gen
		world.setBlockWithNotify(x, y, z, gravecobble);
		world.setBlockWithNotify(x + 1, y, z, gravecobble);
		world.setBlockWithNotify(x + 2, y, z, gravecobble);
		world.setBlockWithNotify(x + 3, y, z, gravecobble);
		world.setBlockWithNotify(x + 4, y, z, gravecobble);
		world.setBlockWithNotify(x, y, z + 1, gravecobble);
		world.setBlockWithNotify(x + 1, y, z + 1, gravecobble);
		world.setBlockWithNotify(x + 2, y, z + 1, gravecobble);
		world.setBlockWithNotify(x + 3, y, z + 1, gravecobble);
		world.setBlockWithNotify(x + 4, y, z + 1, gravecobble);
		world.setBlockWithNotify(x, y, z + 2, gravecobble);
		world.setBlockWithNotify(x + 1, y, z + 2, gravecobble);
		world.setBlockWithNotify(x + 2, y, z + 2, gravecobble);
		world.setBlockWithNotify(x + 3, y, z + 2, gravecobble);
		world.setBlockWithNotify(x + 4, y, z + 2, gravecobble);
		world.setBlockWithNotify(x, y, z + 2, gravecobble);
		world.setBlockWithNotify(x + 1, y, z + 3, gravecobble);
		world.setBlockWithNotify(x + 2, y, z + 3, gravecobble);
		world.setBlockWithNotify(x + 3, y, z + 3, gravecobble);
		world.setBlockWithNotify(x + 4, y, z + 3, gravecobble);
		world.setBlockWithNotify(x, y, z + 4, gravecobble);
		world.setBlockWithNotify(x + 1, y, z + 4, gravecobble);
		world.setBlockWithNotify(x + 2, y, z + 4, gravecobble);
		world.setBlockWithNotify(x + 3, y, z + 4, gravecobble);
		world.setBlockWithNotify(x + 4, y, z + 4, gravecobble);
		//Pillar gen side 1
		world.setBlockWithNotify(x, y + 1, z, gravecobble);
		world.setBlockWithNotify(x, y + 2, z, gravecobble);
		world.setBlockWithNotify(x, y + 3, z, gravecobble);
		world.setBlockWithNotify(x, y + 4, z, gravecobble);
		world.setBlockWithNotify(x, y + 5, z, gravecobble);
		world.setBlockWithNotify(x + 1, y + 1, z, glass);
		world.setBlockWithNotify(x + 1, y + 2, z, glass);
		world.setBlockWithNotify(x + 1, y + 3, z, glass);
		world.setBlockWithNotify(x + 1, y + 4, z, glass);
		world.setBlockWithNotify(x + 1, y + 5, z, glass);
		world.setBlockWithNotify(x + 2, y + 1, z, gravecobble);
		world.setBlockWithNotify(x + 2, y + 2, z, gravecobble);
		world.setBlockWithNotify(x + 2, y + 3, z, gravecobble);
		world.setBlockWithNotify(x + 2, y + 4, z, gravecobble);
		world.setBlockWithNotify(x + 2, y + 5, z, gravecobble);
		world.setBlockWithNotify(x + 3, y + 1, z, glass);
		world.setBlockWithNotify(x + 3, y + 2, z, glass);
		world.setBlockWithNotify(x + 3, y + 3, z, glass);
		world.setBlockWithNotify(x + 3, y + 4, z, glass);
		world.setBlockWithNotify(x + 3, y + 5, z, glass);
		world.setBlockWithNotify(x + 4, y + 1, z, gravecobble);
		world.setBlockWithNotify(x + 4, y + 2, z, gravecobble);
		world.setBlockWithNotify(x + 4, y + 3, z, gravecobble);
		world.setBlockWithNotify(x + 4, y + 4, z, gravecobble);
		world.setBlockWithNotify(x + 4, y + 5, z, gravecobble);
		//Pillar Gen side 2
		world.setBlockWithNotify(x + 4, y + 1, z, glass);
		world.setBlockWithNotify(x + 4, y + 2, z, glass);
		world.setBlockWithNotify(x + 4, y + 3, z, glass);
		world.setBlockWithNotify(x + 4, y + 4, z, glass);
		world.setBlockWithNotify(x + 4, y + 5, z, glass);
		world.setBlockWithNotify(x + 4, y + 1, z + -1, gravecobble);
		world.setBlockWithNotify(x + 4, y + 2, z + -1, gravecobble);
		world.setBlockWithNotify(x + 4, y + 3, z + -1, gravecobble);
		world.setBlockWithNotify(x + 4, y + 4, z + -1, gravecobble);
		world.setBlockWithNotify(x + 4, y + 5, z + -1, gravecobble);
		world.setBlockWithNotify(x + 4, y + 1, z + -2, glass);
		world.setBlockWithNotify(x + 4, y + 2, z + -2, glass);
		world.setBlockWithNotify(x + 4, y + 3, z + -2, glass);
		world.setBlockWithNotify(x + 4, y + 4, z + -2, glass);
		world.setBlockWithNotify(x + 4, y + 5, z + -2, glass);
		world.setBlockWithNotify(x + 4, y + 1, z + -3, gravecobble);
		world.setBlockWithNotify(x + 4, y + 2, z + -3, gravecobble);
		world.setBlockWithNotify(x + 4, y + 3, z + -3, gravecobble);
		world.setBlockWithNotify(x + 4, y + 4, z + -3, gravecobble);
		world.setBlockWithNotify(x + 4, y + 5, z + -3, gravecobble);
		world.setBlockWithNotify(x + 4, y + 1, z + -4, glass);
		world.setBlockWithNotify(x + 4, y + 2, z + -4, glass);
		world.setBlockWithNotify(x + 4, y + 3, z + -4, glass);
		world.setBlockWithNotify(x + 4, y + 4, z + -4, glass);
		world.setBlockWithNotify(x + 4, y + 5, z + -4, glass);
		return true;
	}
	
}
