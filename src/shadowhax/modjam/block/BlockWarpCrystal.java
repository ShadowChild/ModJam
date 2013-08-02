package shadowhax.modjam.block;

import shadowhax.modjam.ModJam;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BlockWarpCrystal extends Block
{
    public BlockWarpCrystal(int par1) {
    	
        super(par1, Material.glass);
        this.setCreativeTab(ModJam.tab);
    }
}
