package shadowhax.modjam;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import shadowhax.modjam.block.BlockShadowTest;
import shadowhax.modjam.block.tile.TileEntityShadowTest;
import shadowhax.modjam.item.ItemShadowTest;
import cpw.mods.fml.common.registry.GameRegistry;

public class ShadowTest {

	public ShadowTest() {
		
		registerTE();
	}
	
	private void registerTE() {
		
		GameRegistry.registerTileEntity(TileEntityShadowTest.class, "shadowtest");
	}

	public static Item testItem = new ItemShadowTest(10000).setUnlocalizedName("item.shadowTest.name");
	public static Block testBlock = new BlockShadowTest(3222).setUnlocalizedName("block.shadowTest.name");
}
