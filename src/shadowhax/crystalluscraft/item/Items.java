package shadowhax.crystalluscraft.item;

import net.minecraft.item.Item;
import shadowhax.crystalluscraft.core.util.Config;

public class Items {
	
	public static void init() {
		
		addItems();
	}

	public static Item rawCrystal;
	public static Item warpCrystal;
	public static Item refinedCrystal;
	public static Item crystalBook;
    public static Item energyRelease;
    public static Item chestLink;
    public static Item energyCell;
	
	public static void addItems() {
		
		rawCrystal = new ItemRawCrystal(Config.rawCrystalID).setUnlocalizedName("rawCrystal");
		warpCrystal = new ItemLinkingCrystal(Config.warpCrystalID).setUnlocalizedName("warping");
		refinedCrystal = new ItemRefinedCrystal(Config.refinedCrystalID).setUnlocalizedName("refinedCrystal");
		crystalBook = new ItemCrystalBook(Config.crystalBookID).setUnlocalizedName("crystalBook");
        energyRelease = new ItemEnergyDestoyer(Config.energyDestroyerID).setUnlocalizedName("energyDestroyer");
        chestLink = new ItemChestLink(Config.chestLinkID).setUnlocalizedName("chestLink");
        energyCell = new ItemEnergyCell(Config.energyCellID).setUnlocalizedName("energyCell");
	}
}
