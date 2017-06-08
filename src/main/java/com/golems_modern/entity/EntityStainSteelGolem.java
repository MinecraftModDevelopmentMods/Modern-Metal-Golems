package com.golems_modern.entity;

import com.golems_modern.init.ModernConfig;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityStainSteelGolem extends MetalGolemBase
{
	public EntityStainSteelGolem(World world) 
	{
		super(world, ModernConfig.STAINLESS_STEEL.getBaseAttack(), modernmetals.init.Blocks.stainlesssteel_block, 0xD8D6D7, false);
	}

	@Override
	public Item getIngot() 
	{
		return modernmetals.init.Items.stainlesssteel_ingot;
	}

	@Override
	protected void applyAttributes() 
	{
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(ModernConfig.STAINLESS_STEEL.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(METAL_GOLEM_SPEED);
	}
}