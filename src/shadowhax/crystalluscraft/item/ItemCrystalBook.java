package shadowhax.crystalluscraft.item;

import shadowhax.crystalluscraft.CrystallusCraft;
import shadowhax.crystalluscraft.core.util.Config;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCrystalBook extends Item {
    public ItemCrystalBook(int par1) {
        super(par1);
        this.setMaxStackSize(1);
        this.setCreativeTab(CrystallusCraft.tab);
    }
    
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
    	 player.openGui(CrystallusCraft.instance, Config.guiCrystalBookID, player.worldObj, (int) player.posX, (int) player.posY, (int) player.posZ);
	return itemstack;
    }
}
