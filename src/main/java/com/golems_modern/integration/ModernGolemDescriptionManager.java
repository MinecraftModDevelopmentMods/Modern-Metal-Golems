package com.golems_modern.integration;

import java.util.LinkedList;
import java.util.List;

import com.golems.entity.GolemBase;
import com.golems.integration.GolemDescriptionManager;
import com.golems_modern.entity.EntityMagnesiumGolem;
import com.golems_modern.entity.EntityPlutoniumGolem;
import com.golems_modern.entity.EntityUraniumGolem;
import com.golems_modern.init.ModernConfig;

import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.TextFormatting;

public class ModernGolemDescriptionManager extends GolemDescriptionManager
{
	@Override
	public List<String> getEntityDescription(GolemBase golem)
	{
		List<String> list = new LinkedList<String>();

		if(this.showSpecial)
		{
			if(golem.getClass() == EntityMagnesiumGolem.class)
			{
				if(ModernConfig.MAGNESIUM.getBoolean(EntityMagnesiumGolem.ALLOW_PLACE_FIRE))
				{
					String sFire = TextFormatting.GOLD + trans("entitytip.light_fires");
					list.add(sFire);
				}
				if(ModernConfig.MAGNESIUM.getBoolean(EntityMagnesiumGolem.ALLOW_BURN_MOBS))
				{
					String sBurn = TextFormatting.RED + trans("entitytip.lights_mobs_on_fire");
					list.add(sBurn);
				}
			}
						
			if(golem.getClass() == EntityPlutoniumGolem.class && ModernConfig.PLUTONIUM.getBoolean(EntityPlutoniumGolem.ALLOW_POISON))
			{
				String sPoison = TextFormatting.GREEN + trans("entitytip.poisons_mobs");
				list.add(sPoison);
			}
			
			if(golem.getClass() == EntityUraniumGolem.class && ModernConfig.URANIUM.getBoolean(EntityUraniumGolem.ALLOW_POISON))
			{
				String sPoison = TextFormatting.GREEN + trans("entitytip.poisons_mobs");
				list.add(sPoison);
			}
		}

		return list;
	}
	
	@Override
	protected String trans(String s, Object... strings)
	{
		// the old one still uses "entitytip".concat(s)
		return I18n.format(s, strings);
	}
}
