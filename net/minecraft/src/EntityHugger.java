package net.minecraft.src;

public class EntityHugger extends EntityMob {

	public EntityHugger(World world) {
		this(world, 0);
	}
	
	public EntityHugger(World world, int par2) {
		super(world);
		texture = "horrormod/hugger.png";
		moveSpeed = 0.5F;
		this.getNavigator().getCanBreakDoors();
		this.getNavigator().setBreakDoors(true);
		this.getNavigator().setAvoidSun(true);
		this.getNavigator().setAvoidsWater(true);
		tasks.addTask(0, new EntityAIBreakDoor(this));
		tasks.addTask(1, new EntityAIWander(this, 0.5F));
		tasks.addTask(2, new EntityAIAttackOnCollide(this, net.minecraft.src.EntityPlayer.class, 8.0F, true));
	}

	@Override
	public int getMaxHealth() {
		return 30;
	}
	
	protected boolean isAIEnabled() {
		return true;
	}
	
	public void onLivingUpdate() {
		super.onLivingUpdate();
	}
	
	protected void EntityInit() {
		super.entityInit();
		dataWatcher.addObject(16, Integer.valueOf(0));
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
		return "mob.blaze.breath";
	}
	
	protected String getHurtSound() {
		return "mob.zombiehurt";
	}
	
	protected String getDeathSound() {
		return "mob.blaze.death";
	}
	
	public int getDropItemId() {
		return Item.ghastTear.shiftedIndex;
	}
	
}
