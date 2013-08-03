package shadowhax.modjam.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import shadowhax.modjam.block.tile.TileEntityEnergyStorage;
import shadowhax.modjam.core.util.Config;
import shadowhax.modjam.tileentity.TileEntityWarpPad;

public class Blocks {
	
	public static Block warpBlock;
	public static Block refiningTable;
    public static Block energyStorageUnit;
	
	public static void init() {
		
		addBlocks();
		registerBlocks();
		registerTileEntities();
		addNames();
	}
	
	public static void addBlocks() {
		
		warpBlock = new BlockWarpCrystal(Config.warpBlockID).setUnlocalizedName("warpcrystal");
		refiningTable = new BlockRefiningTable(Config.refiningTableID).setUnlocalizedName("refingingtable");
        energyStorageUnit = new BlockEnergyStorageUnit(Config.energyStorageUnitID).setUnlocalizedName("energyStorageUnit");
	}
	
	public static void registerBlocks() {
		
		GameRegistry.registerBlock(warpBlock, "warpBlock");
		GameRegistry.registerBlock(refiningTable, "refiningTable");
        GameRegistry.registerBlock(energyStorageUnit, "energyStorageUnit");
	}
	
	public static void addNames() {
		
		LanguageRegistry.addName(warpBlock, "Warp Block");
	}
	
	public static void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityWarpPad.class, "warpBlock");
        GameRegistry.registerTileEntity(TileEntityEnergyStorage.class, "energyStorageUnit");
	}
}
