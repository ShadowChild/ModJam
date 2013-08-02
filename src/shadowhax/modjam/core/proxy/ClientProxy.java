package shadowhax.modjam.core.proxy;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.Minecraft;
import shadowhax.modjam.block.renderer.RenderWarpPad;
import shadowhax.modjam.tileentity.TileEntityWarpPad;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	
	public static void render() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWarpPad.class, new RenderWarpPad());
	}

	public static boolean isShiftKeyDown() {

		return Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT);
	}
}
