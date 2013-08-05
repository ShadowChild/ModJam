package shadowhax.crystalluscraft.block.tile;

import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCrystalOre extends TileEntity {

    @Override
    public void readFromNBT(NBTTagCompound nbt) {

        super.readFromNBT(nbt);

        this.blockType = Block.blocksList[nbt.getInteger("BlockId")];
        this.blockMetadata = nbt.getInteger("BlockMetadata");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {

        super.writeToNBT(nbt);

        nbt.setInteger("BlockId", this.blockType.blockID);
        nbt.setInteger("BlockMetadata", this.blockMetadata);
    }
}
