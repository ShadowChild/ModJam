package shadowhax.modjam.item;

import shadowhax.modjam.core.util.Config;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class Items {
	
	public static void init() {
		
		addItems();
	}

	public static Item rawCrystal;
	public static Item warpCrystal;
	
	public static void addItems() {
		
		rawCrystal = new ItemRawCrystal(Config.rawCrystalID).setUnlocalizedName("rawCrystal");
		warpCrystal = new ItemLinkingCrystal(Config.warpCrystalID).setUnlocalizedName("warping");
	}
}
