package shadowhax.modjam.energy;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public interface IEnergyStorageBlock {

	// Possibly Use A Custom Enum for sharing tile entity classes
	
	int getMaxEnergyStored();
	
	int getCurrentEnergyStored();
}
