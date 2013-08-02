package shadowhax.modjam.energy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public interface IEnergyCell {

	int getMaxEnergyStored(ItemStack stack);
	
	int getCurrentStored(ItemStack stack);
}
