package com.golems_modern.entity;

import com.golems_modern.init.ModernConfig;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityGalvSteelGolem extends MetalGolemBase
{
	public EntityGalvSteelGolem(World world) 
	{
		super(world, ModernConfig.GALVANIZED_STEEL.getBaseAttack(), MetalGolemBase.getBlockForMat("GALVANIZED_STEEL"), 0xC8CDCB, false);
	}

	@Override
	public Item getIngot() 
	{
		return MetalGolemBase.getIngotForMat("GALVANIZED_STEEL");
	}

	@Override
	protected void applyAttributes() 
	{
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(ModernConfig.GALVANIZED_STEEL.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(METAL_GOLEM_SPEED);
	}
}