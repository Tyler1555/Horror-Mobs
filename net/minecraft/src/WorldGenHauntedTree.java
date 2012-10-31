package net.minecraft.src;

import java.util.Random;

public class WorldGenHauntedTree extends WorldGenerator {
	
	public WorldGenHauntedTree() {
		
	}
    
    public boolean generate(World world, Random random, int par3, int par4, int par5) {
    	if(world.getBlockId(par3, par4, par5)!=mod_HorrorMobs.DeadGrass.blockID) {
    		return false;
    	}
    	int block = mod_HorrorMobs.RottenLog.blockID;
    	world.setBlockWithNotify(par3, par4, par5, block);
    	world.setBlockWithNotify(par3, par4 + 1, par5, block);
    	world.setBlockWithNotify(par3, par4 + 2, par5, block);
    	world.setBlockWithNotify(par3, par4 + 3, par5, block);
    	world.setBlockWithNotify(par3, par4 + 4, par5, block);
    	world.setBlockWithNotify(par3 + 1, par4 + 3, par5, block);
    	world.setBlockWithNotify(par3 + -1, par4 + 3, par5, block);
    	return true;
    }
}
