package net.minecraft.src;

public class EntityReaper extends EntityMob {

	private final ItemStack heldItem = new ItemStack(mod_HorrorMobs.ReaperScythe);
	
	public EntityReaper(World world) {
		this(world, 0);
	}
	
	public EntityReaper(World world, int par2) {
		super(world);
		texture = "/horrormod/reaper.png";
		moveSpeed = 0.35F;
		getNavigator().setEnterDoors(true);
		getNavigator().setAvoidSun(true);
		getNavigator().setAvoidsWater(false);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIWander(this, this.moveSpeed));
		tasks.addTask(2, new EntityAIOpenDoor(this, true));
		tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 10F));
		tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
		this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 20.0F, 0, true));
	}
	
	public boolean isAIEnabled() {
		return true;
	}
	
	protected void EntityInit() {
		super.entityInit();
		dataWatcher.addObject(0, Integer.valueOf(0));
	}
	
	public int getMaxHealth() {
		return 40;
	}
	
	public void onLivingUpdate() {
		if (this.worldObj.isDaytime() && !this.worldObj.isRemote)
        {
            float var1 = this.getBrightness(1.0F);

            if (var1 > 0.5F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.rand.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F)
            {
                this.setFire(9);
            }
        }
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
	
	public String getLivingSound() {
		return "mob.skeleton";
	}
	
	public String getHurtSound() {
		return "mob.skeletonhurt";
	}
	
	public String getDeathSound() {
		return "mob.skeletonhurt";
	}
	
	public ItemStack getHeldItem() {
		return heldItem;
	}
	
	public int getDropItemId() {
		return mod_HorrorMobs.ReaperBone.shiftedIndex;
	}
	
	protected void dropRareDrop() {
		switch (this.rand.nextInt(1)) {
		case 0:
			this.dropItem(mod_HorrorMobs.GraveScythe.shiftedIndex, 1);
			break;
		case 1:
			this.dropItem(mod_HorrorMobs.ReaperSword.shiftedIndex, 3);
			break;
		}
	}
	
}
