package shadowhax.modjam.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import shadowhax.modjam.energy.IEnergyCell;

public class ItemShadowTest extends Item implements IEnergyCell {

	public ItemShadowTest(int par1) {
		
		super(par1);
	}

	@Override
	public String getItemDisplayName(ItemStack par1ItemStack) {
		
		return "Shadows Test Item";
	}

	@Override
	public int getMaxEnergyStored(ItemStack stack, EntityPlayer player) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCurrentStored(ItemStack stack, NBTTagCompound nbt) {
		// TODO Auto-generated method stub
		return 0;
	}
}
