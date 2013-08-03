package shadowhax.modjam.block;

import net.minecraft.block.Block;
import shadowhax.modjam.block.tile.TileEntityWire;
import shadowhax.modjam.core.util.Config;
import shadowhax.modjam.enums.EnumEnergyType;
import shadowhax.modjam.tileentity.TileEntityWarpPad;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
	
	public static Block warpBlock;
	public static Block[] wires = new Block[256]; 
	public static Block refiningTable;
	
	public static void init() {
		
		addBlocks();
		registerBlocks();
		registerTileEntities();
		addNames();
	}
	
	public static void addBlocks() {
		
		warpBlock = new BlockWarpCrystal(Config.warpBlockID).setUnlocalizedName("warpcrystal");
		wires[0] = new BlockWire(Config.wiresID, EnumEnergyType.IGNIS).setUnlocalizedName("wire");
		refiningTable = new BlockRefiningTable(Config.refiningTableID).setUnlocalizedName("refingingtable");
	}
	
	public static void registerBlocks() {
		
		GameRegistry.registerBlock(warpBlock, "warpBlock");
		GameRegistry.registerBlock(wires[0], "wire");
		GameRegistry.registerBlock(refiningTable, "refiningTable");
	}
	
	public static void addNames() {
		
		LanguageRegistry.addName(warpBlock, "Warp Block");
	}
	
	public static void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityWarpPad.class, "warpBlock");
		GameRegistry.registerTileEntity(TileEntityWire.class, "wire");
	}
}
