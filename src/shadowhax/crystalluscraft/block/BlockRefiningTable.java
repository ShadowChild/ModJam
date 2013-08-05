package shadowhax.crystalluscraft.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import shadowhax.crystalluscraft.CrystallusCraft;
import shadowhax.crystalluscraft.core.util.Config;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockRefiningTable extends Block {
	
	private Icon iconSide;
	private Icon iconTop;
	private Icon iconFront;
	private Icon iconBottom;

	public BlockRefiningTable(int i) {
		
	    super(i, Material.glass);
	    this.setCreativeTab(CrystallusCraft.tab);
	}

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        this.iconSide = par1IconRegister.registerIcon("crystalluscraft:Crystal Crafting Side");
        this.iconTop = par1IconRegister.registerIcon("crystalluscraft:Crystal Crafting Top");
        this.iconBottom = par1IconRegister.registerIcon("crystalluscraft:Crystal Crafting Bottom");
    }
    
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2) {
        return par1 == 1 ? this.iconTop : (par1 == 0 ?this.iconBottom : (par1 != 2 && par1 != 4 ? this.iconSide : this.iconSide));
    }
    
	public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9) {
		
		if (!player.isSneaking()) {
			
			player.openGui(CrystallusCraft.instance, Config.guiRefiningID, var1, var2, var3, var4);
			return true;
		}
		else {
			return false;
		}
	}
}