package shadowhax.modjam.item;

import java.util.List;

import shadowhax.modjam.ModJam;
import shadowhax.modjam.block.Blocks;
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
    	stack.setTagCompound(new NBTTagCompound());

        return true;
    }
}
