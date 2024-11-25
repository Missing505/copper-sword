package net.missing.copper.item;

import com.sun.jna.WString;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.missing.copper.sword.CopperSword;
import org.agmas.infernum_effugium.item.PebbleItem;

public class ModItems {
    public static final Item COPPER_INFUSED_STICK = registerItem("copper_infused_stick", new Item(new FabricItemSettings()));

    public static final Item BEAN_ITEM = registerItem("bean_item", new Item(new FabricItemSettings()));

    public static final Item COPPER_INFUSED_PEBBLE = registerItem("copper_infused_pebble", new CopperPebbleItem(new FabricItemSettings()));

    public static final Item BEANCORE = registerItem("bean_core", new Item(new FabricItemSettings()));

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterial.COPPER, 1, -2.4f, new FabricItemSettings()));

    public static final Item LONGSWORD = registerItem("longsword",
            new CopperLongSwordItem(ModToolMaterial.COPPER, 3, -2.7f, new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(COPPER_INFUSED_STICK);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CopperSword.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CopperSword.LOGGER.info("Registering Mod Items for " + CopperSword.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
