package com.golems_modern.events;

import java.util.List;

import com.golems.events.GolemBuildEvent;
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
import com.golems_modern.init.ModernConfig;

import modernmetals.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

public class BuildEventHandler 
{
	@SubscribeEvent
	public void onBuildGolem(GolemBuildEvent event)
	{
		if(event.isGolemNull())
		{
			if(event.blockBelow == Blocks.aluminum_block || matchesOreDict(event.blockBelow, "blockAluminum"))
			{
				event.setGolem(new EntityAluminumGolem(event.worldObj), ModernConfig.ALUMINUM.canSpawn());
			}
			else if(event.blockBelow == Blocks.aluminumbrass_block || matchesOreDict(event.blockBelow, "blockAluminumbrass"))
			{
				event.setGolem(new EntityAluminumBrassGolem(event.worldObj), ModernConfig.ALUMINUM_BRASS.canSpawn());
			}
			else if(event.blockBelow == Blocks.cadmium_block || matchesOreDict(event.blockBelow, "blockCadmium"))
			{
				event.setGolem(new EntityCadmiumGolem(event.worldObj), ModernConfig.CADMIUM.canSpawn());
			}
			else if(event.blockBelow == Blocks.chromium_block || matchesOreDict(event.blockBelow, "blockChromium"))
			{
				event.setGolem(new EntityChromiumGolem(event.worldObj), ModernConfig.CHROMIUM.canSpawn());
			}
			else if(event.blockBelow == Blocks.galvanizedsteel_block || matchesOreDict(event.blockBelow, "blockGalvanizedsteel"))
			{
				event.setGolem(new EntityGalvSteelGolem(event.worldObj), ModernConfig.GALVANIZED_STEEL.canSpawn());
			}
			else if(event.blockBelow == Blocks.iridium_block || matchesOreDict(event.blockBelow, "blockIridium"))
			{
				event.setGolem(new EntityIridiumGolem(event.worldObj), ModernConfig.IRIDIUM.canSpawn());
			}
			else if(event.blockBelow == Blocks.magnesium_block || matchesOreDict(event.blockBelow, "blockMagnesium"))
			{
				event.setGolem(new EntityMagnesiumGolem(event.worldObj), ModernConfig.MAGNESIUM.canSpawn());
			}
			else if(event.blockBelow == Blocks.manganese_block || matchesOreDict(event.blockBelow, "blockManganese"))
			{
				event.setGolem(new EntityManganeseGolem(event.worldObj), ModernConfig.MANGANESE.canSpawn());
			}
			else if(event.blockBelow == Blocks.nichrome_block || matchesOreDict(event.blockBelow, "blockNichrome"))
			{
				event.setGolem(new EntityNichromeGolem(event.worldObj), ModernConfig.NICHROME.canSpawn());
			}
			else if(event.blockBelow == Blocks.osmium_block || matchesOreDict(event.blockBelow, "blockOsmium"))
			{
				event.setGolem(new EntityOsmiumGolem(event.worldObj), ModernConfig.OSMIUM.canSpawn());
			}
			else if(event.blockBelow == Blocks.plutonium_block || matchesOreDict(event.blockBelow, "blockPlutonium"))
			{
				event.setGolem(new EntityPlutoniumGolem(event.worldObj), ModernConfig.PLUTONIUM.canSpawn());
			}
			else if(event.blockBelow == Blocks.rutile_block || matchesOreDict(event.blockBelow, "blockRutile"))
			{
				event.setGolem(new EntityRutileGolem(event.worldObj), ModernConfig.RUTILE.canSpawn());
			}
			else if(event.blockBelow == Blocks.stainlesssteel_block || matchesOreDict(event.blockBelow, "blockStainlesssteel"))
			{
				event.setGolem(new EntityStainSteelGolem(event.worldObj), ModernConfig.STAINLESS_STEEL.canSpawn());
			}
			else if(event.blockBelow == Blocks.tantalum_block || matchesOreDict(event.blockBelow, "blockTantalum"))
			{
				event.setGolem(new EntityTantalumGolem(event.worldObj), ModernConfig.TANTALUM.canSpawn());
			}
			else if(event.blockBelow == Blocks.titanium_block || matchesOreDict(event.blockBelow, "blockTitanium"))
			{
				event.setGolem(new EntityTitaniumGolem(event.worldObj), ModernConfig.TITANIUM.canSpawn());
			}
			else if(event.blockBelow == Blocks.tungsten_block || matchesOreDict(event.blockBelow, "blockTungsten"))
			{
				event.setGolem(new EntityTungstenGolem(event.worldObj), ModernConfig.TUNGSTEN.canSpawn());
			}
			else if(event.blockBelow == Blocks.uranium_block || matchesOreDict(event.blockBelow, "blockUranium"))
			{
				event.setGolem(new EntityUraniumGolem(event.worldObj), ModernConfig.URANIUM.canSpawn());
			}
			else if(event.blockBelow == Blocks.zirconium_block || matchesOreDict(event.blockBelow, "blockZirconium"))
			{
				event.setGolem(new EntityZirconiumGolem(event.worldObj), ModernConfig.ZIRCONIUM.canSpawn());
			}
		}
	}
	
	public static boolean matchesOreDict(Block b, String name)
	{
		if(OreDictionary.doesOreNameExist(name))
		{
			List<ItemStack> ores = OreDictionary.getOres(name);
			ItemStack blockStack = new ItemStack(b);
			for(ItemStack stack : ores)
			{
				if(OreDictionary.itemMatches(blockStack, stack, false))
				{
					//System.out.println("found ore dict match");
					return true;
				}
			}
		}
		return false;
	}
}
