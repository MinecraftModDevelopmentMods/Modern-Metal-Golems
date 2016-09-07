package com.golems_modern.entity.ai;

import com.golems.entity.GolemBase;
import com.golems.entity.ai.EntityAIPlaceRandomBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

public class EntityAIPlaceRandomBlocksWithCheck extends EntityAIPlaceRandomBlocks
{	
	public EntityAIPlaceRandomBlocksWithCheck(GolemBase golemBase, int ticksBetweenPlanting, IBlockState[] plants, Block[] soils, boolean configAllows)
	{
		super(golemBase, ticksBetweenPlanting, plants, soils, configAllows);
	}
	
	public EntityAIPlaceRandomBlocksWithCheck(GolemBase golemBase, int ticksBetweenPlanting, IBlockState[] plants, boolean configAllows)
	{
		this(golemBase, ticksBetweenPlanting, plants, null, configAllows);
	}
	
	@Override
	public boolean shouldExecute() 
	{
		return this.canExecute && golem.worldObj.getGameRules().getBoolean("mobGriefing") && golem.worldObj.rand.nextInt(tickDelay) == 0;
	}
}