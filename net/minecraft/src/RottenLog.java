package net.minecraft.src;

import java.util.Random;

public class RottenLog extends Block {

	public RottenLog(int i, int j) {
		super(i, j, Material.wood);
	}
	
	public int quantityDropped(Random random) {
		return 1;
	}
	
	public int idDropped(int i, Random random, int j) {
		return mod_HorrorMobs.RottenLog.blockID;
	}
	
}
