package shadowhax.crystalluscraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import shadowhax.crystalluscraft.CrystallusCraft;
import shadowhax.crystalluscraft.block.tile.TileEntityEnergyStorage;
import shadowhax.crystalluscraft.energy.IEnergyStorageBlock;
import shadowhax.crystalluscraft.enums.EnumEnergyType;
import shadowhax.crystalluscraft.item.ItemEnergyDestoyer;
import shadowhax.crystalluscraft.item.ItemRawCrystal;

public class BlockEnergyStorageUnit extends Block implements ITileEntityProvider {

    public BlockEnergyStorageUnit(int id) {

        super(id, Material.rock);
        this.setCreativeTab(CrystallusCraft.tab);
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
//                    System.out.println(theTile.getCurrentEnergyStored());
//                    System.out.println(theTile.energyType.energyName);
                } else {

                    Item item = null;

                    if(player.getCurrentEquippedItem() != null) {

                        item = player.getCurrentEquippedItem().getItem();

                        if(item != null && item instanceof ItemRawCrystal) {

                            if(!(theTile.getCurrentEnergyStored() + 200 > theTile.getMaxEnergyStored())) {

                                player.swingItem();
                                if(!player.capabilities.isCreativeMode)
                                    --player.getCurrentEquippedItem().stackSize;

                                switch(player.getCurrentEquippedItem().getItemDamage()) {

                                    case 1: {

                                        if(theTile.energyType == EnumEnergyType.LUX || theTile.energyType == EnumEnergyType.NONE) {

                                            theTile.setEnergyType(EnumEnergyType.LUX);
                                            theTile.modifyEnergy(200);
                                            if(!player.capabilities.isCreativeMode)
                                                --player.getCurrentEquippedItem().stackSize;
                                        }
                                        break;
                                    }

                                    case 2: {

                                        if(theTile.energyType == EnumEnergyType.ROS || theTile.energyType == EnumEnergyType.NONE) {

                                            theTile.setEnergyType(EnumEnergyType.ROS);
                                            theTile.modifyEnergy(200);
                                            if(!player.capabilities.isCreativeMode)
                                                --player.getCurrentEquippedItem().stackSize;
                                        }
                                        break;
                                    }

                                    case 3: {

                                        if(theTile.energyType == EnumEnergyType.NATURA || theTile.energyType == EnumEnergyType.NONE) {

                                            theTile.setEnergyType(EnumEnergyType.NATURA);
                                            theTile.modifyEnergy(200);
                                            if(!player.capabilities.isCreativeMode)
                                                --player.getCurrentEquippedItem().stackSize;
                                        }
                                        break;
                                    }

                                    case 4: {

                                        if(theTile.energyType == EnumEnergyType.OBITUS || theTile.energyType == EnumEnergyType.NONE) {

                                            theTile.setEnergyType(EnumEnergyType.OBITUS);
                                            theTile.modifyEnergy(200);
                                            if(!player.capabilities.isCreativeMode)
                                                --player.getCurrentEquippedItem().stackSize;
                                        }
                                        break;
                                    }

                                    case 5: {

                                        if(theTile.energyType == EnumEnergyType.IGNIS || theTile.energyType == EnumEnergyType.NONE) {

                                            theTile.setEnergyType(EnumEnergyType.IGNIS);
                                            theTile.modifyEnergy(200);
                                            if(!player.capabilities.isCreativeMode)
                                                --player.getCurrentEquippedItem().stackSize;
                                        }
                                        break;
                                    }

                                    case 6: {

                                        if(theTile.energyType == EnumEnergyType.ZEPHYR || theTile.energyType == EnumEnergyType.NONE) {

                                            theTile.setEnergyType(EnumEnergyType.ZEPHYR);
                                            theTile.modifyEnergy(200);
                                            if(!player.capabilities.isCreativeMode)
                                                --player.getCurrentEquippedItem().stackSize;
                                        }
                                        break;
                                    }

                                    default: {

                                        break;
                                    }
                                }
                            }
                            return true;
                        } else if(item != null && item instanceof ItemEnergyDestoyer) {

                            theTile.energyStored = 0;
                            theTile.setEnergyType(EnumEnergyType.NONE);
                            player.addChatMessage("You Have Reset The Energy");
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
