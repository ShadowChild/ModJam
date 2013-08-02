package shadowhax.modjam.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import shadowhax.modjam.ModJam;
import shadowhax.modjam.block.tile.TileEntityBase;
import shadowhax.modjam.core.proxy.ClientProxy;

public class BlockShadowTest extends Block implements ITileEntityProvider {

	public BlockShadowTest(int par1) {
		
		super(par1, Material.rock);
		this.setCreativeTab(ModJam.tab);
		this.setTickRandomly(true);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
	
		return new TileEntityBase();
	}
	
	@Override
	public String getLocalizedName() {
		
		return "Shadows Test Block";
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		
		TileEntityBase tile;
		
		if(!world.isRemote && !player.isSneaking()) {
			
			tile = (TileEntityBase)world.getBlockTileEntity(x, y, z);
			tile.modifyEnergy(200);
		} else if(!world.isRemote && player.isSneaking()) {
			
			tile = (TileEntityBase)world.getBlockTileEntity(x, y, z);
			System.out.println(tile.getCurrentEnergyStored());
		}
		
		return false;
	}
	
	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		
//		TileEntityShadowTest tile;
//		TileEntityShadowTest transferTile;
//		
//		if(!world.isRemote) {
//			
//			tile = (TileEntityShadowTest)world.getBlockTileEntity(x, y, z);
//			
//			for(ForgeDirection dir : ForgeDirection.values()) {
//				
//				transferTile = (TileEntityShadowTest)world.getBlockTileEntity(x + dir.offsetX, y + dir.offsetY, z + dir.offsetZ);
//				
//				if(transferTile != null) {
//					
//					transferTile.transferEnergy(dir.getOpposite());
//					break;
//				}
//			}
//		}
	}
	
	@Override
	public void updateTick(World world, int x, int y, int z, Random rand) {
		
		TileEntityBase tile;
		TileEntityBase transferTile;
		
		if(!world.isRemote) {
			
			tile = (TileEntityBase)world.getBlockTileEntity(x, y, z);
			
			for(ForgeDirection dir : ForgeDirection.values()) {
				
				transferTile = (TileEntityBase)world.getBlockTileEntity(x + dir.offsetX, y + dir.offsetY, z + dir.offsetZ);
				
				if(transferTile != null) {
					
					transferTile.transferEnergy(dir.getOpposite());
					break;
				}
			}
		}
	}
}
