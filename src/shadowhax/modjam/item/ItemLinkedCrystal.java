package shadowhax.modjam.item;

import shadowhax.modjam.ModJam;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemLinkedCrystal extends Item{

	public ItemLinkedCrystal(int id) {
		super(id);
		this.setCreativeTab(ModJam.tab);
	}
}
