package shadowhax.modjam.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class Items {
	
	public static void init() {
		
		addItems();
		addNames();
	}
	
	public static Item warpCrystal;
	
	public static void addItems() {
		
		warpCrystal = new ItemWarpCrystal(5337);
	}
	
	public static void addNames() {
		
		LanguageRegistry.addName(warpCrystal, "Warp Crystal");
	}

}
