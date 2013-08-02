package shadowhax.modjam.item;

import shadowhax.modjam.ModJam;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemUnlinkedCrystal extends Item{

	public ItemUnlinkedCrystal(int id) {
		super(id);
		this.setCreativeTab(ModJam.tab);
	}
	
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
    	par1ItemStack.setTagCompound(new NBTTagCompound());
        par1ItemStack.stackTagCompound.setInteger("ffs", 666);
        return true;
    }

}
