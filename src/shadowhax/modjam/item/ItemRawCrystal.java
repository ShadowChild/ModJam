package shadowhax.modjam.item;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import shadowhax.modjam.ModJam;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemRawCrystal extends Item{
	
	public ItemRawCrystal(int id) {
		super(id);
		this.setCreativeTab(ModJam.tab);
		this.setMaxStackSize(16);
		this.hasSubtypes = true;
	}
	
	public static String[] rawCrystalNames = new String[] {"Simplex", "Lux", "Ros", "Natura", "Obitus", "Ignis", "Zephyr"};
	private Icon[] icons;
	
    @Override
    public String getItemDisplayName(ItemStack stack) {
        int i = MathHelper.clamp_int(stack.getItemDamage(), 0, 6);
        return "Raw " + rawCrystalNames[i] + " Crystal"; 	
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir) {
    	
    	this.icons[0] = ir.registerIcon("shadowhax:Raw Simplex Crystal");
    	this.icons[1] = ir.registerIcon("shadowhax:Raw Lux Crystal");
    	this.icons[2] = ir.registerIcon("shadowhax:Raw Ros Crystal");
    	this.icons[3] = ir.registerIcon("shadowhax:Raw Natura Crystal");
    	this.icons[4] = ir.registerIcon("shadowhax:Raw Obitus Crystal");
    	this.icons[5] = ir.registerIcon("shadowhax:Raw Ignis Crystal");
    	this.icons[6] = ir.registerIcon("shadowhax:Raw Zephyr Crystal");
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubItems(int par1, CreativeTabs tabs, List list) {	
        for (int j = 0; j < 7; ++j) {
            list.add(new ItemStack(par1, 1, j));
        }
    }
}
