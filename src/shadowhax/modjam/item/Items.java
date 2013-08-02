package shadowhax.modjam.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class Items {
	
	public static void init() {
		
		addItems();
		addNames();
	}
	
	public static Item unlinkedCrystal;
	public static Item linkedCrystal;
	
	public static void addItems() {
		
		linkedCrystal = new ItemLinkedCrystal(5336).setUnlocalizedName("linked");
		unlinkedCrystal = new ItemUnlinkedCrystal(5337).setUnlocalizedName("notlinked");
	}
	
	public static void addNames() {
		
		LanguageRegistry.addName(linkedCrystal, "Linked Crystal");
		LanguageRegistry.addName(unlinkedCrystal, "Unlinked Crystal");
	}

}
