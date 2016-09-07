package com.golems_modern.entity;

import com.golems_modern.init.ModernConfig;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityAluminumGolem extends MetalGolemBase
{
	public EntityAluminumGolem(World world) 
	{
		super(world, ModernConfig.ALUMINUM.getBaseAttack(), modernmetals.init.Blocks.aluminum_block, 0xD8D9D6, false);
	}

	@Override
	public Item getIngot() 
	{
		return modernmetals.init.Items.aluminum_ingot;
	}

	@Override
	protected void applyAttributes() 
	{
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(ModernConfig.ALUMINUM.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(METAL_GOLEM_SPEED);
	}
	
}
