package shadowhax.modjam.core.proxy;

import shadowhax.modjam.block.renderer.RenderWarpPad;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	
	public static void render() {
		ClientRegistry.bindTileEntitySpecialRenderer( shadowhax.modjam.tileentity.TileEntityWarpPad.class, new RenderWarpPad());
	}

}
