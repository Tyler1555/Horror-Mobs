package net.minecraft.src;

import java.util.Random;

public class DeadGrass extends Block {

	public DeadGrass(int i) {
		super(i, Material.grass);
	}
	
	public int quantityDropped(Random random) {
		return 1;
	}
	
	public int idDropped(int i, Random random, int j) {
		return mod_HorrorMobs.DeadGrass.blockID;
	}
	
	public int getBlockTextureFromSideAndMetaData(int i, int j) {
		if(i == 0) {
			return mod_HorrorMobs.grasstexture;
		}
		if(i == 1) {
			return mod_HorrorMobs.grasstop;
		}
		if(i == 2) {
			return mod_HorrorMobs.grasstexture;
		}
		if(i == 3) {
			return mod_HorrorMobs.grasstexture;
		}
		if(i == 4) {
			return mod_HorrorMobs.grasstexture;
		}
		if(i == 5) {
			return mod_HorrorMobs.grasstexture;
		}
		if(j == 1) {
			return 116;
		}
		return j != 2 ? 20 : 177;
	}
	
}
