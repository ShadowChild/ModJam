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
	public static Item refinedCrystal;
	public static Item crystalBook;
	
	public static void addItems() {
		
		rawCrystal = new ItemRawCrystal(Config.rawCrystalID).setUnlocalizedName("rawCrystal");
		warpCrystal = new ItemLinkingCrystal(Config.warpCrystalID).setUnlocalizedName("warping");
		refinedCrystal = new ItemRefinedCrystal(Config.refinedCrystalID).setUnlocalizedName("refinedCrystal");
		crystalBook = new ItemCrystalBook(Config.crystalBookID).setUnlocalizedName("crystalBook");
	}
}
