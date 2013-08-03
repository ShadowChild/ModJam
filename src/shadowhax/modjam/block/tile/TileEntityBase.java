package shadowhax.modjam.block.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import shadowhax.modjam.energy.IEnergyStorageBlock;
import shadowhax.modjam.enums.EnumEnergyType;

public class TileEntityBase extends TileEntity implements IEnergyStorageBlock {

	protected int currentEnergy;
    protected EnumEnergyType type;
	
	public TileEntityBase() {
		
		super();
//		createAndLoadEntity(new NBTTagCompound());
	}

	@Override
	public int getMaxEnergyStored() {

		return 2000;
	}

	@Override
	public int getCurrentEnergyStored() {

		return currentEnergy;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		
		super.readFromNBT(nbt);
		
		currentEnergy = nbt.getInteger("EnergyStored");
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		
		super.writeToNBT(nbt);
		
		nbt.setInteger("EnergyStored", currentEnergy);
	}

	@Override
	public void modifyEnergy(double amount) {

		this.currentEnergy += amount;

		System.out.println(currentEnergy);
	}

	@Override
	public void transferEnergy(ForgeDirection direction) {
		
		TileEntity neighborBlock;
		IEnergyStorageBlock transferBlock;
		
		neighborBlock = worldObj.getBlockTileEntity(xCoord + direction.offsetX, yCoord + direction.offsetY, zCoord + direction.offsetZ);
		
		if(neighborBlock != null && neighborBlock instanceof IEnergyStorageBlock) {
			
			transferBlock = (IEnergyStorageBlock)neighborBlock;
			
			while(this.currentEnergy > 0) {
				
				this.modifyEnergy(-1);
				transferBlock.modifyEnergy(1);
			}
		}
	}

    @Override
    public void setEnergyType(EnumEnergyType type) {

        this.type = type;
    }

    @Override
    public EnumEnergyType getType() {

        return this.type;
    }
}
