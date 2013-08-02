package shadowhax.modjam.block;

import shadowhax.modjam.ModJam;
import shadowhax.modjam.tileentity.TileEntityWarpPad;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockWarpCrystal extends BlockContainer
{
    public BlockWarpCrystal(int par1) {
    	
        super(par1, Material.glass);
        this.setCreativeTab(ModJam.tab);
    }
    
    @Override
    public TileEntity createNewTileEntity(World par1World) {
    	
        return new TileEntityWarpPad();
    }
}
