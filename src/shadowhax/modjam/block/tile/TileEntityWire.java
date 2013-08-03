package shadowhax.modjam.block.tile;

import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.ForgeDirection;
import shadowhax.modjam.block.BlockWire;
import shadowhax.modjam.energy.EnergyTranferHandler;
import shadowhax.modjam.energy.IEnergyStorageBlock;
import shadowhax.modjam.enums.EnumEnergyType;

public class TileEntityWire extends TileEntityBase {

    @Override
    public void transferEnergy(ForgeDirection direction) {

        TileEntityBase neighborBlock;
        BlockWire transferBlock;
        BlockWire wire;
        double transferRate;

        neighborBlock = (TileEntityBase)worldObj.getBlockTileEntity(xCoord + direction.offsetX, yCoord + direction.offsetY, zCoord + direction.offsetZ);

        wire = (BlockWire)Block.blocksList[worldObj.getBlockId(xCoord, yCoord, zCoord)];

        if(neighborBlock != null && neighborBlock instanceof IEnergyStorageBlock) {

            transferBlock = (BlockWire)Block.blocksList[worldObj.getBlockId(xCoord + direction.offsetX, yCoord + direction.offsetY, zCoord + direction.offsetZ)];

            while(this.currentEnergy > 0) {

                if(wire != null) {

                    transferRate = EnergyTranferHandler.getTranferRateFor(wire.getType(), transferBlock.getType());

                    System.out.println(transferRate);

                    this.modifyEnergy(-20 * transferRate);
                    neighborBlock.modifyEnergy(20 * transferRate);
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