package net.minecraft.src;

import tyler15555.HMProxies.CommonProxy;

public class ItemEntityDoll extends Item {

	protected boolean hasBeenActivated;
	
	protected int id;
	
	public ItemEntityDoll(int i, int j) {
		super(i);
		this.id = j;
	}
	
	@Override
	public String getTextureFile() {
		return CommonProxy.ITEMS_TEXTURE;
	}
	
	public void writeEntityIDToNBT(NBTTagCompound tag) {
		 tag.setBoolean("HasBeenActivated", false);
		 this.writeEntityIDToNBT(tag);
	}
	
	public void readEntityIDFromNBT(NBTTagCompound tag) {
		this.hasBeenActivated = tag.getBoolean("HasBeenActivated");
	}
	
	@Override
	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) 
    {
        switch(id) {
        case 1:
        	if(hasBeenActivated == true) {
        		EntityTheThing theThing = new EntityTheThing(world);
        		world.spawnEntityInWorld(theThing);
        	}
        	break;
        case 2:
        	if(hasBeenActivated == true) {
        		EntitySeaDweller seaDweller = new EntitySeaDweller(world);
        		world.spawnEntityInWorld(seaDweller);
        	}
        	break;
        case 3:
        	if(hasBeenActivated == true) {
        		EntityGhoul ghoul = new EntityGhoul(world);
        		world.spawnEntityInWorld(ghoul);
        	}
        	break;
        case 4:
        	if(hasBeenActivated == true) {
        		EntityTwin twin = new EntityTwin(world);
        		world.spawnEntityInWorld(twin);
        	}
        	break;
        case 5:
        	if(hasBeenActivated == true) {
        		EntityShadowLurker lurker = new EntityShadowLurker(world);
        		world.spawnEntityInWorld(lurker);
        	}
        	break;
        case 6:
        	if(hasBeenActivated == true) {
        		EntityBurnedZombie zombie = new EntityBurnedZombie(world);
        		world.spawnEntityInWorld(zombie);
        	}
        	break;
        case 7:
        	if(hasBeenActivated == true) {
        		EntityReaper reaper = new EntityReaper(world);
        		world.spawnEntityInWorld(reaper);
        	}
        	break;
        }
        stack.stackSize--;
        return true;
    }
	
}
