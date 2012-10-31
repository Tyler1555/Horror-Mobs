package net.minecraft.src;

public class EntitySeaDweller extends EntityWaterMob {

	public EntitySeaDweller(World world) {
		this(world, 0);
		
	}
	
	public EntitySeaDweller(World world, int par2) {
		super(world);
		texture = "/horrormod/seadweller.png";
		moveSpeed = 0.35F;
		tasks.addTask(0, new EntityAIWander(this, this.moveSpeed));
		tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 8F, 0, true));
	}
	
	public int getMaxHealth() {
		return 20;
	}
	
	public boolean canBreathUnderWater() {
		return true;
	}
	
	public void writeEntityToNBT(NBTTagCompound tag) {
		super.writeEntityToNBT(tag);
	}
	
	public void readEntityFromNBT(NBTTagCompound tag) {
		super.readEntityFromNBT(tag);
	}
	
	public void onLivingUpdate() {
		super.onLivingUpdate();
	}
	
	protected boolean canDespawn() {
		return true;
	}
	
	protected String getLivingSound() {
		return "mob.zombie";
	}
	
	protected String getHurtSound() {
		return "mob.zombiehurt";
	}
	
	protected String getDeathSound() {
		return "mob.zombiedeath";
	}
	
	protected int getDropId() {
		return Item.fishRaw.shiftedIndex;
	}
	
	public boolean getCanSpawnHere()
    {
        return this.worldObj.checkIfAABBIsClear(this.boundingBox);
    }
	
}
