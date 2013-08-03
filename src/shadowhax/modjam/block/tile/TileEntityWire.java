package shadowhax.modjam.block.tile;

import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import shadowhax.modjam.block.BlockWire;
import shadowhax.modjam.energy.IEnergyStorageBlock;
import shadowhax.modjam.enums.EnumEnergyType;

public class TileEntityWire extends TileEntityBase {

    @Override
    public void transferEnergy(ForgeDirection direction) {

        TileEntity neighborBlock;
        IEnergyStorageBlock transferBlock;
        BlockWire wire;
        int transferRate;

        neighborBlock = worldObj.getBlockTileEntity(xCoord + direction.offsetX, yCoord + direction.offsetY, zCoord + direction.offsetZ);

        wire = (BlockWire)Block.blocksList[worldObj.getBlockId(xCoord, yCoord, zCoord)];

        if(neighborBlock != null && neighborBlock instanceof IEnergyStorageBlock) {

            transferBlock = (IEnergyStorageBlock)neighborBlock;

            while(this.currentEnergy > 0) {

                if(wire != null) {

//                    transferRate = wire.getType().tranferRate;
//
//                    this.modifyEnergy(-20 * transferRate);
//                    transferBlock.modifyEnergy(20 * transferRate);
                }
            }
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {

        super.writeToNBT(nbt);
        nbt.setString("EnergyType", this.type.energyName);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {

        super.readFromNBT(nbt);
        this.setEnergyType(EnumEnergyType.valueOf(nbt.getString("EnergyType")));
    }
}