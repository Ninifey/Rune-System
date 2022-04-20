package de.rinonline.korinrpg;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.rinonline.korinrpg.Helper.RINEventHandler;
import de.rinonline.korinrpg.Helper.SpellRegistry;
import de.rinonline.korinrpg.Helper.Network.PacketDispatcher;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

@Mod(modid = RINMAIN.MODID, version = RINMAIN.VERSION)
public class RINMAIN
{
    public static final String MODID = "boihm";
	public static final String name = "Binding of Isaac Heart Mod";
    public static final String VERSION = "a59";
    

	public static RINMAIN instance;

	public static SpellRegistry Spellregistry;

	public static Configuration config;
	
	public RINMAIN() {
		instance = this;
}

	@SidedProxy
	(
	clientSide = "de.rinonline.korinrpg.BasisClientProxy", 
	serverSide = "de.rinonline.korinrpg.BasisCommonProxy"
	)
	
	public static BasisCommonProxy proxy;
	public static BasisClientProxy proxyclient;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent preEvent) {
		
		config = new Configuration(preEvent.getSuggestedConfigurationFile());
		ConfigurationMoD.loadConfig();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {	
		PacketDispatcher.registerPackets();
		
		RINEventHandler events = new RINEventHandler();
        MinecraftForge.EVENT_BUS.register(events);
        FMLCommonHandler.instance().bus().register(events);
    }
    
    @EventHandler
	public void postInit(FMLPostInitializationEvent postEvent)
	{
    	Spellregistry = new SpellRegistry();
    	Spellregistry.load();
    	
	}

	public static SpellRegistry getSpellregistry() {
		return Spellregistry;
	}
}
	