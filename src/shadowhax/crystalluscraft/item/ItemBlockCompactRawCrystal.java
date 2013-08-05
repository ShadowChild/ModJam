package shadowhax.crystalluscraft.item;

import net.minecraft.item.ItemBlock;

public class ItemBlockCompactRawCrystal extends ItemBlock {
	
     public ItemBlockCompactRawCrystal(int par1) {
           super(par1);
           setHasSubtypes(true);
     }

     public int getMetadata(int par1) {
        return par1;
     }
}