package net.minecraft.src;

public enum HorrorModMaterial {

	Reaper(30, new int[]{3, 7, 5, 3}, 25);
	
	private int maxDamageFactor;
	private int damageReductionArray[];
	private int enchantibility;
	
	
	private HorrorModMaterial(int par3, int[] par4IntArray, int par5) {
		this.maxDamageFactor = par3;
		this.damageReductionArray = par4IntArray;
		this.enchantibility = par5;
	}
	
	public int getDurability(int par1) {
		return HorrorModArmor.getMaxDamageArray()[par1] * this.maxDamageFactor;
	}
	
	public int getDamageReductionAmount(int par1) {
		return this.damageReductionArray[par1];
	}
	
	public int getEnchantiblility() {
		return this.enchantibility;
	}
}
