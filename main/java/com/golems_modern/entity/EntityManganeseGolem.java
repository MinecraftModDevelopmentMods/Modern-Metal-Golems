package com.golems_modern.entity;

import com.golems_modern.init.ModernConfig;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityManganeseGolem extends MetalGolemBase
{
	public EntityManganeseGolem(World world) 
	{
		super(world, ModernConfig.MANGANESE.getBaseAttack(), modernmetals.init.Blocks.manganese_block, 0xEBDDE0, false);
	}

	@Override
	public Item getIngot() 
	{
		return modernmetals.init.Items.manganese_ingot;
	}

	@Override
	protected void applyAttributes() 
	{
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(ModernConfig.MANGANESE.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(METAL_GOLEM_SPEED);
	}
	
}
