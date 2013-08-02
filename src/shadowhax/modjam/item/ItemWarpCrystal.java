package shadowhax.modjam.item;

import java.util.List;

import shadowhax.modjam.ModJam;
import shadowhax.modjam.block.Blocks;
import shadowhax.modjam.core.helpers.RayTraceHelper;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemWarpCrystal extends Item {

	public ItemWarpCrystal(int par1) {
		
		super(par1);
		this.maxStackSize = 1;
		this.setCreativeTab(ModJam.tab);
	}
	
	public static int warpX;
	public static int warpY;
	public static int warpZ;
	
	public void onCreated(ItemStack stack, World world, EntityPlayer player) {

		stack.stackTagCompound.setInteger("linkX", 0);
		stack.stackTagCompound.setInteger("linkY", 0);
		stack.stackTagCompound.setInteger("linkZ", 0);
	}
	
	public void onUpdate(ItemStack stack, World world, Entity wntity, int par4, boolean par5) {
		warpX = stack.stackTagCompound.getInteger("linkX");
		warpY = stack.stackTagCompound.getInteger("linkY");
		warpZ = stack.stackTagCompound.getInteger("linkZ");
	}
    
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
    	
    	list.add("X"+ warpX + " Y"+ warpY + " Z" + warpZ);
    }
}
