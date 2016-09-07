package com.golems_modern.entity;

import com.golems_modern.init.ModernConfig;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityTantalumGolem extends MetalGolemBase
{
	public EntityTantalumGolem(World world) 
	{
		super(world, ModernConfig.TANTALUM.getBaseAttack(), modernmetals.init.Blocks.tantalum_block, 0xD8D6D7, false);
	}

	@Override
	public Item getIngot() 
	{
		return modernmetals.init.Items.tantalum_ingot;
	}

	@Override
	protected void applyAttributes() 
	{
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(ModernConfig.TANTALUM.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(METAL_GOLEM_SPEED);
	}
}