package de.rinonline.korinskills;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import de.rinonline.korinskills.network.PacketDispatcher;
import de.rinonline.korinskills.skills.RINEventHandler;
import de.rinonline.korinskills.skills.SpellRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

@Mod(modid = SKILLSMAIN.MODID, version = SKILLSMAIN.VERSION,name =SKILLSMAIN.name )
public class SKILLSMAIN
{
    public static final String MODID = "korinskills";
	public static final String name = "Kingdom of RIN | Skills";
    public static final String VERSION = "1.0 Beta";
    

	public static SKILLSMAIN instance;

	public static SpellRegistry Spellregistry;

	public static Configuration config;
	
	public SKILLSMAIN() {
		instance = this;
}

	@SidedProxy
	(
	clientSide = "de.rinonline.korinskills.BasisClientProxy", 
	serverSide = "de.rinonline.korinskills.BasisCommonProxy"
	)
	
	public static BasisCommonProxy proxy;
	public static BasisClientProxy proxyclient;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent preEvent) {
		
		config = new Configuration(preEvent.getSuggestedConfigurationFile());
		ConfigurationMoD.loadConfig();
		
    	ModRegistry.mainRegistry();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {	
    	
		PacketDispatcher.registerPackets();
		
		RINEventHandler events = new RINEventHandler();
        MinecraftForge.EVENT_BUS.register(events);
        FMLCommonHandler.instance().bus().register(events);
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new ModGuiHandler());
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
	