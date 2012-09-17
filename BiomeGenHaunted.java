package net.minecraft.src;

public class BiomeGenHaunted extends BiomeGenBase {
	
	public BiomeGenHaunted(int par1) {
		super(par1);
		spawnableCreatureList.clear();
		theBiomeDecorator.treesPerChunk = 0;
		theBiomeDecorator.grassPerChunk = 0;
		theBiomeDecorator.reedsPerChunk = 0;
		theBiomeDecorator.deadBushPerChunk = 0;
		theBiomeDecorator.cactiPerChunk = 0;
		waterColorMultiplier = 0x242424;
		topBlock = (byte)mod_HorrorMobs.DeadGrass.blockID;
		fillerBlock = (byte)mod_HorrorMobs.GraveCobble.blockID;
	}
	
}
