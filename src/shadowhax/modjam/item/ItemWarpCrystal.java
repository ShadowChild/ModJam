package shadowhax.modjam.item;

import shadowhax.modjam.ModJam;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWarpCrystal extends Item {

	public ItemWarpCrystal(int par1) {
		
		super(par1);
		this.maxStackSize = 1;
		this.setCreativeTab(ModJam.tab);
	}
	
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
    {
        if world.getBlockId(x, y, z){
        	
        }
        
    }
	
}
