package net.minecraft.src;

import java.util.Random;

public class GraveCobble extends Block {

	public GraveCobble(int i, int j) {
		super(i, j, Material.rock);
	}
	
	public int quantityDropped(Random random) {
		return 1;
	}
	
	public int idDropped(int i, int j, Random random) {
		return mod_HorrorMobs.GraveCobble.blockID;
	}
	
}
