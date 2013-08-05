package shadowhax.crystalluscraft.block;


import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import shadowhax.crystalluscraft.CrystallusCraft;
import shadowhax.crystalluscraft.block.tile.TileEntityCrystalOre;

import java.util.List;

public class BlockCrystalOre extends BlockContainer {

    public BlockCrystalOre(int id) {

        super(id, Material.rock);
        this.setLightOpacity(0);
        this.setTickRandomly(true);
        this.setCreativeTab(CrystallusCraft.tab);
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
}