package shadowhax.modjam.item;

import java.util.List;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import shadowhax.modjam.ModJam;
import shadowhax.modjam.energy.IEnergyCell;

// Ready To Be Renamed
public class ItemShadowTest extends Item implements IEnergyCell {

	public ItemShadowTest(int par1) {
		
		super(par1);
		this.setMaxStackSize(1);
		this.setCreativeTab(ModJam.tab);
		this.setMaxDamage(getMaxEnergyStored(new ItemStack(this, 0, 0)));
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
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		
		par3List.add("Max Energy Stored = " + this.getMaxDamage());
		par3List.add("Current Stored Energy = " + this.getCurrentStored(par1ItemStack));
		par3List.add("Current Damage = " + this.getDamage(par1ItemStack));
	}

	@Override
	public ItemStack addEnergy(int amount, ItemStack stack, EntityLivingBase player) {

		if(stack.getTagCompound() == null) {
			
			stack.setTagCompound(new NBTTagCompound());
			stack.getTagCompound().setInteger("CurrentEnergy", 0);
		}
		
		int curEnergy = getCurrentStored(stack);
		
		if(!(curEnergy + amount > getMaxEnergyStored(stack))) {
		
			stack.getTagCompound().setInteger("CurrentEnergy", curEnergy + amount);
			stack.damageItem(amount, player);
		}
		
		return stack;
	}

	@Override
	public ItemStack removeEnergy(int amount, ItemStack stack, EntityLivingBase player) {

		if(stack.getTagCompound() == null) {
			
			stack.setTagCompound(new NBTTagCompound());
			stack.getTagCompound().setInteger("CurrentEnergy", 0);
		}
		
		int curEnergy = getCurrentStored(stack);
		
		if(!(curEnergy - amount < 0)) {
			
			stack.getTagCompound().setInteger("CurrentEnergy", curEnergy - amount);
			stack.damageItem(-amount, player);
		}
		
		return stack;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		
		if(!world.isRemote && !player.isSneaking()) {
			
			return addEnergy(200, stack, player);
		} else if(!world.isRemote && player.isSneaking()) {
			
			return removeEnergy(200, stack, player);
		}
		
		return stack;
	}
	
	@Override
	public int getDamage(ItemStack stack) {
		
		if(stack.getTagCompound() == null) {
			
			stack.setTagCompound(new NBTTagCompound());
			stack.getTagCompound().setInteger("CurrentEnergy", 0);
		}
		
		return getMaxEnergyStored(stack) - stack.getTagCompound().getInteger("CurrentEnergy");
	}
}
