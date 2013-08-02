package shadowhax.modjam.item;

import shadowhax.modjam.ModJam;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

public class ItemWarpCrystal extends Item {

	public ItemWarpCrystal(int par1) {
		
		super(par1);
		this.maxStackSize = 1;
		this.setCreativeTab(ModJam.tab);
	}
}
