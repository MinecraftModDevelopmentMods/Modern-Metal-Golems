package com.golems_modern.entity;

import com.golems.entity.ai.EntityAIPlaceRandomBlocksStrictly;
import com.golems_modern.init.ModernConfig;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityMagnesiumGolem extends MetalGolemBase
{
	public static final String ALLOW_PLACE_FIRE = "Allow Special: Place Fires";
	public static final String ALLOW_BURN_MOBS = "Allow Special: Ignite Creatures";
	public static final String FIRE_DELAY = "Fire Placement Delay";
	
	public EntityMagnesiumGolem(World world) 
	{
		super(world, ModernConfig.MAGNESIUM.getBaseAttack(), MetalGolemBase.getBlockForMat("MAGNESIUM"), 0xBEBEBB, false);
		int ticks = ModernConfig.MAGNESIUM.getInt(FIRE_DELAY);
		boolean allow = ModernConfig.MAGNESIUM.getBoolean(ALLOW_PLACE_FIRE);
		IBlockState[] fire = new IBlockState[] { Blocks.FIRE.getDefaultState() };
		EntityAIBase aiPlaceFire = new com.golems.entity.ai.EntityAIPlaceRandomBlocks(this, ticks, fire, 
				EntityAIPlaceRandomBlocksStrictly.getGriefingPredicate().and(EntityAIPlaceRandomBlocksStrictly.getPredicate(allow)));
		this.tasks.addTask(2, aiPlaceFire);
		if(allow) this.isImmuneToFire = true;
	}
	
	/** Attack by lighting on fire as well */
	@Override
	public boolean attackEntityAsMob(Entity entity)
	{
		final int BURN_CHANCE = 20;
		if(super.attackEntityAsMob(entity))
		{
			if(ModernConfig.MAGNESIUM.getBoolean(ALLOW_BURN_MOBS) && this.rand.nextInt(100) < BURN_CHANCE)
			{
				entity.setFire(2 + rand.nextInt(5));
			}
			return true;
		}
		return false;
	}

	@Override
	public Item getIngot() 
	{
		return MetalGolemBase.getIngotForMat("MAGNESIUM");
	}

	@Override
	protected void applyAttributes() 
	{
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(ModernConfig.MAGNESIUM.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(METAL_GOLEM_SPEED);
	}
}