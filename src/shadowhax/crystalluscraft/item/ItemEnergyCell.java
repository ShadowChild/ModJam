package shadowhax.crystalluscraft.item;


import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import shadowhax.crystalluscraft.energy.IEnergyCell;

public class ItemEnergyCell extends Item implements IEnergyCell {

    public ItemEnergyCell(int id) {

        super(id);
    }

    @Override
    public int getMaxEnergyStored(ItemStack stack) {

        return 1600;
    }

    @Override
    public int getCurrentStored(ItemStack stack) {

        if(stack.getTagCompound() == null) {

            stack.getTagCompound().setInteger("EnergyStored", 0);
        }

        return stack.getTagCompound().getInteger("EnergyStored");
    }

    @Override
    public ItemStack modifyEnergy(int amount, ItemStack stack) {

        int curStored = getCurrentStored(stack);

        if(!(curStored + amount > getMaxEnergyStored(stack))) {

            curStored += amount;
            stack.getTagCompound().setInteger("EnergyStored", curStored);
        }

        return stack;
    }
}
