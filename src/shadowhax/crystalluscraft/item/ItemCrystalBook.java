package shadowhax.crystalluscraft.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import shadowhax.crystalluscraft.CrystallusCraft;
import shadowhax.crystalluscraft.client.gui.CrystalBookGui;
import shadowhax.crystalluscraft.core.proxy.ClientProxy;
import shadowhax.crystalluscraft.core.util.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ItemCrystalBook extends Item {
    public ItemCrystalBook(int par1) {
        super(par1);
        this.setMaxStackSize(1);
        this.setCreativeTab(CrystallusCraft.tab);
    }
    
    @SideOnly(Side.CLIENT)
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
    	ClientProxy.openGui(world, player);
    	return itemstack;
    }
}
