package shadowhax.modjam.block.tile;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import shadowhax.modjam.energy.IEnergyStorageBlock;

public class TileEntityShadowTest extends TileEntity implements IEnergyStorageBlock {

	private int currentEnergy = 0;
	
	public TileEntityShadowTest(World world) {
		
		super();
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
}
