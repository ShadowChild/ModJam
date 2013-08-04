package shadowhax.crystalluscraft.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import shadowhax.crystalluscraft.block.tile.TileEntityCrystalChest;
import shadowhax.crystalluscraft.block.tile.TileEntityEnergyStorage;
import shadowhax.crystalluscraft.block.tile.TileEntityWarpPad;
import shadowhax.crystalluscraft.core.util.Config;

public class Blocks {
	
	public static Block warpBlock;
	public static Block refiningTable;
    public static Block energyStorageUnit;
	public static Block crystalChest;
	
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
        crystalChest = new BlockCrystalChest(3000).setUnlocalizedName("no");
	}
	
	public static void registerBlocks() {
		
		GameRegistry.registerBlock(warpBlock, "warpBlock");
		GameRegistry.registerBlock(refiningTable, "refiningTable");
        GameRegistry.registerBlock(energyStorageUnit, "energyStorageUnit");
        GameRegistry.registerBlock(crystalChest, "crystalChest");
	}
	
	public static void addNames() {
		
		LanguageRegistry.addName(warpBlock, "Warp Block");
	}
	
	public static void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityWarpPad.class, "warpBlock");
        GameRegistry.registerTileEntity(TileEntityEnergyStorage.class, "energyStorageUnit");
        GameRegistry.registerTileEntity(TileEntityCrystalChest.class, "crystalChest");
	}
}
