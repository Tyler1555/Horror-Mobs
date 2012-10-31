package net.minecraft.src;

import java.util.Random;

import tyler15555.HMProxies.CommonProxy;

public class SummoningTable extends BlockContainer {

	public SummoningTable(int i, int j) {
		super(i, j, Material.wood);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockName("Summoning Table");
	}

	@Override
	public TileEntity createNewTileEntity(World var1) {
		return new TileEntitySummoningTable();
	}
	
	
	public int idDropped() {
		return this.blockID;
	}
	
	private void dropItems(World world, int x, int y, int z){
        Random rand = new Random();

        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
        if (!(tileEntity instanceof IInventory)) {
                return;
        }
        IInventory inventory = (IInventory) tileEntity;

        for (int i = 0; i < inventory.getSizeInventory(); i++) {
                ItemStack item = inventory.getStackInSlot(i);

                if (item != null && item.stackSize > 0) {
                        float rx = rand.nextFloat() * 0.8F + 0.1F;
                        float ry = rand.nextFloat() * 0.8F + 0.1F;
                        float rz = rand.nextFloat() * 0.8F + 0.1F;

                        EntityItem entityItem = new EntityItem(world,
                                        x + rx, y + ry, z + rz,
                                        new ItemStack(item.itemID, item.stackSize, item.getItemDamage()));

                        if (item.hasTagCompound()) {
                                entityItem.item.setTagCompound((NBTTagCompound) item.getTagCompound().copy());
                        }

                        float factor = 0.05F;
                        entityItem.motionX = rand.nextGaussian() * factor;
                        entityItem.motionY = rand.nextGaussian() * factor + 0.2F;
                        entityItem.motionZ = rand.nextGaussian() * factor;
                        world.spawnEntityInWorld(entityItem);
                        item.stackSize = 0;
                }
        }
}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
		if(tileEntity == null || player.isSneaking()) {
			return false;
		}
		player.openGui(mod_HorrorMobs.instance, 0, world, x, y, z);
		return true;
	}
	
	public String getTextureFile() {
		return CommonProxy.BLOCK_TEXTURE;
	}
	
}
