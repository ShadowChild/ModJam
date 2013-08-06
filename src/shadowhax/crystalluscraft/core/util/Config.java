package shadowhax.crystalluscraft.core.util;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config {

    //Categories
    public static String settings = "Mod Settings";
    public static String itemValues = "Item Values";
    public static String blockValues = "Block Values";
    public static String guiValues = "GUI Values";

    //Blocks
    public static int warpBlockID;
    public static int energyStorageUnitID;
    public static int refiningTableID;
    public static int crystalOreID;
    public static int CrystalChestID;
    public static int compactRawCrystalBlockID;
    public static int compactRefinedCrystalBlockID;
    public static int crystalStage1ID;
    public static int crystalStage2ID;
    public static int crystalStage3ID;
    public static int crystalStage4ID;


    //Items
    public static int rawCrystalID;
    public static int warpCrystalID;
    public static int refinedCrystalID;
    public static int crystalBookID;
    public static int energyDestroyerID;
	public static int chestLinkID;
    public static int energyCellID;
    public static int itemWarpBlockID;

    //Gui
    public static int guiRefiningID;
    public static int guiCrystalBookID;

    public static void createConfig(FMLPreInitializationEvent event) {
        Reference.logger.info(Reference.MOD_NAME + "Configuration Detected!");
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());

        try {
            config.load();

            config.addCustomCategoryComment(guiValues, "Do Not Set 2 Different Gui ID's To The Same Number, This Will Break");

            warpBlockID = config.get(blockValues, "Warp Pad Block ID", 1337).getInt();
            energyStorageUnitID = config.get(blockValues, "Energy Storage Block ID", 1338).getInt();
            refiningTableID = config.get(blockValues, "Refining Table Block ID", 1339).getInt();
            crystalOreID = config.get(blockValues, "Crystal Ore Block ID", 1340).getInt();
            CrystalChestID = config.get(blockValues, "Crystal Chest Block ID", 1341).getInt();
            compactRawCrystalBlockID = config.get(blockValues, "Compact Raw Crystal Block ID", 1342).getInt();
            compactRefinedCrystalBlockID = config.get(blockValues, "Compact Refined Crystal Block ID", 1343).getInt();
            crystalStage1ID = config.get(blockValues, "Crystal Stage1 Block ID", 1344).getInt();
            crystalStage2ID = config.get(blockValues, "Crystal Stage2 Block ID", 1345).getInt();
            crystalStage3ID = config.get(blockValues, "Crystal Stage3 Block ID", 1346).getInt();
            crystalStage4ID = config.get(blockValues, "Crystal Stage5 Block ID", 1347).getInt();

            rawCrystalID = config.get(itemValues, "Raw Crystal Item ID", 5337).getInt();
            warpCrystalID = config.get(itemValues, "Warp Crystal Item ID", 5338).getInt();
            refinedCrystalID = config.get(itemValues, "Refined Crystal Item ID", 5339).getInt();
            crystalBookID = config.get(itemValues, "Crystal Book Item ID", 5340).getInt();
            energyDestroyerID = config.get(itemValues, "Energy Releaser Item ID", 5341).getInt();
            chestLinkID = config.get(itemValues, "Chest Link Item ID", 5342).getInt();
            energyCellID = config.get(itemValues, "Energy Cell Item ID", 5343).getInt();
            itemWarpBlockID = config.get(itemValues, "Item Warp Block Item ID", 5344).getInt();

            guiRefiningID = config.get(guiValues, "Refining Table GUI ID", 1).getInt();
            guiCrystalBookID = config.get(guiValues, "Crystal Book GUI ID", 2).getInt();
            
        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            if (config.hasChanged())
                config.save();
        }
        Reference.logger.info(Reference.MOD_NAME + "Config Loaded!");
    }
}
