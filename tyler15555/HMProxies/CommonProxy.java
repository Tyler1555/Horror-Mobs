package tyler15555.HMProxies;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.src.ContainerSummoningTable;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.GUISummoningTable;
import net.minecraft.src.TileEntity;
import net.minecraft.src.TileEntitySummoningTable;
import net.minecraft.src.World;

public class CommonProxy implements IGuiHandler {

	public static String ITEMS_TEXTURE = "/horrormod/items.png";
	public static String BLOCK_TEXTURE = "/horrormod/terrain.png";
	
	public static void registerRenderers() {
		
	}
	
	public static World getClientWorld() {
		return null;
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
		if(tileEntity instanceof TileEntitySummoningTable) {
			return new ContainerSummoningTable(player.inventory, (TileEntitySummoningTable) tileEntity);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
		if(tileEntity instanceof TileEntitySummoningTable) {
			return new GUISummoningTable(player.inventory, (TileEntitySummoningTable) tileEntity);
		}
		return null;
	}
	
}
