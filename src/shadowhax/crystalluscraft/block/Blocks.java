package shadowhax.crystalluscraft.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import shadowhax.crystalluscraft.block.item.ItemBlockCompactRawCrystal;
import shadowhax.crystalluscraft.block.item.ItemBlockCompactRefinedCrystal;
import shadowhax.crystalluscraft.block.item.ItemBlockCrystalOre;
import shadowhax.crystalluscraft.block.tile.TileEntityCrystalChest;
import shadowhax.crystalluscraft.block.tile.TileEntityCrystalOre;
import shadowhax.crystalluscraft.block.tile.TileEntityEnergyStorage;
import shadowhax.crystalluscraft.block.tile.TileEntityWarpPad;
import shadowhax.crystalluscraft.core.util.Config;

public class Blocks {
	
	public static Block warpBlock;
	public static Block refiningTable;
    public static Block energyStorageUnit;
	public static Block crystalChest;
    public static Block compactRawCrystal;
    public static Block compactRefinedCrystal;

    public static Block crystalStage1;
    public static Block crystalStage2;
    public static Block crystalStage3;
    public static Block crystalStage4;

	public static void init() {
		
		addBlocks();
		registerBlocks();
		registerTileEntities();
		addNames();
	}
	
	public static void addBlocks() {
		
		warpBlock = new BlockWarpCrystal(Config.warpBlockID).setUnlocalizedName("warpcrystal");
		refiningTable = new BlockRefiningTable(Config.refiningTableID).setHardness(2.5F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("workbench").setUnlocalizedName("refingingtable");
        energyStorageUnit = new BlockEnergyStorageUnit(Config.energyStorageUnitID).setHardness(0.5F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("energyStorageUnit");
        crystalChest = new BlockCrystalChest(Config.CrystalChestID, 0).setHardness(22.5F).setResistance(1000.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("crystalChest");
        compactRawCrystal = new BlockCompactCrystalRaw(Config.compactRawCrystalBlockID, Material.glass).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("rawCrystalBlock");
        compactRefinedCrystal = new BlockCompactCrystalRefined(Config.compactRefinedCrystalBlockID, Material.glass).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("refinecCrystalBlock");

        crystalStage1 = new BlockCrystalOre(Config.crystalStage1ID, 0).setUnlocalizedName("crystalStage1");
        crystalStage2 = new BlockCrystalOre(Config.crystalStage2ID, 1).setUnlocalizedName("crystalStage2");
        crystalStage3 = new BlockCrystalOre(Config.crystalStage3ID, 2).setUnlocalizedName("crystalStage3");
        crystalStage4 = new BlockCrystalOre(Config.crystalStage4ID, 3).setUnlocalizedName("crystalStage4");
	}

	public static void registerBlocks() {
		
		GameRegistry.registerBlock(warpBlock, "warpBlock");
		GameRegistry.registerBlock(refiningTable, "refiningTable");
        GameRegistry.registerBlock(energyStorageUnit, "energyStorageUnit");
        GameRegistry.registerBlock(crystalChest, "crystalChest");
		GameRegistry.registerBlock(compactRawCrystal, ItemBlockCompactRawCrystal.class, "rawCrystalBlock");	
		GameRegistry.registerBlock(compactRefinedCrystal, ItemBlockCompactRefinedCrystal.class, "refinedCrystalBlock");
		
        GameRegistry.registerBlock(crystalStage1, ItemBlockCrystalOre.class, "crystalStage1 [WIP]");
        GameRegistry.registerBlock(crystalStage2, ItemBlockCrystalOre.class, "crystalStage2 [WIP]");
        GameRegistry.registerBlock(crystalStage3, ItemBlockCrystalOre.class, "crystalStage3 [WIP]");
        GameRegistry.registerBlock(crystalStage4, ItemBlockCrystalOre.class, "crystalStage4 [WIP]");
	}
	
	public static void addNames() {
		
		LanguageRegistry.addName(warpBlock, "Warp Block");
		LanguageRegistry.addName(crystalChest, "Crystal Chest[WIP]");
	}
	
	public static void registerTileEntities() {

		GameRegistry.registerTileEntity(TileEntityWarpPad.class, "warpBlock");
        GameRegistry.registerTileEntity(TileEntityEnergyStorage.class, "energyStorageUnit");
        GameRegistry.registerTileEntity(TileEntityCrystalChest.class, "crystalChest");
        GameRegistry.registerTileEntity(TileEntityCrystalOre.class, "crystalOre");
	}
}
