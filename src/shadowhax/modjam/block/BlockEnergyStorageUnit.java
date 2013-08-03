package shadowhax.modjam.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import shadowhax.modjam.ModJam;
import shadowhax.modjam.block.tile.TileEntityEnergyStorage;
import shadowhax.modjam.energy.IEnergyStorageBlock;
import shadowhax.modjam.enums.EnumEnergyType;
import shadowhax.modjam.item.ItemRefinedCrystal;

public class BlockEnergyStorageUnit extends Block implements ITileEntityProvider {

    public BlockEnergyStorageUnit(int id) {

        super(id, Material.rock);
        this.setCreativeTab(ModJam.tab);
    }

    @Override
    public TileEntity createNewTileEntity(World world) {

        return new TileEntityEnergyStorage();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {

        TileEntity tile = world.getBlockTileEntity(x, y, z);

        if(tile != null && tile instanceof IEnergyStorageBlock) {

            TileEntityEnergyStorage theTile = (TileEntityEnergyStorage)tile;
            if(!world.isRemote) {

                if(player.isSneaking()) {

                    player.addChatMessage("Storage Unit Now Holds " + theTile.getCurrentEnergyStored());
                    player.addChatMessage("Units Of " + theTile.energyType.energyName + " Energy");
                    System.out.println(theTile.getCurrentEnergyStored());
                    System.out.println(theTile.energyType.energyName);
                } else {

                    Item crystal = null;

                    if(player.getCurrentEquippedItem() != null) {

                        crystal = player.getCurrentEquippedItem().getItem();

                        if(crystal != null && crystal instanceof ItemRefinedCrystal) {

                            if(!(theTile.getCurrentEnergyStored() + 200 > theTile.getMaxEnergyStored()) && !theTile.hasEnergyType()) {

                                player.swingItem();
                                if(!player.capabilities.isCreativeMode)
                                    --player.getCurrentEquippedItem().stackSize;

                                switch(player.getCurrentEquippedItem().getItemDamage()) {

                                    case 1: {

                                        theTile.setEnergyType(EnumEnergyType.LUX);
                                        theTile.modifyEnergy(200);
                                        break;
                                    }

                                    case 2: {

                                        theTile.setEnergyType(EnumEnergyType.ROS);
                                        theTile.modifyEnergy(200);
                                        break;
                                    }

                                    case 3: {

                                        theTile.setEnergyType(EnumEnergyType.NATURA);
                                        theTile.modifyEnergy(200);
                                        break;
                                    }

                                    case 4: {

                                        theTile.setEnergyType(EnumEnergyType.OBITUS);
                                        theTile.modifyEnergy(200);
                                        break;
                                    }

                                    case 5: {

                                        theTile.setEnergyType(EnumEnergyType.IGNIS);
                                        theTile.modifyEnergy(200);
                                        break;
                                    }

                                    case 6: {

                                        theTile.setEnergyType(EnumEnergyType.ZEPHYR);
                                        theTile.modifyEnergy(200);
                                        break;
                                    }

                                    default: {

                                        break;
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    @Override
    public void onBlockAdded(World world, int x, int y, int z) {

        TileEntityEnergyStorage tile = (TileEntityEnergyStorage)world.getBlockTileEntity(x, y, z);

        if(tile != null) {

            tile.setEnergyType(EnumEnergyType.NONE);
        }
    }
}
