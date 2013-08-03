package shadowhax.crystalluscraft.core.handler;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import shadowhax.crystalluscraft.block.Blocks;
import shadowhax.crystalluscraft.client.gui.CrystalBookGui;
import shadowhax.crystalluscraft.client.gui.RefinedTableGui;
import shadowhax.crystalluscraft.core.util.Config;
import shadowhax.crystalluscraft.inventory.ContainerRefiningTable;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {

		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

		if (world.getBlockId(x, y, z) == Config.refiningTableID){
			return id == Config.guiRefiningID && world.getBlockId(x, y, z) == Blocks.refiningTable.blockID ? new ContainerRefiningTable(player.inventory, world, x, y, z) : null;
		}
		
		if (id == Config.guiCrystalBookID){
			
			return new CrystalBookGui(world, player);
		}
		
		return false;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {

		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

		if (world.getBlockId(x, y, z) == Config.refiningTableID){
			return id == Config.guiRefiningID && world.getBlockId(x, y, z) == Blocks.refiningTable.blockID ? new RefinedTableGui(player.inventory, world, x, y, z) : null;
		}
		
		if (id == Config.crystalBookID){
			
			return new CrystalBookGui(world, player);
		}
		
		return false;
	}
}