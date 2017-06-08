package com.golems_modern.init;

import com.golems.util.GolemConfigSet;
import com.golems_modern.entity.EntityMagnesiumGolem;
import com.golems_modern.entity.EntityPlutoniumGolem;

import net.minecraftforge.common.config.Configuration;

public class ModernConfig 
{
	public static GolemConfigSet ALUMINUM;
	public static GolemConfigSet ALUMINUM_BRASS;
	public static GolemConfigSet CADMIUM;
	public static GolemConfigSet CHROMIUM;
	public static GolemConfigSet GALVANIZED_STEEL; // new!
	public static GolemConfigSet IRIDIUM;
	public static GolemConfigSet MAGNESIUM;
	public static GolemConfigSet MANGANESE;
	public static GolemConfigSet NICHROME; // new!
	public static GolemConfigSet OSMIUM;
	public static GolemConfigSet PLUTONIUM;
	public static GolemConfigSet RUTILE;
	public static GolemConfigSet STAINLESS_STEEL; // new!
	public static GolemConfigSet TANTALUM;
	public static GolemConfigSet TITANIUM;
	public static GolemConfigSet TUNGSTEN;
	public static GolemConfigSet URANIUM;
	public static GolemConfigSet ZIRCONIUM;
	
	public static void mainRegistry(Configuration config)
	{
		config.load();

		// initialize
		ALUMINUM = new GolemConfigSet(config, "Aluminum Golem", 40.0D, 2.6F);
		ALUMINUM_BRASS = new GolemConfigSet(config, "Aluminum Brass Golem", 49.0D, 3.3F);
		CADMIUM = new GolemConfigSet(config, "Cadmium Golem", 26.0D, 4.5F);
		CHROMIUM = new GolemConfigSet(config, "Chromium Golem", 36.0D, 6.3F);
		GALVANIZED_STEEL = new GolemConfigSet(config, "Galvanized Steel Golem", 116.0D, 10.4F);
		IRIDIUM = new GolemConfigSet(config, "Iridium Golem", 38.0D, 4.6F);
		MAGNESIUM = new GolemConfigSet(config, "Magnesium Golem", 38.0D, 4.6F);
		MANGANESE = new GolemConfigSet(config, "Manganese Golem", 33.0D, 5.3F);
		NICHROME = new GolemConfigSet(config, "Nichrome Golem", 120.0D, 8.5F);
		OSMIUM = new GolemConfigSet(config, "Osmium Golem", 32.0D, 4.8F);
		PLUTONIUM = new GolemConfigSet(config, "Plutonium Golem", 100.0D, 5.0F);
		RUTILE = new GolemConfigSet(config, "Rutile Golem", 16.0D, 14.0F);	
		STAINLESS_STEEL = new GolemConfigSet(config, "Stainless Steel Golem", 165.0D, 12.5F);
		TANTALUM = new GolemConfigSet(config, "Tantalum Golem", 160.0D, 9.6F);
		TITANIUM = new GolemConfigSet(config, "Titanium Golem", 168.0D, 10.6F);
		TUNGSTEN = new GolemConfigSet(config, "Tungsten Golem", 106.0D, 6.9F);
		URANIUM = new GolemConfigSet(config, "Uranium Golem", 110.0D, 5.5F);
		ZIRCONIUM = new GolemConfigSet(config, "Zirconium Golem", 44.0D, 5.3F);
			
		// load specials
		
		MAGNESIUM.addKey(EntityMagnesiumGolem.ALLOW_PLACE_FIRE, true, "Whether this golem can light fires randomly");
		MAGNESIUM.addKey(EntityMagnesiumGolem.ALLOW_BURN_MOBS, true, "Whether this golem can ignite mobs");
		MAGNESIUM.addKey(EntityMagnesiumGolem.FIRE_DELAY, 245, 1, 24000, "Ticks between lighting fires");
		
		PLUTONIUM.addKey(EntityPlutoniumGolem.ALLOW_POISON, true, "Whether this golem can poison nearby creatures");
		PLUTONIUM.addKey(EntityPlutoniumGolem.AOE, 1.5F, 0.1F, 8.0F, "Poison effect radius");
		PLUTONIUM.addKey(EntityPlutoniumGolem.DURATION, 36, 1, 1000, "Poison effect length (in ticks)");
		PLUTONIUM.addKey(EntityPlutoniumGolem.AMPLIFIER, 1, 1, 3, "Poison effect amplifier");
		URANIUM.addKey(EntityPlutoniumGolem.ALLOW_POISON, true, "Whether this golem can poison nearby creatures");
		URANIUM.addKey(EntityPlutoniumGolem.AOE, 2.1F, 0.1F, 8.0F, "Poison effect radius");
		URANIUM.addKey(EntityPlutoniumGolem.DURATION, 18, 1, 1000, "Poison effect length (in ticks)");
		URANIUM.addKey(EntityPlutoniumGolem.AMPLIFIER, 2, 1, 3, "Poison effect amplifier");

		config.save();
	}
}