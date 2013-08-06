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

public class BlockCompactCrystalRaw extends Block {
	@SideOnly(Side.CLIENT)
	private Icon[] iconArray;

	public BlockCompactCrystalRaw(int id, Material material) {
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
}
