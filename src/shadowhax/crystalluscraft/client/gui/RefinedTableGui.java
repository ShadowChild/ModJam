package shadowhax.crystalluscraft.client.gui;

import org.lwjgl.opengl.GL11;

import shadowhax.crystalluscraft.inventory.ContainerRefiningTable;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class RefinedTableGui extends GuiContainer {

	private static final ResourceLocation guiTexture = new ResourceLocation("crystalluscraft:/textures/gui/refiningtable.png");

	public RefinedTableGui(InventoryPlayer inventoryplayer, World world, int i, int j, int k) {
		super(new ContainerRefiningTable(inventoryplayer, world, i, j, k));
	}

    @Override
    protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		fontRenderer.drawString("Refining Table", 0, -12, 0x404040);
		fontRenderer.drawString("Inventory", 8, ySize - 96 - 14, 0x404040);
	}

    @Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.func_110434_K().func_110577_a(guiTexture);
		xSize = 190;
		ySize = 202;
		int l = (width - xSize) / 2;
		int i1 = (height - ySize) / 2;
		drawTexturedModalRect(l, i1, 0, 0, xSize, ySize);
	}
}