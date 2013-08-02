package shadowhax.modjam;

import net.minecraft.creativetab.CreativeTabs;
import shadowhax.modjam.core.proxy.CommonProxy;
import shadowhax.modjam.util.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class ModJam {
	
	@SidedProxy(serverSide= Reference.SERVER_PROXY, clientSide= Reference.CLIENT_PROXY)
	public static CommonProxy proxy;

	@Mod.Instance(Reference.MOD_ID)
	public static ModJam instance;
	
	public static CreativeTabs tab = new CreativeTabCustom();
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent evt) {
		
		// Init Shadows Test Stuff
		new ShadowTest();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent evt) {
			
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent evt) {
		
	}
}
