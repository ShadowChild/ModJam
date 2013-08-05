package shadowhax.crystalluscraft.block.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCrystalOre extends TileEntity {

    public int growthStage;

    @Override
    public void readFromNBT(NBTTagCompound nbt) {

        super.readFromNBT(nbt);
        growthStage = nbt.getInteger("GrowthStage");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {

        super.writeToNBT(nbt);
        nbt.setInteger("GrowthStage", growthStage);
    }

    public void updateGrowthStage() {

        growthStage++;
    }
}
