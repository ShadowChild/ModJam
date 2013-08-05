package shadowhax.crystalluscraft.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Iterator;
import java.util.Random;

import shadowhax.crystalluscraft.CrystallusCraft;
import shadowhax.crystalluscraft.block.tile.TileEntityCrystalChest;

import net.minecraft.block.BlockChest;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import static net.minecraftforge.common.ForgeDirection.*;

public class BlockCrystalChest extends BlockChest {
	private final Random random = new Random();

	protected BlockCrystalChest(int par1, int par2) {
		super(par1, 0);
		this.setCreativeTab(CrystallusCraft.tab);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		if (world.isRemote) {
			return true;
		} 
		
		else {
			IInventory iinventory = this.getInventory(world, x, y, z);

			if (iinventory != null) {
				player.openGui(CrystallusCraft.instance, 3, world, x, y, z);
			}

			return true;
		}
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		TileEntityCrystalChest tileentitycrystalchest = new TileEntityCrystalChest();
		return tileentitycrystalchest;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister ir) {
		this.blockIcon = ir.registerIcon("planks_oak");
	}
}
