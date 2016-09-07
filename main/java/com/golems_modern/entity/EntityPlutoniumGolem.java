package com.golems_modern.entity;

import java.util.List;

import com.golems_modern.init.ModernConfig;
import com.golems_modern.init.ModernGolems;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityPlutoniumGolem extends MetalGolemBase2
{
	public static final String ALLOW_POISON = "Allow Special: Poison Creatures";
	public static final String AOE = "Poison Area of Effect";
	public static final String DURATION = "Poison Duration";
	public static final String AMPLIFIER = "Poison Amplifier";
	
	protected double poisonAOEFactor;
	protected int poisonLen;
	protected int poisonAmp;
	protected boolean allowPoison;

	public EntityPlutoniumGolem(World world, float attack, Block pickBlock) 
	{
		super(world, attack, pickBlock);
		this.poisonAOEFactor = ModernConfig.PLUTONIUM.getFloat(AOE);
		this.poisonLen = ModernConfig.PLUTONIUM.getInt(DURATION);
		this.poisonAmp = ModernConfig.PLUTONIUM.getInt(AMPLIFIER);
		this.allowPoison = ModernConfig.PLUTONIUM.getBoolean(ALLOW_POISON);
	}

	public EntityPlutoniumGolem(World world) 
	{
		this(world, ModernConfig.PLUTONIUM.getBaseAttack(), modernmetals.init.Blocks.plutonium_block);
	}

	@Override
	public void onLivingUpdate()
	{
		super.onLivingUpdate();
		if(allowPoison)
		{
			PotionEffect POISON_EFFECT = new PotionEffect(MobEffects.POISON, poisonLen, poisonAmp);
			List<Entity> entityList = worldObj.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox().expand(poisonAOEFactor, poisonAOEFactor * 0.75D, poisonAOEFactor));
			for(Entity entity : entityList)
			{
				if(entity instanceof EntityLivingBase)
				{
					EntityLivingBase entityLiving = (EntityLivingBase)entity;
					if(null == entityLiving.getActivePotionEffect(MobEffects.POISON))
					{
						entityLiving.addPotionEffect(POISON_EFFECT);
					}
				}
			}
		}
		
		if(this.getActivePotionEffect(MobEffects.POISON) != null)
		{
			this.removeActivePotionEffect(MobEffects.POISON);
		}
	}

	@Override
	public Item getIngot() 
	{
		return modernmetals.init.Items.plutonium_ingot;
	}

	@Override
	protected void applyAttributes() 
	{
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(ModernConfig.PLUTONIUM.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(MetalGolemBase.METAL_GOLEM_SPEED);
	}

	@Override
	protected ResourceLocation applyTexture() 
	{
		return this.makeGolemTexture(ModernGolems.MODID, "plutonium");
	}
}