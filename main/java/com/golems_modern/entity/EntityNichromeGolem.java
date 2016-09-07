package com.golems_modern.entity;

import com.golems_modern.init.ModernConfig;
import com.golems_modern.init.ModernGolems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityNichromeGolem extends MetalGolemBase2
{
	public EntityNichromeGolem(World world) 
	{
		super(world, ModernConfig.NICHROME.getBaseAttack(), modernmetals.init.Blocks.nichrome_block);
	}

	@Override
	public Item getIngot() 
	{
		return modernmetals.init.Items.nichrome_ingot;
	}

	@Override
	protected void applyAttributes() 
	{
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(ModernConfig.NICHROME.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(MetalGolemBase.METAL_GOLEM_SPEED);
	}

	@Override
	protected ResourceLocation applyTexture() 
	{
		return this.makeGolemTexture(ModernGolems.MODID, "nichrome");
	}
	
}
