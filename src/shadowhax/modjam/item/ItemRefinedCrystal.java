package shadowhax.modjam.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import shadowhax.modjam.ModJam;

import java.util.List;

public class ItemRefinedCrystal extends Item {

    // TODO: Use EnumEnergyType somewhere
	public ItemRefinedCrystal(int id) {
		super(id);
		this.setCreativeTab(ModJam.tab);
		this.setMaxStackSize(16);
		this.hasSubtypes = true;
	}
	
	public static String[] refinedCrystalNames = new String[] {"Simplex", "Lux", "Ros", "Natura", "Obitus", "Ignis", "Zephyr"};
	private Icon[] icons = new Icon[256];
	
    @Override
    public String getItemDisplayName(ItemStack stack) {
        int i = MathHelper.clamp_int(stack.getItemDamage(), 0, 6);
        return "Refined " + refinedCrystalNames[i] + " Crystal"; 	
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir) {
    	
    	this.icons[0] = ir.registerIcon("shadowhax:Refined Simplex Crystal");
    	this.icons[1] = ir.registerIcon("shadowhax:Refined Lux Crystal");
    	this.icons[2] = ir.registerIcon("shadowhax:Refined Ros Crystal");
    	this.icons[3] = ir.registerIcon("shadowhax:Refined Natura Crystal");
    	this.icons[4] = ir.registerIcon("shadowhax:Refined Obitus Crystal");
    	this.icons[5] = ir.registerIcon("shadowhax:Refined Ignis Crystal");
    	this.icons[6] = ir.registerIcon("shadowhax:Refined Zephyr Crystal");
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubItems(int par1, CreativeTabs tabs, List list) {	
        for (int j = 0; j < 7; ++j) {
            list.add(new ItemStack(par1, 1, j));
        }
    }
    
    @Override
    public Icon getIconFromDamage(int damage) {
    	
    	return this.icons[damage];
    }
}
