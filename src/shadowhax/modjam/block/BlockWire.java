package shadowhax.modjam.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import shadowhax.modjam.ModJam;
import shadowhax.modjam.block.tile.TileEntityBase;
import shadowhax.modjam.block.tile.TileEntityWire;
import shadowhax.modjam.enums.EnumEnergyType;

public class BlockWire extends Block implements ITileEntityProvider {

    protected EnumEnergyType type;

	public BlockWire(int par1, EnumEnergyType type) {
		
		super(par1, Material.cloth);
		this.setCreativeTab(ModJam.tab);
        this.type = type;
	}

	@Override
	public TileEntity createNewTileEntity(World world) {

		return new TileEntityWire();
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		
		TileEntityBase tile = (TileEntityBase)world.getBlockTileEntity(x, y, z);
		
		if(!world.isRemote && !player.isSneaking()) {
			
			if(tile != null) {
				
				tile.modifyEnergy(200);
				return true;
			}
		} else if(!world.isRemote && player.isSneaking()) {

            if(tile != null) {

                System.out.println(tile.getCurrentEnergyStored());
                return true;
            }
        }
		
		return false;
	}

    @Override
    public void onBlockAdded(World world, int x, int y, int z) {

        TileEntityWire wire = (TileEntityWire)world.getBlockTileEntity(x, y, z);

        if(wire != null) {

            wire.setEnergyType(this.type);
        }
    }

    public EnumEnergyType getType() {

        return this.type;
    }
}
