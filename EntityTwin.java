package net.minecraft.src;

public class EntityTwin extends EntityMob {

	public EntityTwin(World world) {
		this(world, 0);
	}
	
	public EntityTwin(World world, int par2) {
		super(world);
		texture = "/horrormod/twin.png";
		moveSpeed = 0.3F;
		getNavigator().setAvoidSun(true);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIWander(this, this.moveSpeed));
		tasks.addTask(2, new EntityAIBreakDoor(this));
		tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 25F, 0, true));
	}
	
	public boolean isAIEnabled() {
		return true;
	}
	
	protected void EntityInit() {
		super.entityInit();
		dataWatcher.addObject(16, Integer.valueOf(0));
	}
	
	public int getMaxHealth() {
		return 45;
	}
	
	public void onLivingUpdate() {
		super.onLivingUpdate();
	}
	
	public void writeEntityToNBT(NBTTagCompound tag) {
		super.writeEntityToNBT(tag);
	}
	
	public void readEntityFromNBT(NBTTagCompound tag) {
		super.readEntityFromNBT(tag);
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
	
	protected int getDropItemId() {
		return mod_HorrorMobs.TwinBrain.shiftedIndex;
	}
	
}
