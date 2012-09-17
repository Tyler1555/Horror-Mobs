package net.minecraft.src;

import java.util.Random;

public class HorrorModScythe extends HorrorModTools {

	 private static Block blocksEffectiveAgainst[];
	
	protected HorrorModScythe(int i, HorrorModToolMaterial enumtoolmaterial) {
		super(i, 4, enumtoolmaterial);
	}
	public boolean canHarvestBlock(Block block)
    {
        if(block == Block.snow)
        {
            return true;
        }
        return block == Block.blockSnow;
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
            Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, Block.tilledField, Block.slowSand, Block.mycelium, mod_HorrorMobs.DeadGrass,
            Block.planks, Block.bookShelf, Block.wood, Block.chest, Block.pumpkin, Block.pumpkinLantern
        });
    }
    
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7)
    {
        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6))
        {
            return false;
        }
        else
        {
            int var8 = par3World.getBlockId(par4, par5, par6);
            int var9 = par3World.getBlockId(par4, par5 + 1, par6);

            if ((par7 == 0 || var9 != 0 || var8 != Block.grass.blockID) && var8 != Block.dirt.blockID)
            {
                return false;
            }
            else
            {
                Block var10 = Block.tilledField;
                par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), var10.stepSound.getStepSound(), (var10.stepSound.getVolume() + 1.0F) / 2.0F, var10.stepSound.getPitch() * 0.8F);

                if (par3World.isRemote)
                {
                    return true;
                }
                else
                {
                    par3World.setBlockWithNotify(par4, par5, par6, var10.blockID);
                    par1ItemStack.damageItem(1, par2EntityPlayer);
                    return true;
                }
            }
        }
    }

}
