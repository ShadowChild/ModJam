package shadowhax.crystalluscraft.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import shadowhax.crystalluscraft.CrystallusCraft;
import shadowhax.crystalluscraft.core.proxy.ClientProxy;
import shadowhax.crystalluscraft.energy.IEnergyCell;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

// Ready To Be Renamed
public class ItemShadowTest extends Item implements IEnergyCell {

	public ItemShadowTest(int par1) {

		super(par1);
		this.setMaxStackSize(1);
		this.setCreativeTab(CrystallusCraft.tab);
		this.setMaxDamage(getMaxEnergyStored(null));
	}

	@Override
	public String getItemDisplayName(ItemStack par1ItemStack) {

		return "Shadows Test Item";
	}

	@Override
	public int getMaxEnergyStored(ItemStack stack) {

		return 1000;
	}

	@Override
	public int getCurrentStored(ItemStack stack) {

		if(stack.getTagCompound() == null) {

			stack.setTagCompound(new NBTTagCompound());
			stack.getTagCompound().setInteger("CurrentEnergy", 0);
		}

		return stack.getTagCompound().getInteger("CurrentEnergy");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {

		if(ClientProxy.isShiftKeyDown()) {
			
			par3List.add("Max Energy Stored = " + this.getMaxDamage());
			par3List.add("Current Stored Energy = " + this.getCurrentStored(par1ItemStack));
			par3List.add("Current Damage = " + par1ItemStack.getItemDamage());
		} else {
			
			par3List.add("Press <SHIFT> for more info");
		}
	}

	@Override
	public ItemStack addEnergy(int amount, ItemStack stack) {

		if(stack.getTagCompound() == null) {

			stack.setTagCompound(new NBTTagCompound());
			stack.getTagCompound().setInteger("CurrentEnergy", 0);
		}

		int curEnergy = getCurrentStored(stack);

		if(!(curEnergy + amount > getMaxEnergyStored(stack))) {

			stack.getTagCompound().setInteger("CurrentEnergy", curEnergy + amount);
		}

		return stack;
	}

	@Override
	public ItemStack removeEnergy(int amount, ItemStack stack) {

		if(stack.getTagCompound() == null) {

			stack.setTagCompound(new NBTTagCompound());
			stack.getTagCompound().setInteger("CurrentEnergy", 0);
		}

		int curEnergy = getCurrentStored(stack);

		if(!(curEnergy - amount < 0)) {

			stack.getTagCompound().setInteger("CurrentEnergy", curEnergy - amount);
		}

		return stack;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {

		if(!world.isRemote && !player.isSneaking()) {

			return addEnergy(200, stack);
		} else if(!world.isRemote && player.isSneaking()) {

			return removeEnergy(200, stack);
		}

		return stack;
	}
}
