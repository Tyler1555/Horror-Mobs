package net.minecraft.src;
 
import java.util.Arrays;
 
public class HorrorModTools extends Item
{
 
    private Block blocksEffectiveAgainst[];
    public float efficiencyOnProperMaterial;
    public int damageVsEntity;
    protected HorrorModToolMaterial toolMaterial;
 
    protected HorrorModTools(int i, int j,HorrorModToolMaterial enumtoolmaterial)
    {
        super(i);
        efficiencyOnProperMaterial = 4F;
        toolMaterial = enumtoolmaterial;
        maxStackSize = 1;
        setMaxDamage(enumtoolmaterial.getMaxhUses());
        efficiencyOnProperMaterial = enumtoolmaterial.getEfficencyOnProperMaterial();
        damageVsEntity = j + enumtoolmaterial.getDamageVsEntity();
    }
 
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        for (int var3 = 0; var3 < this.blocksEffectiveAgainst.length; ++var3)
        {
            if (this.blocksEffectiveAgainst[var3] == par2Block)
            {
                return this.efficiencyOnProperMaterial;
            }
        }

        return 1.0F;
    }
    public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1)
    {
        itemstack.damageItem(2, entityliving1);
        return true;
    }
 
    public boolean onBlockDestroyed(ItemStack itemstack, int i, int j, int k, int l, EntityLiving entityliving)
    {
        itemstack.damageItem(1, entityliving);
        return true;
    }
 
    public int getDamageVsEntity(Entity entity)
    {
        return damageVsEntity;
    }
 
    public boolean isFull3D()
    {
        return true;
    }
 
    public int getItemEnchantability()
    {
        return toolMaterial.getEnchantibility();
    }
}