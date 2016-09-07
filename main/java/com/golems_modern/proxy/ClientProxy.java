package com.golems_modern.proxy;

import com.golems_modern.entity.EntityAluminumBrassGolem;
import com.golems_modern.entity.EntityAluminumGolem;
import com.golems_modern.entity.EntityCadmiumGolem;
import com.golems_modern.entity.EntityChromiumGolem;
import com.golems_modern.entity.EntityGalvSteelGolem;
import com.golems_modern.entity.EntityIridiumGolem;
import com.golems_modern.entity.EntityMagnesiumGolem;
import com.golems_modern.entity.EntityManganeseGolem;
import com.golems_modern.entity.EntityNichromeGolem;
import com.golems_modern.entity.EntityOsmiumGolem;
import com.golems_modern.entity.EntityPlutoniumGolem;
import com.golems_modern.entity.EntityRutileGolem;
import com.golems_modern.entity.EntityStainSteelGolem;
import com.golems_modern.entity.EntityTantalumGolem;
import com.golems_modern.entity.EntityTitaniumGolem;
import com.golems_modern.entity.EntityTungstenGolem;
import com.golems_modern.entity.EntityUraniumGolem;
import com.golems_modern.entity.EntityZirconiumGolem;
import com.golems_modern.events.InfoEventHandler;

import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy 
{
	@Override
	public void registerEntities()
	{
		super.registerEntities();
		com.golems.proxies.ClientProxy.registerColorized(EntityAluminumGolem.class);
		com.golems.proxies.ClientProxy.registerTextured(EntityAluminumBrassGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityCadmiumGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityChromiumGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityGalvSteelGolem.class);
		com.golems.proxies.ClientProxy.registerTextured(EntityIridiumGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityMagnesiumGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityManganeseGolem.class);
		com.golems.proxies.ClientProxy.registerTextured(EntityNichromeGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityOsmiumGolem.class);
		com.golems.proxies.ClientProxy.registerTextured(EntityPlutoniumGolem.class);
		com.golems.proxies.ClientProxy.registerTextured(EntityRutileGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityStainSteelGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityTantalumGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityTitaniumGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityTungstenGolem.class);
		com.golems.proxies.ClientProxy.registerTextured(EntityUraniumGolem.class);
		com.golems.proxies.ClientProxy.registerColorized(EntityZirconiumGolem.class);
	}
	
	@Override
	public void registerEvents()
	{
		super.registerEvents();
		MinecraftForge.EVENT_BUS.register(new InfoEventHandler());
	}
}
