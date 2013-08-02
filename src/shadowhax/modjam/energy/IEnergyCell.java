package shadowhax.modjam.energy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public interface IEnergyCell {

	int getMaxEnergyStored(ItemStack stack);
	
	int getCurrentStored(ItemStack stack);
	
	ItemStack addEnergy(int amount, ItemStack stack);
	
	ItemStack removeEnergy(int amount, ItemStack stack);
}
