package shadowhax.modjam.item;

import java.util.List;

import shadowhax.modjam.ModJam;
import shadowhax.modjam.block.Blocks;
import shadowhax.modjam.core.helpers.RayTraceHelper;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
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
	
	public static double warpX;
	public static double warpY;
	public static double warpZ;
    
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
    	
    	list.add("X"+ warpX + " Y"+ warpY + " Z" + warpZ);
    }
}
