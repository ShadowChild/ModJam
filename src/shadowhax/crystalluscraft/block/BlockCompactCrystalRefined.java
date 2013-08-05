package shadowhax.crystalluscraft.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;

import shadowhax.crystalluscraft.CrystallusCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class BlockCompactCrystalRefined extends Block {
    @SideOnly(Side.CLIENT)
    protected Icon[] icons = new Icon[7];

    public BlockCompactCrystalRefined(int par1, Material material) {
        super(par1, Material.glass);
        this.setCreativeTab(CrystallusCraft.tab);
    }
    
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2) {
        return this.icons[par2 % this.icons.length];
    }  

    public int damageDropped(int par1) {
        return par1;
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) {
        for (int j = 0; j < 7; ++j)
        {
            par3List.add(new ItemStack(par1, 1, j));
        }
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir) {   	
    	this.icons[0] = ir.registerIcon("crystalluscraft:Refined Simplex Block");
    	this.icons[1] = ir.registerIcon("crystalluscraft:Refined Lux Block");
    	this.icons[2] = ir.registerIcon("crystalluscraft:Refined Ros Block");
    	this.icons[3] = ir.registerIcon("crystalluscraft:Refined Natura Block");
    	this.icons[4] = ir.registerIcon("crystalluscraft:Refined Obitus Block");
    	this.icons[5] = ir.registerIcon("crystalluscraft:Refined Ignis Block");
    	this.icons[6] = ir.registerIcon("crystalluscraft:Refined Zephyrus Block");
    }
}
