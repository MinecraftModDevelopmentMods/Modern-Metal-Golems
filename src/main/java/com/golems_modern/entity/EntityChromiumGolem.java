package com.golems_modern.entity;

import com.golems_modern.init.ModernConfig;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityChromiumGolem extends MetalGolemBase
{
	public EntityChromiumGolem(World world) 
	{
		super(world, ModernConfig.CHROMIUM.getBaseAttack(), MetalGolemBase.getBlockForMat("CHROMIUM"), 0xDCDCDD, false);
	}

	@Override
	public Item getIngot() 
	{
		return MetalGolemBase.getIngotForMat("CHROMIUM");
	}

	@Override
	protected void applyAttributes() 
	{
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(ModernConfig.CHROMIUM.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(METAL_GOLEM_SPEED);
	}
}