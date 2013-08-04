package shadowhax.crystalluscraft.core.proxy;

import org.lwjgl.input.Keyboard;

import shadowhax.crystalluscraft.block.renderer.RenderWarpPad;
import shadowhax.crystalluscraft.block.tile.TileEntityWarpPad;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy {
	
	@SideOnly(Side.CLIENT)
	public static void render() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWarpPad.class, new RenderWarpPad());
	}

	public static boolean isShiftKeyDown() {

		return Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT);
	}
}
