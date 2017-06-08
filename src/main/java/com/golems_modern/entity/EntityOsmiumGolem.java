package com.golems_modern.entity;

import com.golems_modern.init.ModernConfig;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityOsmiumGolem extends MetalGolemBase
{
	public EntityOsmiumGolem(World world) 
	{
		super(world, ModernConfig.OSMIUM.getBaseAttack(), modernmetals.init.Blocks.osmium_block, 0xBDC3C8, false);
	}

	@Override
	public Item getIngot() 
	{
		return modernmetals.init.Items.osmium_ingot;
	}

	@Override
	protected void applyAttributes() 
	{
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(ModernConfig.OSMIUM.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(METAL_GOLEM_SPEED);
	}
}