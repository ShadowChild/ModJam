package shadowhax.modjam.energy;

import net.minecraftforge.common.ForgeDirection;
import shadowhax.modjam.enums.EnumEnergyType;

public interface IEnergyStorageBlock {

	// Possibly Use A Custom Enum for sharing tile entity classes
	
	int getMaxEnergyStored();
	
	int getCurrentEnergyStored();
	
	void modifyEnergy(double amount);
	
	void transferEnergy(ForgeDirection direction);

    void setEnergyType(EnumEnergyType type);

    EnumEnergyType getType();
}
