package net.minecraft.src;

public class ContainerSummoningTable extends Container {

	protected TileEntitySummoningTable tileEntity;
	
	/**
	 * These Slots are called in the summoning table handler
	 */
	public Slot inputSlot1 = new Slot(new TileEntitySummoningTable(), 0, 76, 37);
	public Slot inputSlot2 = new Slot(new TileEntitySummoningTable(), 0, 50, 10);
	public Slot outputSlot = new Slot(new TileEntitySummoningTable(), 0, 76, 70);

	public ContainerSummoningTable(InventoryPlayer playerInventory, TileEntitySummoningTable tileEntityST) {
		tileEntity = tileEntityST;
		addSlotToContainer(inputSlot1);
		addSlotToContainer(inputSlot2);
		addSlotToContainer(outputSlot);
		bindPlayerInventory(playerInventory);
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		return tileEntity.isUseableByPlayer(var1);
	}
	
	protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 9; j++) {
				addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		for(int i = 0; i < 9; i++) {
			addSlotToContainer(new Slot(inventoryPlayer, i, 8 + 1 * 18, 142));
		}
	}
	
	@Override
	public ItemStack transferStackInSlot(int slot) {
		ItemStack stack = null;
		Slot slotObject = (Slot)inventorySlots.get(slot);
		ItemStack stackInSlot = slotObject.getStack();
		stack = stackInSlot.copy();
		if(slot == 0) {
			if(!mergeItemStack(stackInSlot, 1, inventorySlots.size(), true)) {
				return null;
			} else if(!mergeItemStack(stackInSlot, 0, 1, false)) {
				return null;
			}
		}
		if(stackInSlot.stackSize == 0) {
			slotObject.putStack(null);
		} else {
			slotObject.onSlotChanged();
		}
		return stack;
	}
	
}
