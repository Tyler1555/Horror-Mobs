package net.minecraft.src;

public class EntityShadowLurker extends EntityMob {

	
	
	public EntityShadowLurker(World world) {
		this(world, 0);
	}
	
	public EntityShadowLurker(World world, int par2) {
		super(world);
		texture = "/horrormod/shadowlurker.png";
		moveSpeed = 0.45F;
		getNavigator().setAvoidSun(true);
		tasks.addTask(0, new EntityAISwimming(this));
		tasks.addTask(1, new EntityAIWander(this, this.moveSpeed));
		tasks.addTask(2, new EntityAIBreakDoor(this));
		tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, true));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16F, 0, true));
	}
	
	public boolean isAIEnabled() {
		return true;
	}
	
	protected void EntityInit() {
		super.entityInit();
		dataWatcher.addObject(16, Integer.valueOf(0));
	}
	
	public int getMaxHealth() {
		return 30;
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
	
	protected String getLivingSound() {
		return "mob.enderman.idle";
	}
	
	protected String getHurtSound() {
		return "mob.enderman.hit";
	}
	
	protected String getDeathSound() {
		return "mob.enderman.death";
	}
	
	public int getDropItemId() {
		return mod_HorrorMobs.SoulBottle.shiftedIndex;
	}
	
	protected void dropRareDrop() {
		switch (this.rand.nextInt(1)) {
		case 0:
			this.dropItem(Item.enderPearl.shiftedIndex, 1);
			break;
		case 1:
			this.dropItem(Item.eyeOfEnder.shiftedIndex, 1);
		}
	}
	
	
	
}
