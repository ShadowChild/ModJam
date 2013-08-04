package shadowhax.crystalluscraft.block;

import static net.minecraftforge.common.ForgeDirection.DOWN;

import java.util.Iterator;
import java.util.Random;

import shadowhax.crystalluscraft.CrystallusCraft;
import shadowhax.crystalluscraft.block.tile.TileEntityCrystalChest;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCrystalChest extends BlockContainer
{
	private Random random = new Random();

	public BlockCrystalChest(int par1) {
		super(par1, Material.glass);
		setHardness(1.5F);
		setCreativeTab(CrystallusCraft.tab);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		blockIcon = par1IconRegister.registerIcon("");
	}

	/**
	 * ejects contained items into the world, and notifies neighbours of an update, as appropriate
	 */
	@Override
	public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
	{
		TileEntityCrystalChest var7 = (TileEntityCrystalChest) par1World.getBlockTileEntity(par2, par3, par4);

		if (var7 != null)
		{
			for (int var8 = 0; var8 < var7.getSizeInventory(); ++var8)
			{
				ItemStack var9 = var7.getStackInSlot(var8);

				if (var9 != null)
				{
					float var10 = random.nextFloat() * 0.8F + 0.1F;
					float var11 = random.nextFloat() * 0.8F + 0.1F;
					EntityItem var14;

					for (float var12 = random.nextFloat() * 0.8F + 0.1F; var9.stackSize > 0; par1World.spawnEntityInWorld(var14))
					{
						int var13 = random.nextInt(21) + 10;

						if (var13 > var9.stackSize)
						{
							var13 = var9.stackSize;
						}

						var9.stackSize -= var13;
						var14 = new EntityItem(par1World, par2 + var10, par3 + var11, par4 + var12, new ItemStack(var9.itemID, var13, var9.getItemDamage()));
						float var15 = 0.05F;
						var14.motionX = (float) random.nextGaussian() * var15;
						var14.motionY = (float) random.nextGaussian() * var15 + 0.2F;
						var14.motionZ = (float) random.nextGaussian() * var15;

						if (var9.hasTagCompound())
						{
							var14.getEntityItem().setTagCompound((NBTTagCompound) var9.getTagCompound().copy());
						}
					}
				}
			}
		}

		super.breakBlock(par1World, par2, par3, par4, par5, par6);
	}

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
        if (par1World.isRemote)
        {
            return true;
        }
        else
        {
            IInventory iinventory = this.getInventory(par1World, par2, par3, par4);

            if (iinventory != null)
            {
                par5EntityPlayer.displayGUIChest(iinventory);
            }

            return true;
        }
	}

	@Override
	public TileEntity createNewTileEntity(World par1World)
	{
		return new TileEntityCrystalChest();
	}

	@Override
    public boolean hasComparatorInputOverride()
    {
        return true;
    }

    @Override
    public int getComparatorInputOverride(World par1World, int par2, int par3, int par4, int par5)
    {
        return Container.calcRedstoneFromInventory(this.getInventory(par1World, par2, par3, par4));
    }

	public static boolean isOcelotBlockingChest(World par0World, int par1, int par2, int par3)
	{
		Iterator iterator = par0World.getEntitiesWithinAABB(EntityOcelot.class, AxisAlignedBB.getAABBPool().getAABB(par1, par2 + 1, par3, par1 + 1, par2 + 2, par3 + 1)).iterator();
		EntityOcelot entityocelot;

		do
		{
			if (!iterator.hasNext())
				return false;

			EntityOcelot entityocelot1 = (EntityOcelot) iterator.next();
			entityocelot = entityocelot1;
		} while (!entityocelot.isSitting());

		return true;
	}
    
    public IInventory getInventory(World par1World, int par2, int par3, int par4)
    {
        IInventory object = (TileEntityCrystalChest)par1World.getBlockTileEntity(par2, par3, par4);

        if (object == null)
        {
            return null;
        }
        else if (isOcelotBlockingChest(par1World, par2, par3, par4))
        {
            return null;
        }
        else
        {
            return (IInventory)object;
        }
    }

}