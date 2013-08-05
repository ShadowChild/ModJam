package shadowhax.crystalluscraft.item;

import net.minecraft.item.ItemBlock;

public class ItemBlockCompactRefinedCrystal extends ItemBlock {
	
     public ItemBlockCompactRefinedCrystal(int par1) {
           super(par1);
           setHasSubtypes(true);
     }

     public int getMetadata(int par1) {
        return par1;
     }
}