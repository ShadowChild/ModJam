package shadowhax.crystalluscraft.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemReed;
import shadowhax.crystalluscraft.CrystallusCraft;
import shadowhax.crystalluscraft.block.Blocks;
import shadowhax.crystalluscraft.core.util.Config;

public class Items {
	
	public static void init() {
		
		addItems();
		addNames();
	}

	public static Item rawCrystal;
	public static Item warpCrystal;
	public static Item refinedCrystal;
	public static Item crystalBook;
    public static Item energyRelease;
    public static Item chestLink;
    public static Item energyCell;
    public static Item warpBlock;
	
	public static void addItems() {
		
		rawCrystal = new ItemRawCrystal(Config.rawCrystalID).setUnlocalizedName("rawCrystal");
		warpCrystal = new ItemLinkingCrystal(Config.warpCrystalID).setUnlocalizedName("warping");
		refinedCrystal = new ItemRefinedCrystal(Config.refinedCrystalID).setUnlocalizedName("refinedCrystal");
		crystalBook = new ItemCrystalBook(Config.crystalBookID).setUnlocalizedName("Crystal Book");
        energyRelease = new ItemEnergyDestoyer(Config.energyDestroyerID).setUnlocalizedName("energyDestroyer");
        chestLink = new ItemChestLink(Config.chestLinkID).setUnlocalizedName("chestLink");
        energyCell = new ItemEnergyCell(Config.energyCellID).setUnlocalizedName("energyCell");
        warpBlock = new ItemWarpPad(Config.itemWarpBlockID).setUnlocalizedName("itemWarpBlock");
	}
	
	public static void addNames() {
		LanguageRegistry.addName(crystalBook, "Crystal Book");
		LanguageRegistry.addName(energyRelease, "Energy Remover");
		LanguageRegistry.addName(energyCell, "Energy Cell");
		LanguageRegistry.addName(warpBlock, "Crystal Warp Pad");
	}
}
