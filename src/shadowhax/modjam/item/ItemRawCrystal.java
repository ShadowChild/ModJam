package shadowhax.modjam.item;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import shadowhax.modjam.ModJam;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class ItemRawCrystal extends Item{
	
	public ItemRawCrystal(int id) {
		super(id);
		this.setCreativeTab(ModJam.tab);
		this.setMaxStackSize(16);
		this.hasSubtypes = true;
	}
	
	public static String[] rawCrystalNames = new String[] {"Simplex", "Lux", "Ros", "Natura", "Obitus", "Ignis", "Zephyr"};
	
    @Override
    public String getItemDisplayName(ItemStack stack) {
    	
        int i = MathHelper.clamp_int(stack.getItemDamage(), 0, 6);
        return "Raw " + rawCrystalNames[i] + " Crystal"; 	
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubItems(int par1, CreativeTabs tabs, List list) {	
        for (int j = 0; j < 7; ++j) {
            list.add(new ItemStack(par1, 1, j));
        }
    }
}
