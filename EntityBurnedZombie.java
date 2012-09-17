package net.minecraft.src;

public class EntityBurnedZombie extends EntityMob {

	public EntityBurnedZombie(World world) {
		this(world, 0);
	}
	
	public EntityBurnedZombie(World world, int par2) {
		super(world);
		texture = "/horrormod/burnedzombie.png";
		moveSpeed = 0.23F;
		getNavigator().setBreakDoors(true);
		tasks.addTask(0, new EntityAIWander(this, this.moveSpeed));
		tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
		tasks.addTask(2, new EntityAIBreakDoor(this));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
	}
	
	public boolean isAIEnabled() {
		return true;
	}
	
	protected void EntityInit() {
		super.entityInit();
		dataWatcher.addObject(16, Integer.valueOf(0));
	}
	
	public int getMaxHealth() {
		return 25;
	}
	
	public void onLivingUpdate() {
		super.onLivingUpdate();
	}
	
	public void writeEntityToNBT(NBTTagCompound par1tag) {
		super.writeEntityToNBT(par1tag);
	}
	
	public void readEntityFromNBT(NBTTagCompound par1tag) {
		super.readEntityFromNBT(par1tag);
	}
	
	protected boolean canDespawn() {
		return true;
	}
	
	protected String getLivingSound() {
		return "mob.zombie.idle";
	}
	
	protected String getHurtSound() {
		return "mob.zombiehurt";
	}
	
	protected String getDeathSound() {
		return "mob.zombiedeath";
	}
	
	public int getDropItemId() {
		return mod_HorrorMobs.CookedFlesh.shiftedIndex;
	}
	
}
