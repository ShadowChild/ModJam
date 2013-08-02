package shadowhax.modjam.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import shadowhax.modjam.block.tile.TileEntityShadowTest;
import shadowhax.modjam.energy.IEnergyStorageBlock;

public class BlockShadowTest extends Block implements ITileEntityProvider {

	public BlockShadowTest(int par1) {
		
		super(par1, Material.rock);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
	
		return new TileEntityShadowTest(world);
	}
	
	@Override
	public String getLocalizedName() {
		
		return "Shadows Test Block";
	}
}
