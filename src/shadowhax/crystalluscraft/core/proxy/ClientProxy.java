package shadowhax.crystalluscraft.core.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;
import shadowhax.crystalluscraft.block.renderer.RenderCrystalChest;
import shadowhax.crystalluscraft.block.renderer.RenderCrystalOre;
import shadowhax.crystalluscraft.block.renderer.RenderWarpPad;
import shadowhax.crystalluscraft.block.tile.TileEntityCrystalChest;
import shadowhax.crystalluscraft.block.tile.TileEntityCrystalOre;
import shadowhax.crystalluscraft.block.tile.TileEntityWarpPad;
import shadowhax.crystalluscraft.client.gui.CrystalBookGui;

public class ClientProxy extends CommonProxy {
	
	@SideOnly(Side.CLIENT)
	public static void render() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWarpPad.class, new RenderWarpPad());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCrystalChest.class, new RenderCrystalChest());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCrystalOre.class, new RenderCrystalOre());
	}

	public static boolean isShiftKeyDown() {

		return Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT);
	}
	
	@SideOnly(Side.CLIENT)
	public static void openGui(World world, EntityPlayer player){
    	Minecraft.getMinecraft().displayGuiScreen(new CrystalBookGui(world, player));
	}
}
