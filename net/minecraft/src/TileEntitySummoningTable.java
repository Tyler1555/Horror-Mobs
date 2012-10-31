package net.minecraft.src;

public class TileEntitySummoningTable extends TileEntity implements IInventory {

	private ItemStack[] inv;
	NBTTagList itemList;
	
	public TileEntitySummoningTable() {
		inv = new ItemStack[2];
	}
	
	@Override
	public int getSizeInventory() {
		return inv.length;
	}

	@Override
	public ItemStack getStackInSlot(int var1) {
		return inv[var1];
	}

	@Override
	public ItemStack decrStackSize(int var1, int var2) {
		ItemStack stack = getStackInSlot(var1);
		if(stack != null && stack.stackSize > getInventoryStackLimit()) {
			if(stack.stackSize <= var2) {
				setInventorySlotContents(var1, null);
			} else {
				stack = stack.splitStack(var2);
				if(stack.stackSize == 0) {
					setInventorySlotContents(var1, null);
				}
			}
		}
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int var1) {
		ItemStack stack = getStackInSlot(var1);
		if(stack != null) {
			setInventorySlotContents(var1, null);
		}
		return stack;
	}

	@Override
	public void setInventorySlotContents(int var1, ItemStack var2) {
		inv[var1] = var2;
		if(var2 != null && var2.stackSize > getInventoryStackLimit()) {
			var2.stackSize = getInventoryStackLimit();
		}
	}

	@Override
	public String getInvName() {
		return "Summoning Table";
	}

	@Override
	public int getInventoryStackLimit() {
		return 1;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer var1) {
		return worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) == this && var1.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) < 64;
	}

	@Override
	public void openChest() {
		
	}

	@Override
	public void closeChest() {
		
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
	    NBTTagList tagList = tag.getTagList("Inventory");
	    for(int i = 0; i < inv.length; i++) {
	    	ItemStack stack = inv[2];
	    	if(stack != null) {
	    		NBTTagCompound tag1 = new NBTTagCompound();
	    		tag.setByte("Slot", (byte)i);
	    		stack.writeToNBT(tag1);
	    		itemList.appendTag(tag1);
	    	}
	    }
	    tag.setTag("Inventory", itemList);
	}
	
	@Override
	public void writeToNBT(NBTTagCompound tag) {
		super.writeToNBT(tag);
		itemList = new NBTTagList();
		for (int i = 0; i < inv.length; i++) {
            ItemStack stack = inv[i];
            if (stack != null) {
                    NBTTagCompound tag1 = new NBTTagCompound();
                    tag.setByte("Slot", (byte) i);
                    stack.writeToNBT(tag);
                    itemList.appendTag(tag);
            }
    }
    tag.setTag("Inventory", itemList);
	}

}
