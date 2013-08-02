package net.minecraft.src;
 
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import shadowhax.modjam.block.model.ModelWarpPad;
import shadowhax.modjam.tileentity.TileEntityWarpPad;
 
public class RenderWarpPad extends TileEntitySpecialRenderer
{
 
    public RenderWarpPad()
    {
        aModel = new ModelWarpPad();
    }
       
    public void renderAModelAt(TileEntityWarpPad tileentity1, double d, double d1, double d2, float f)
    {  
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d + 0.5F, (float)d1 + 0.5F, (float)d2 + 0.5F);
        bindTextureByName("/mods/render.png");
        GL11.glPushMatrix();
        aModel.render(null, 0.0625F, f, f, f, f, f);
        GL11.glPopMatrix();    
        GL11.glPopMatrix();                    
    }
 
    private void bindTextureByName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2,
            float f)
    {
        renderAModelAt((TileEntityWarpPad)tileentity, d, d1, d2, f);
    }
 
    private ModelWarpPad aModel;
}