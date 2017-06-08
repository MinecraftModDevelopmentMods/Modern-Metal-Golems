package com.golems_modern.entity;

import com.golems_modern.init.ModernConfig;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityTitaniumGolem extends MetalGolemBase
{
	public EntityTitaniumGolem(World world) 
	{
		super(world, ModernConfig.TITANIUM.getBaseAttack(), modernmetals.init.Blocks.titanium_block, 0xB9BABC, false);
	}

	@Override
	public Item getIngot() 
	{
		return modernmetals.init.Items.titanium_ingot;
	}

	@Override
	protected void applyAttributes() 
	{
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(ModernConfig.TITANIUM.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(METAL_GOLEM_SPEED);
	}
}