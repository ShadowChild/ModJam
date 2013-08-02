package shadowhax.modjam.block.tile;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import shadowhax.modjam.energy.IEnergyStorageBlock;

public class TileEntityShadowTest extends TileEntity implements IEnergyStorageBlock {

	private int currentEnergy;
	
	public TileEntityShadowTest() {
		
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
	public void modifyEnergy(int amount) {

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
			
			while(this.currentEnergy > transferBlock.getCurrentEnergyStored()) {
				
				this.modifyEnergy(-1);
				transferBlock.modifyEnergy(1);
			}
		}
	}
}
