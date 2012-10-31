package net.minecraft.src;

import java.util.Random;

import tyler15555.HMProxies.CommonProxy;

public class HorrorModSword extends ItemSword
{
 
 
    protected HorrorModSword(int i, EnumToolMaterial enumtoolmaterial)
    {
        super(i, enumtoolmaterial);
    }
    
    public String getTextureFile() {
    	return CommonProxy.ITEMS_TEXTURE;
    }
    
}