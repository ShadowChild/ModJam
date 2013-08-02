package shadowhax.modjam.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import shadowhax.modjam.ModJam;
import shadowhax.modjam.tileentity.TileEntityWarpPad;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockWarpCrystal extends BlockContainer
{
    public BlockWarpCrystal(int par1) {
    	
        super(par1, Material.glass);
        this.setCreativeTab(ModJam.tab);
        this.setLightOpacity(0);
    }
    
    public static Icon icon;
    
    @Override
    public TileEntity createNewTileEntity(World par1World) {
    	
        return new TileEntityWarpPad();
    }
    
    public boolean isOpaqueCube() {
        return false;
    }
    
    public boolean renderAsNormalBlock() {
        return false;
    }
    

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {

		float var5 = 0.0625F;
		return AxisAlignedBB.getAABBPool().getAABB(var5, var5, var5, var5, var5*2, var5);
	}

	public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {

		float var5 = 0.0625F;
		return AxisAlignedBB.getAABBPool().getAABB(var5, var5, var5, var5, var5*2, var5);
	}

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir) {	
    	icon = ir.registerIcon("shadowhax:blank");
    }
    
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2) {
    	
    	return this.icon;
    }
}
