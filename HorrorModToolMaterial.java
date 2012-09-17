package net.minecraft.src;

public enum HorrorModToolMaterial {

	REAPER(5, 650, 7.0F, 3, 10),
	IRON(2, 250, 6.0F, 2, 14),
	GRAVECOBBLE(2, 150, 4.5F, 2, 10);
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficencyOnProperMaterial;
	private final int damageVsEntity;
	private final int enchantiblility;
	
	
	private HorrorModToolMaterial(int par3, int par4, float par5, int par6, int par7) {
		this.harvestLevel = par3;
		this.maxUses = par4;
		this.efficencyOnProperMaterial = par5;
		this.damageVsEntity = par6;
		this.enchantiblility = par7;
	}
	
	public int getMaxhUses() {
		return this.maxUses;
	}
	
	public int getDamageVsEntity() {
		return this.damageVsEntity;
	}
	
	public int getHarvestLevel() {
		return this.harvestLevel;
	}
	
	public int getEnchantibility() {
		return this.enchantiblility;
	}
	
	public float getEfficencyOnProperMaterial() {
		return this.efficencyOnProperMaterial;
	}
	
}
