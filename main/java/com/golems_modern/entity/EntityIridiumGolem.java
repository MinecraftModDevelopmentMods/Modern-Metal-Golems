package com.golems_modern.entity;

import com.golems_modern.init.ModernConfig;
import com.golems_modern.init.ModernGolems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityIridiumGolem extends MetalGolemBase2
{
	public EntityIridiumGolem(World world) 
	{
		super(world, ModernConfig.IRIDIUM.getBaseAttack(), modernmetals.init.Blocks.iridium_block);
	}

	@Override
	public Item getIngot() 
	{
		return modernmetals.init.Items.iridium_ingot;
	}

	@Override
	protected void applyAttributes() 
	{
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(ModernConfig.IRIDIUM.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(MetalGolemBase.METAL_GOLEM_SPEED);
	}

	@Override
	protected ResourceLocation applyTexture() 
	{
		return this.makeGolemTexture(ModernGolems.MODID, "iridium");
	}
	
}
