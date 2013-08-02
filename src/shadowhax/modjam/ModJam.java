package shadowhax.modjam;

import java.util.Arrays;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import shadowhax.modjam.block.Blocks;
import shadowhax.modjam.core.events.InteractionHandler;
import shadowhax.modjam.core.proxy.CommonProxy;
import shadowhax.modjam.item.Items;
import shadowhax.modjam.util.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
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
		
		getModMeta(evt.getModMetadata());
		
		new ShadowTest(); //test
		Blocks.init(); //Not sure if shadow wants things done this way, if not change it. 
		Items.init(); //Same with this.
		
		MinecraftForge.EVENT_BUS.register(new InteractionHandler());
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent evt) {
			
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent evt) {
		
	}
	
	private void getModMeta(ModMetadata meta) {
		
		meta.authorList = Arrays.asList(new String[] {"Darkhax", "ShadowChild", "ThisGuy1045"});
		meta.logoFile = "null"; //I think this is still buggeed
		meta.autogenerated = false;
		meta.credits = "Coded by Darkhax and ShadowChild. Textures by ThisGuy1045";
		meta.description = "Don't want to give away the idea right now ;p";
		meta.url = "https://github.com/ShadowChild/ModJam";
	}
}
