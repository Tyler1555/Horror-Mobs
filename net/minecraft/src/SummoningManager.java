package net.minecraft.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import cpw.mods.fml.client.FMLClientHandler;

public class SummoningManager {

	private ArrayList summoningList = new ArrayList();
	ContainerSummoningTable table = new ContainerSummoningTable(new InventoryPlayer(FMLClientHandler.instance().getClient().thePlayer), new TileEntitySummoningTable());
	
	public SummoningManager() {
		this.addSummoningRecipie(new ItemStack(Item.appleGold), new ItemStack(Item.appleGold), new ItemStack(Item.appleGold));
		table.inputSlot1.slotNumber = 1;
		table.inputSlot2.slotNumber = 2;
		table.outputSlot.slotNumber = 3;
		if(table.inputSlot1.getHasStack() == true) {
			if(table.inputSlot1.getStack().equals(null) && table.inputSlot2.equals(new ItemStack(mod_HorrorMobs.SoulBottle))) {
				table.outputSlot.putStack(null);
			}
		}
	}
	
	public void addSummoningRecipie(ItemStack par1, ItemStack par2, ItemStack par3) {
		
	}
	
	
	
}
