package shadowhax.modjam.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;

public class Blocks {
	
	public static Block warpBlock;
	
	public static void init() {
		
		addBlocks();
		registerBlocks();
		addNames();
	}
	
	public static void addBlocks() {
		
		warpBlock = new BlockWarpCrystal(1337).setUnlocalizedName("warpcrystal");
	}
	
	public static void registerBlocks() {
		
		GameRegistry.registerBlock(warpBlock);
	}
	
	public static void addNames() {
		
		LanguageRegistry.addName(warpBlock, "Warp Block");
	}
}