package com.golems_modern.entity;

import com.golems_modern.init.ModernConfig;
import com.golems_modern.init.ModernGolems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityUraniumGolem extends EntityPlutoniumGolem
{
	public EntityUraniumGolem(World world) 
	{
		super(world, ModernConfig.URANIUM.getBaseAttack(), modernmetals.init.Blocks.uranium_block);
		this.poisonAOEFactor = ModernConfig.URANIUM.getFloat(AOE);
		this.poisonLen = ModernConfig.URANIUM.getInt(DURATION);
		this.poisonAmp = ModernConfig.URANIUM.getInt(AMPLIFIER);
		this.allowPoison = ModernConfig.URANIUM.getBoolean(ALLOW_POISON);
	}

	@Override
	public Item getIngot() 
	{
		return modernmetals.init.Items.uranium_ingot;
	}

	@Override
	protected void applyAttributes() 
	{
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(ModernConfig.URANIUM.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(MetalGolemBase.METAL_GOLEM_SPEED);
	}
	
	@Override
	protected ResourceLocation applyTexture() 
	{
		return this.makeGolemTexture(ModernGolems.MODID, "uranium");
	}
}