package net.minecraft.src;

public class EntityTheThing extends EntityMob {
	
	public EntityTheThing(World world) {
		this(world, 0);
	}
	
	public EntityTheThing(World world, int par2) {
		super(world);
		texture = "/horrormod/thething.png";
		moveSpeed = 0.7F;
		getNavigator().getCanBreakDoors();
		getNavigator().setAvoidSun(true);
		getNavigator().setCanSwim(true);
		getNavigator().setAvoidsWater(false);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIAvoidEntity(this, net.minecraft.src.EntityZombie.class, 8.0F, 0.3F, 0.35F));
		tasks.addTask(2, new EntityAIBreakDoor(this));
		tasks.addTask(3, new EntityAIMoveThroughVillage(this, this.moveSpeed, true));
		tasks.addTask(4, new EntityAIWander(this, 0.5F));
		tasks.addTask(5, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 20F, 0, true));
	}
	
	public boolean isAIEnabled() {
		return true;
	}
	
	protected void EntityInit() {
		super.entityInit();
		dataWatcher.addObject(16, Integer.valueOf(0));
	}
	
	public int getMaxHealth() {
		return 35;
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
		return "mob.ghast.scream";
	}
	
	protected String getHurtSound() {
		return "mob.zombiehurt";
	}
	
	protected String getDeathSound() {
		return "mob.ghast.death";
	}
	
	public int getDropItemId() {
		return mod_HorrorMobs.ThingLung.shiftedIndex;
	}
	
	protected void dropRareDrop(int par1) {
		switch(this.rand.nextInt(1)) {
		case 0:
			this.dropItem(mod_HorrorMobs.ThingHeart.shiftedIndex, 1);
			break;
			
		case 1:
			this.dropItem(Item.appleGold.shiftedIndex, 1);
		}
	}
	
	
	
}
