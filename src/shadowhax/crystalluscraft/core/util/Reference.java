package shadowhax.crystalluscraft.core.util;

import cpw.mods.fml.common.FMLLog;

import java.util.logging.Logger;

public class Reference {

	public static final String MOD_ID = "crystalluscraft";
	public static final String MOD_NAME = "CrystallusCraft";
	public static final String MOD_VERSION = "v1 indev";
	
	public static final String CLIENT_PROXY = "shadowhax.crystalluscraft.core.proxy.ClientProxy";
	public static final String SERVER_PROXY = "shadowhax.crystalluscraft.core.proxy.CommonProxy";
    
	public static Logger logger = Logger.getLogger("CrystallusCraft");
	
	static {
		logger.setParent(FMLLog.getLogger());
	}
}
