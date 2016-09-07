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
import com.golems_modern.events.BuildEventHandler;
import com.golems_modern.init.ModernGolems;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class CommonProxy 
{
	protected static int entityCount;
	
	public void registerEntities() 
	{
		entityCount = 0;
		register(EntityAluminumGolem.class, "golem_aluminum");
		register(EntityAluminumBrassGolem.class, "golem_aluminumbrass");
		register(EntityCadmiumGolem.class, "golem_cadmium");
		register(EntityChromiumGolem.class, "golem_chromium");
		register(EntityGalvSteelGolem.class, "golem_galvsteel");
		register(EntityIridiumGolem.class, "golem_iridium");
		register(EntityMagnesiumGolem.class, "golem_magnesium");
		register(EntityManganeseGolem.class, "golem_manganese");
		register(EntityNichromeGolem.class, "golem_nichrome");
		register(EntityOsmiumGolem.class, "golem_osmium");
		register(EntityPlutoniumGolem.class, "golem_plutonium");
		register(EntityRutileGolem.class, "golem_rutile");
		register(EntityStainSteelGolem.class, "golem_stainsteel");
		register(EntityTantalumGolem.class, "golem_tantalum");
		register(EntityTitaniumGolem.class, "golem_titanium");
		register(EntityTungstenGolem.class, "golem_tungsten");
		register(EntityUraniumGolem.class, "golem_uranium");
		register(EntityZirconiumGolem.class, "golem_zirconium");
	}
	
	public void registerEvents()
	{
		MinecraftForge.EVENT_BUS.register(new BuildEventHandler());
	}
	
	/** registers the entity **/
	protected void register(Class entityClass, String name)
	{		
		EntityRegistry.registerModEntity(entityClass, name, ++entityCount, ModernGolems.instance, 48, 3, true);
	}
}
