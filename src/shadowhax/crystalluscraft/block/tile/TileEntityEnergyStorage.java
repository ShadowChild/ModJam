package shadowhax.crystalluscraft.block.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import shadowhax.crystalluscraft.energy.IEnergyStorageBlock;
import shadowhax.crystalluscraft.enums.EnumEnergyType;

import java.util.Locale;

public class TileEntityEnergyStorage extends TileEntity implements IEnergyStorageBlock {

    public int energyStored;
    public EnumEnergyType energyType;

    @Override
    public void readFromNBT(NBTTagCompound nbt) {

        super.readFromNBT(nbt);
        energyStored = nbt.getInteger("EnergyStored");
        energyType = EnumEnergyType.valueOf(nbt.getString("EnergyType").toUpperCase(Locale.ENGLISH));
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {

        super.writeToNBT(nbt);
        nbt.setInteger("EnergyStored", energyStored);
        nbt.setString("EnergyType", energyType.energyName);
    }

    @Override
    public int getMaxEnergyStored() {

        return 2000;
    }

    @Override
    public int getCurrentEnergyStored() {

        return energyStored;
    }

    @Override
    public void modifyEnergy(double amount) {

        energyStored += amount;

        System.out.println(energyStored);
    }

    @Override
    public void setEnergyType(EnumEnergyType type) {

        energyType = type;
    }

    @Override
    public boolean hasEnergyType() {

        return energyType != EnumEnergyType.NONE;
    }
}
