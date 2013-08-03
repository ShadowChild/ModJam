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
    }
    
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
    	player.openGui(ModJam.instance, 2, world, x, y, z);
        return true;
    }
}
