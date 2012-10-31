package net.minecraft.src;

public class GhostGlass extends Block {

	public GhostGlass(int i, int j) {
		super(i, j, Material.glass);
	}
	
	public int quantityDropped() {
		return 0;
	}
	
	public int getRenderBlockPass() {
		return 0;
	}
	
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	protected boolean canSilkHarvest() {
		return false;
	}
	
}
