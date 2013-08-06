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
import net.minecraft.world.IBlockAccess;

public class BlockCompactCrystalRefined extends Block {
	@SideOnly(Side.CLIENT)
	private Icon[] iconArray;

	public BlockCompactCrystalRefined(int id, Material material) {
		super(id, material);
		this.setCreativeTab(CrystallusCraft.tab);
	}

	public int damageDropped(int meta) {
		return meta;
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs tab, List list) {
		for (int j = 0; j < 7; ++j) {
			list.add(new ItemStack(par1, 1, j));
		}
	}
	
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
        return this.iconArray[par2 % this.iconArray.length];
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister ir) {
		iconArray = new Icon[7];
		this.iconArray[0] = ir.registerIcon("crystalluscraft:Refined Simplex Block");		     
		this.iconArray[1] = ir.registerIcon("crystalluscraft:Refined Lux Block");		     
		this.iconArray[2] = ir.registerIcon("crystalluscraft:Refined Ros Block");		     
		this.iconArray[3] = ir.registerIcon("crystalluscraft:Refined Natura Block");		     
		this.iconArray[4] = ir.registerIcon("crystalluscraft:Refined Obitus Block");	     
		this.iconArray[5] = ir.registerIcon("crystalluscraft:Refined Ignis Block");	     
		this.iconArray[6] = ir.registerIcon("crystalluscraft:Refined Zephyrus Block");
	}
}
