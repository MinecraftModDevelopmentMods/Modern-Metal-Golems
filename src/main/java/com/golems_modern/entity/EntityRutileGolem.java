package com.golems_modern.entity;

import com.golems_modern.init.ModernConfig;
import com.golems_modern.init.ModernGolems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityRutileGolem extends MetalGolemBase2
{
	public EntityRutileGolem(World world) 
	{
		super(world, ModernConfig.RUTILE.getBaseAttack(), modernmetals.init.Blocks.rutile_block);
	}

	@Override
	public Item getIngot() 
	{
		return modernmetals.init.Items.rutile_ingot;
	}

	@Override
	protected void applyAttributes() 
	{
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(ModernConfig.RUTILE.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(MetalGolemBase.METAL_GOLEM_SPEED);
	}

	@Override
	protected ResourceLocation applyTexture() 
	{
		return this.makeGolemTexture(ModernGolems.MODID, "rutile");
	}
}