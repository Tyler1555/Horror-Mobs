package net.minecraft.src;

public class SoulBottle extends Item {

	public SoulBottle(int par1, int par2) {
		super(par1);
	}
	
	public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }
	
	public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.epic;
    }
	
}
