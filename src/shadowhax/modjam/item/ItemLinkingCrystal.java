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
	
	private int posX;
	private int posY;
	private int posZ;
	
    public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
    	
    	stack.setTagCompound(new NBTTagCompound());
    	posX = stack.stackTagCompound.getInteger("linkX");
    	posY = stack.stackTagCompound.getInteger("linkY");
    	posZ = stack.stackTagCompound.getInteger("linkZ");
    }
	
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {   	

    	if (stack.getItemDamage() == 0){        	
        	if (world.getBlockId(x, y, z) == Blocks.warpBlock.blockID) {
            	stack.stackTagCompound.setInteger("linkX", x);
            	stack.stackTagCompound.setInteger("linkY", y);
            	stack.stackTagCompound.setInteger("linkZ", z);
            	
            	stack.setItemDamage(1);
        	}
    	}
    	
    	if (stack.getItemDamage() == 1) {
    		if(world.getBlockId(posX, posY, posZ) == Blocks.warpBlock.blockID){
    			player.posX = this.posX;
    			player.posY = this.posY;
    			player.posZ = this.posZ;
    			player.setPositionAndUpdate(posX, posY, posZ);
    			--stack.stackSize;
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
