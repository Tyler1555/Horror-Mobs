package net.minecraft.src;

public class EntityGhoul extends EntityMob {

	private ItemStack heldItem = new ItemStack(Item.shovelSteel);
	
	public EntityGhoul(World world) {
		this(world, 0);
	}
	
	public EntityGhoul(World world, int par2) {
		super(world);
		texture = "/horrormod/ghoul.png";
		moveSpeed = 0.45F;
		getNavigator().setAvoidSun(true);
		getNavigator().setAvoidsWater(true);
		tasks.addTask(0, new EntityAIAvoidEntity(this, net.minecraft.src.EntityZombie.class, 8F, 0.3F, 0.35F));
		tasks.addTask(1, new EntityAIOpenDoor(this, true));
		tasks.addTask(2, new EntityAIWander(this, this.moveSpeed));
		tasks.addTask(3, new EntityAILeapAtTarget(this, 1.0F));
		tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 10F, 0, true));
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
		if (this.worldObj.isDaytime() && !this.worldObj.isRemote)
        {
            float var1 = this.getBrightness(1.0F);

            if (var1 > 0.5F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.rand.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F)
            {
                this.setFire(3);
                this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 1.5F);
                setDead();
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
		return "mob.zombie";
	}
	
	protected String getHurtSound() {
		return "mob.zombiehurt";
	}
	
	protected String getDeathSound() {
		return "mob.zombiedeath";
	}
	
	protected int getDropItemId() {
		return mod_HorrorMobs.GraveCobble.blockID;
	}
	
	protected void dropRareDrop() {
		switch (this.rand.nextInt(3)) {
		case 0:
			this.dropItem(Item.recordCat.shiftedIndex, 1);
			break;
		case 1:
			this.dropItem(mod_HorrorMobs.RottenLog.blockID, 3);
			break;
		case 2:
			ItemStack shovel = new ItemStack(Item.shovelSteel);
			EnchantmentHelper.addRandomEnchantment(this.rand, shovel, 5);
			this.entityDropItem(shovel, 1);
		}
	}
	
	public ItemStack getHeldItem() {
		return heldItem;
	}
	
}
