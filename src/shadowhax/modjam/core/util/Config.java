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
	
	
	//Items
	

	public static void createConfig(FMLPreInitializationEvent event){
		Reference.logger.info(Reference.MOD_NAME + "Configuration Detected!");
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		

		
		config.save();
		Reference.logger.info(Reference.MOD_NAME + "Config Loaded!");
	}
}
