package shadowhax.modjam.block;

import net.minecraft.block.Block;
import shadowhax.modjam.block.tile.TileEntityWire;
import shadowhax.modjam.tileentity.TileEntityWarpPad;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
	
	public static Block warpBlock;
	public static Block[] wires = new Block[256]; 
	
	public static void init() {
		
		addBlocks();
		registerBlocks();
		registerTileEntities();
		addNames();
	}
	
	public static void addBlocks() {
		
		warpBlock = new BlockWarpCrystal(1337).setUnlocalizedName("warpcrystal");
		wires[0] = new BlockWire(1338).setUnlocalizedName("wire");
	}
	
	public static void registerBlocks() {
		
		GameRegistry.registerBlock(warpBlock, "warpBlock");
		GameRegistry.registerBlock(wires[0], "wire");
	}
	
	public static void addNames() {
		
		LanguageRegistry.addName(warpBlock, "Warp Block");
	}
	
	public static void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityWarpPad.class, "warpBlock");
		GameRegistry.registerTileEntity(TileEntityWire.class, "wire");
	}
}
