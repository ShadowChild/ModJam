package shadowhax.modjam.block;

import shadowhax.modjam.ModJam;
import shadowhax.modjam.core.util.Config;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockRefiningTable extends Block {
	
	public BlockRefiningTable(int i) {
		
	    super(i, Material.glass);
	    this.setCreativeTab(ModJam.tab);
	}

	public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9) {
		
		if (!player.isSneaking()) {
			
			player.openGui(ModJam.instance, Config.guiRefiningID, var1, var2, var3, var4);
			return true;
		}
		else {
			return false;
		}
	}
}