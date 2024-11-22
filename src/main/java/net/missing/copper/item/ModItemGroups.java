package net.missing.copper.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.missing.copper.block.ModBlocks;
import net.missing.copper.sword.CopperSword;

public class ModItemGroups {
    public static final ItemGroup COPPERINFUSEDSTICK_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CopperSword.MOD_ID, "copperinfusedstick"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.copperinfusedstick"))
                    .icon(() -> new ItemStack(ModItems.COPPER_INFUSED_STICK)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COPPER_INFUSED_STICK);
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.LONGSWORD);

                        entries.add(ModBlocks.TEST_BLOCK);


                    }).build());


    public static void registerItemGroups() {
        CopperSword.LOGGER.info("Registering Item Groups for " + CopperSword.MOD_ID);
    }
}
