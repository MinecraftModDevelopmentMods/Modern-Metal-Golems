package com.golems_modern.entity;

import java.util.List;

import com.golems.entity.GolemBase;
import com.golems.util.WeightedItem;

import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class MetalGolemBase2 extends GolemBase
{	
	public MetalGolemBase2(World world, float attack, Block pickBlock) 
	{
		super(world, attack, pickBlock);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getBrightnessForRender(float partialTicks)
	{
		final int LIGHT_ADDED = 8;
		return super.getBrightnessForRender(partialTicks) + LIGHT_ADDED;
	}
	
	@Override
	public void addGolemDrops(List<WeightedItem> list, boolean recentlyHit, int lootingLevel) 
	{
		int size = 6 + rand.nextInt(6) + lootingLevel;
		this.addDrop(list, new ItemStack(this.getIngot(), size > 36 ? 36 : size), 100);
	}
	
	@Override
	public SoundEvent getGolemSound() 
	{
		return SoundEvents.BLOCK_METAL_STEP;
	}
	
	public abstract Item getIngot();
}
