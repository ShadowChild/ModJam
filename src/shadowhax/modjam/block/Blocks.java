package shadowhax.modjam.block;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;

public class Blocks {
	
	public static final Block WarpTest = new BlockWarpCrystal(1337).setUnlocalizedName("block.warcrystal.name");
	
	public static void addNames() {
		
		LanguageRegistry.addName(WarpTest, "Warp Crystal Test");
	}

}
