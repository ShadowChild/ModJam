package shadowhax.modjam.energy;

import net.minecraftforge.common.ForgeDirection;

public interface IEnergyStorageBlock {

	// Possibly Use A Custom Enum for sharing tile entity classes
	
	int getMaxEnergyStored();
	
	int getCurrentEnergyStored();
	
	void modifyEnergy(int amount);
	
	void transferEnergy(ForgeDirection direction);
}
