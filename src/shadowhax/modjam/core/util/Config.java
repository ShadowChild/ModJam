package shadowhax.modjam.core.util;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config{
	
	//Categories
	public static String settings = "Mod Settings";
	public static String itemValues = "Item Values";
	public static String blockValues = "Block Values";
	public static String guiValues = "GUI Values";
	
	//Blocks
	public static int warpBlockID;
	public static int wiresID;
	public static int refiningTableID;
	
	//Items
	

	public static void createConfig(FMLPreInitializationEvent event){
		Reference.logger.info(Reference.MOD_NAME + "Configuration Detected!");
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		warpBlockID = config.get(blockValues, "Warp Pad Block ID", 1337).getInt();
		wiresID = config.get(blockValues, "Wire Block ID", 1338).getInt();
		refiningTableID = config.get(blockValues, "Refining Table Block ID", 1339).getInt();

		
		config.save();
		Reference.logger.info(Reference.MOD_NAME + "Config Loaded!");
	}
}
