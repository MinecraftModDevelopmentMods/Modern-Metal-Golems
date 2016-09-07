package com.golems_modern.entity;

import com.golems_modern.init.ModernConfig;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityCadmiumGolem extends MetalGolemBase
{
	public EntityCadmiumGolem(World world) 
	{
		super(world, ModernConfig.CADMIUM.getBaseAttack(), modernmetals.init.Blocks.cadmium_block, 0xDADEE0, false);
	}

	@Override
	public Item getIngot() 
	{
		return modernmetals.init.Items.cadmium_ingot;
	}

	@Override
	protected void applyAttributes() 
	{
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(ModernConfig.CADMIUM.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(METAL_GOLEM_SPEED);
	}
	
}
