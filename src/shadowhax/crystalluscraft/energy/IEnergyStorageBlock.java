package shadowhax.crystalluscraft.energy;

import shadowhax.crystalluscraft.enums.EnumEnergyType;

public interface IEnergyStorageBlock {

	// Possibly Use A Custom Enum for sharing tile entity classes
	
	int getMaxEnergyStored();
	
	int getCurrentEnergyStored();
	
	void modifyEnergy(double amount);

    void setEnergyType(EnumEnergyType type);

    boolean hasEnergyType();
}
