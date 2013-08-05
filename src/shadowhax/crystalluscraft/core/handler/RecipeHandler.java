package shadowhax.crystalluscraft.core.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import shadowhax.crystalluscraft.block.Blocks;
import shadowhax.crystalluscraft.core.util.CrystallusCraftRegistry;
import shadowhax.crystalluscraft.item.Items;

public class RecipeHandler {
	
	public static void registerRecipes(){
		
		registerVanillaShapedRecipes();
		registerVanillaShapelessRecipes();
		registerRefinedShapedRecipes();
		registerRefinedShapelessRecipes();
	}
	
	public static void registerVanillaShapedRecipes() {
		
	}
	
	public static void registerVanillaShapelessRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.refiningTable), Items.refinedCrystal, Items.refinedCrystal, Items.refinedCrystal, Items.refinedCrystal);
		
	}
	
	public static void registerRefinedShapedRecipes() {
        CrystallusCraftRegistry.addShapedRecipe(new ItemStack(Items.refinedCrystal, 3, 1),
                " xx  ",
                " xx  ",
                " xxx ",
                "  xx ",
                "  xx ",
                'x', new ItemStack(Items.rawCrystal, 1, 1)
            );
        
        CrystallusCraftRegistry.addShapedRecipe(new ItemStack(Items.refinedCrystal, 3, 2),
                " xx  ",
                " xx  ",
                " xxx ",
                "  xx ",
                "  xx ",
                'x', new ItemStack(Items.rawCrystal, 1, 2)
            );
        
        CrystallusCraftRegistry.addShapedRecipe(new ItemStack(Items.refinedCrystal, 3, 3),
                " xx  ",
                " xx  ",
                " xxx ",
                "  xx ",
                "  xx ",
                'x', new ItemStack(Items.rawCrystal, 1, 3)
            );
        
        CrystallusCraftRegistry.addShapedRecipe(new ItemStack(Items.refinedCrystal, 3, 4),
                " xx  ",
                " xx  ",
                " xxx ",
                "  xx ",
                "  xx ",
                'x', new ItemStack(Items.rawCrystal, 1, 4)
            );
        
        CrystallusCraftRegistry.addShapedRecipe(new ItemStack(Items.refinedCrystal, 3, 5),
                " xx  ",
                " xx  ",
                " xxx ",
                "  xx ",
                "  xx ",
                'x', new ItemStack(Items.rawCrystal, 1, 5)
            );
        
        CrystallusCraftRegistry.addShapedRecipe(new ItemStack(Items.refinedCrystal, 3, 6),
                " xx  ",
                " xx  ",
                " xxx ",
                "  xx ",
                "  xx ",
                'x', new ItemStack(Items.rawCrystal, 1, 6)
            );
        
        CrystallusCraftRegistry.addShapedRecipe(new ItemStack(Items.refinedCrystal, 3, 0),
                " xx  ",
                " xx  ",
                " xxx ",
                "  xx ",
                "  xx ",
                'x', new ItemStack(Items.rawCrystal, 1, 0)
            );
        
        CrystallusCraftRegistry.addShapedRecipe(new ItemStack(Blocks.compactRawCrystal, 1, 1), "xxxxx", "xxxxx", "xxxxx", "xxxxx", "xxxxx",
                'x', new ItemStack(Items.rawCrystal, 1, 1)
            );
        
        CrystallusCraftRegistry.addShapedRecipe(new ItemStack(Blocks.compactRawCrystal, 1, 2), "xxxxx", "xxxxx", "xxxxx", "xxxxx", "xxxxx",
                'x', new ItemStack(Items.rawCrystal, 1, 2)
            );
        
        CrystallusCraftRegistry.addShapedRecipe(new ItemStack(Blocks.compactRawCrystal, 1, 3), "xxxxx", "xxxxx", "xxxxx", "xxxxx", "xxxxx",
                'x', new ItemStack(Items.rawCrystal, 1, 3)
            );
        
        CrystallusCraftRegistry.addShapedRecipe(new ItemStack(Blocks.compactRawCrystal, 1, 4), "xxxxx", "xxxxx", "xxxxx", "xxxxx", "xxxxx",
                'x', new ItemStack(Items.rawCrystal, 1, 4)
            );
        
        CrystallusCraftRegistry.addShapedRecipe(new ItemStack(Blocks.compactRawCrystal, 1, 5), "xxxxx", "xxxxx", "xxxxx", "xxxxx", "xxxxx",
                'x', new ItemStack(Items.rawCrystal, 1, 5)
            );
        CrystallusCraftRegistry.addShapedRecipe(new ItemStack(Blocks.compactRawCrystal, 1, 6), "xxxxx", "xxxxx", "xxxxx", "xxxxx", "xxxxx",
                'x', new ItemStack(Items.rawCrystal, 1, 6)
            );
        
        CrystallusCraftRegistry.addShapedRecipe(new ItemStack(Blocks.compactRawCrystal, 1, 0), "xxxxx", "xxxxx", "xxxxx", "xxxxx", "xxxxx",
                'x', new ItemStack(Items.rawCrystal, 1, 0)
            );
        
        CrystallusCraftRegistry.addShapedRecipe(new ItemStack(Items.warpCrystal), "xxx","xyx","xxx",
                'x', new ItemStack(Items.rawCrystal), 'y', new ItemStack(Item.enderPearl)
            );
        
        CrystallusCraftRegistry.addShapedRecipe(new ItemStack(Items.warpCrystal), "xxx","xyx","xxx",
                'x', new ItemStack(Block.stone), 'y', new ItemStack(Items.warpCrystal)
            );
	}
	
	public static void registerRefinedShapelessRecipes() {
		
	}

}
