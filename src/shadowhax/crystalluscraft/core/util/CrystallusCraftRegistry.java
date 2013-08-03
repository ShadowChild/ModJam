package shadowhax.crystalluscraft.core.util;

import shadowhax.crystalluscraft.recipe.RefinedRecipeManager;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

public class CrystallusCraftRegistry {
	
	/**
	 * Used to add a shaped crafting recipe to the 5x5 refined table.
	 * @param output: The ItemStack that will be created by the table
	 * @param params: The crafting grid recipe locations, Acts like vanilla recipe
	 * @return
	 */
    public static IRecipe addShapedRecipe(ItemStack output, Object... params) {
        return RefinedRecipeManager.getInstance().addShapedRecipe(output, params);
    }

    /**
     * Used to add a shapeless crafting recipe to the 5x5 refined table. 
     * @param output: The ItemStack that will be created by the table
     * @param params: The ingredients for the recipe, See vanilla shapeless recipes
     */
    public static void addShapelessRecipe(ItemStack output, Object... params) {
        RefinedRecipeManager.getInstance().addShapelessRecipe(output, params);
    }	
}
