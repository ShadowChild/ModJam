package shadowhax.modjam.item;

import shadowhax.modjam.ModJam;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.world.World;

public class ItemCrystalBook extends Item {
    public ItemCrystalBook(int par1) {
        super(par1);
        this.setMaxStackSize(1);
        this.setCreativeTab(ModJam.tab);
    }
    
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
    player.openGui(ModJam.instance, 1, world, 0, 0, 0);
	return itemstack;
    }
}
