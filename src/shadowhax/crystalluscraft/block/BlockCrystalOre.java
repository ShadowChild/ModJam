package shadowhax.crystalluscraft.block;


import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import shadowhax.crystalluscraft.CrystallusCraft;
import shadowhax.crystalluscraft.block.tile.TileEntityCrystalOre;
import shadowhax.crystalluscraft.item.Items;

import java.util.List;
import java.util.Random;

public class BlockCrystalOre extends BlockContainer {

    public int growthStage;

    public BlockCrystalOre(int id, int growthStage) {

        super(id, Material.rock);
        this.setLightOpacity(0);
        this.setTickRandomly(true);
        this.setCreativeTab(CrystallusCraft.tab);
        this.growthStage = growthStage;
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Items.rawCrystal.itemID;
    }
    
    @Override
    public TileEntity createNewTileEntity(World world) {

        return new TileEntityCrystalOre();
    }

    @Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) {

        for(int i = 0; i < 6; i++) {

            par3List.add(new ItemStack(par1, 1, i));
        }
    }

    @Override
    public boolean isOpaqueCube() {

        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {

        return false;
    }

    @Override
    public int getRenderType() {

        return -1;
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random) {

        int meta = world.getBlockMetadata(x, y, z);

        if(!world.isRemote) {

            System.out.println("tick");

            if(this.blockID != Blocks.crystalStage4.blockID) {

                world.setBlock(x, y, z, this.blockID + 1, meta, 2);
                System.out.println("update");
            }
        }
    }
}