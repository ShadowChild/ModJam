package shadowhax.modjam.item;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import shadowhax.modjam.ModJam;
import shadowhax.modjam.block.Blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemLinkingCrystal extends Item{

	public ItemLinkingCrystal(int id) {
		super(id);
		this.setCreativeTab(ModJam.tab);
		this.hasSubtypes = true;
	}

    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {   	

    	if (stack.getItemDamage() == 1) {
    		int posX = stack.stackTagCompound.getInteger("linkX");
    		int posY = stack.stackTagCompound.getInteger("linkY");
    		int posZ = stack.stackTagCompound.getInteger("linkZ");
    		
    		if(world.getBlockId(posX, posY, posZ) == Blocks.warpBlock.blockID){
    			player.setPositionAndUpdate(posX, posY, posZ);
    			--stack.stackSize;
    		}
    	}
    	
    	if (stack.getItemDamage() == 0){        	
        	if (world.getBlockId(x, y, z) == Blocks.warpBlock.blockID) {
            	stack.setTagCompound(new NBTTagCompound());
            	stack.stackTagCompound.setInteger("linkX", x);
            	stack.stackTagCompound.setInteger("linkY", y);
            	stack.stackTagCompound.setInteger("linkZ", z);      	
            	stack.setItemDamage(1);
        	}
    	}
    	
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int j = 0; j < 2; ++j)
        {
            par3List.add(new ItemStack(par1, 1, j));
        }
    }
}
