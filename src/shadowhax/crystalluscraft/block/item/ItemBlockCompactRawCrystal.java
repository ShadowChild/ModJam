package shadowhax.crystalluscraft.block.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemBlockCompactRawCrystal extends ItemBlock {
	
     public ItemBlockCompactRawCrystal(int par1) {
           super(par1);
           setHasSubtypes(true);
     }

     public int getMetadata(int par1) {
        return par1;
     }
     
     public Icon getIconFromDamage(int par1){
         if(this.itemID < 4096 && Block.blocksList[this.itemID].getRenderType() == 1)
          return Block.blocksList[this.itemID].getIcon(0, par1);
         else return super.getIconFromDamage(par1);
        }
     
     public String getUnlocalizedName(ItemStack stack){
         
         return getUnlocalizedName() + "_" + stack.getItemDamage();
        }
}