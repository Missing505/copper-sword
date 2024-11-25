package net.missing.copper.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.missing.copper.sword.CopperSword;

public class ModEntities {

    public static final EntityType<CopperPebbleEntity> COPPER_PEBBLE = register(
            "copper_pebble",
            EntityType.Builder.<CopperPebbleEntity>create(CopperPebbleEntity::new, SpawnGroup.MISC).setDimensions(0.25F, 0.25F).maxTrackingRange(4).trackingTickInterval(10)
    );


    private static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> type) {
        return Registry.register(Registries.ENTITY_TYPE, new Identifier(CopperSword.MOD_ID, id), type.build(id));
    }

    public static void init() {}

}
