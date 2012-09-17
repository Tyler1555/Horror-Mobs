package net.minecraft.src;

public class HorrorModArmor extends ItemArmor {

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public final int armorType;
	public final int damageReduceAmount;
	public final int renderIndex;
	
	private final HorrorModMaterial material;
	 
    public HorrorModArmor(int i, HorrorModMaterial enumarmormaterial, int j, int k)
    {
        super(i, EnumArmorMaterial.CHAIN, j, k);
        material = enumarmormaterial;
        armorType = k;
        renderIndex = j;
        damageReduceAmount = enumarmormaterial.getDamageReductionAmount(k);
        setMaxDamage(enumarmormaterial.getDamageReductionAmount(k));
        maxStackSize = 1;
    }
 
    public int getItemEnchantability()
    {
        return material.getEnchantiblility();
    }
 
    static int[] getMaxDamageArray()
    {
        return maxDamageArray;
    }
	
}
