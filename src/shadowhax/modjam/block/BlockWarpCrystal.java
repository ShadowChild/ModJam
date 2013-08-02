package shadowhax.modjam.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import shadowhax.modjam.ModJam;
import shadowhax.modjam.tileentity.TileEntityWarpPad;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
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
    

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir) {	
    	icon = ir.registerIcon("shadowhax:blank");
    }
    
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2) {
    	
    	return this.icon;
    }
}
