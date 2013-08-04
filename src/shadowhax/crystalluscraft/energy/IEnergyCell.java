package shadowhax.crystalluscraft.energy;

import net.minecraft.item.ItemStack;

public interface IEnergyCell {

	int getMaxEnergyStored(ItemStack stack);
	
	int getCurrentStored(ItemStack stack);
	
	ItemStack modifyEnergy(int amount, ItemStack stack);
}
