package net.minecraft.src;

import java.util.Random;

public class HorrorModSword extends HorrorModTools
{
 
    private static Block blocksEffectiveAgainst[];
 
    protected HorrorModSword(int i, HorrorModToolMaterial enumtoolmaterial)
    {
        super(i, 3, enumtoolmaterial);
    }
    public void randomDisplayTick(World world, int i, int j, int k, Random random)
    {
        int l = world.getBlockMetadata(i, j, k);
        double d = (float)i + 0.5F;
        double d1 = (float)j + 0.7F;
        double d2 = (float)k + 0.5F;
        double d3 = 0.2199999988079071D;
        double d4 = 0.27000001072883606D;
        
    }
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        return par2Block.blockID == Block.web.blockID ? 15.0F : 1.5F;
    }
 
    static 
    {
        blocksEffectiveAgainst = (new Block[] {
            Block.planks, Block.bookShelf, Block.wood, Block.chest, Block.pumpkin, Block.pumpkinLantern
        });
    }
}