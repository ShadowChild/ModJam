package shadowhax.modjam.energy;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public interface IEnergyCell {

	int getMaxEnergyStored(ItemStack stack);
	
	int getCurrentStored(ItemStack stack);
	
	ItemStack addEnergy(int amount, ItemStack stack);
	
	ItemStack removeEnergy(int amount, ItemStack stack);
}
