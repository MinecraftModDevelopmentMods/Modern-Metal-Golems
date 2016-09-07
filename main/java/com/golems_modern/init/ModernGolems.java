package com.golems_modern.init;

import com.golems_modern.proxy.CommonProxy;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModernGolems.MODID, name = ModernGolems.NAME, version = ModernGolems.VERSION, dependencies = ModernGolems.DEPENDENCIES, acceptedMinecraftVersions = ModernGolems.MCVERSION)
public class ModernGolems 
{
	public static final String MODID = "golems_modern";
	public static final String DEPENDENCIES = "required-after:golems@[6.01,);required-after:modernmetals";
	public static final String NAME = "Modern Metal Golems Addon";
	public static final String VERSION = "6.01.1";
	public static final String MCVERSION = "1.10";
	
	@Mod.Instance(ModernGolems.MODID)
	public static ModernGolems instance;
	
	@SidedProxy(clientSide = "com." + MODID + ".proxy.ClientProxy", serverSide = "com." + MODID + ".proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) 
	{	
		ModernConfig.mainRegistry(new Configuration(event.getSuggestedConfigurationFile()));
		proxy.registerEntities();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) 
	{
		proxy.registerEvents();
	}
}

