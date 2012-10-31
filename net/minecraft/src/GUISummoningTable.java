package net.minecraft.src;

import org.lwjgl.opengl.GL11;

public class GUISummoningTable extends GuiContainer {

	public GUISummoningTable(InventoryPlayer inventoryPlayer, TileEntitySummoningTable table) {
		super(new ContainerSummoningTable(inventoryPlayer, table));
	}

	@Override
	protected void drawGuiContainerForegroundLayer() {
		fontRenderer.drawString("Summoning Table", 8, 6, 4210752);
		fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		int texture = mc.renderEngine.getTexture("/gui/demo_bg.png");
		 GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		 this.mc.renderEngine.bindTexture(texture);
		 int x = (width - xSize) / 2;
		 int y = (height - ySize) / 2;
		 this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	}
	
}
