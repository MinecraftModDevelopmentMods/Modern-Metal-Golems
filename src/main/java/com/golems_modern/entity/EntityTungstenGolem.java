package com.golems_modern.entity;

import com.golems_modern.init.ModernConfig;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityTungstenGolem extends MetalGolemBase
{
	public EntityTungstenGolem(World world) 
	{
		super(world, ModernConfig.TUNGSTEN.getBaseAttack(), modernmetals.init.Blocks.tungsten_block, 0xBABBBD, false);
	}

	@Override
	public Item getIngot() 
	{
		return modernmetals.init.Items.tungsten_ingot;
	}

	@Override
	protected void applyAttributes() 
	{
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(ModernConfig.TUNGSTEN.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(METAL_GOLEM_SPEED);
	}
}