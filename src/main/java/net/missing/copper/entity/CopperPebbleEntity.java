package net.missing.copper.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import org.agmas.infernum_effugium.entity.PebbleEntity;

public class CopperPebbleEntity extends PebbleEntity {
    public CopperPebbleEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        DamageSource damageSource = new DamageSource(entityHitResult.getEntity().getEntityWorld().getRegistryManager().get(RegistryKeys.DAMAGE_TYPE).entryOf(PEBBLE_DAMAGE));
        entityHitResult.getEntity().damage(damageSource, 2.0F);
        entityHitResult.getEntity().setVelocity((double)0.0F, (double)0.0F, (double)0.0F);
        entityHitResult.getEntity().velocityDirty = true;
        entityHitResult.getEntity().velocityModified = true;
    }

    public CopperPebbleEntity(World world, LivingEntity owner) {
        super(world, owner);
    }
}
