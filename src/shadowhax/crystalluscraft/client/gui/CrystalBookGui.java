package shadowhax.crystalluscraft.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class CrystalBookGui extends GuiScreen {

	public CrystalBookGui(World world, EntityPlayer player) {
	}

	public void initGui() {
	}

	public void actionPerformed(GuiButton button) {
	}

	public void drawScreen(int i, int j, float f) {
		drawDefaultBackground();
		super.drawScreen(i, j, f);
	}
}