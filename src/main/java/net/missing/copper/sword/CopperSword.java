package net.missing.copper.sword;

import net.fabricmc.api.ModInitializer;

import net.missing.copper.block.ModBlocks;
import net.missing.copper.item.ModItemGroups;
import net.missing.copper.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CopperSword implements ModInitializer {
	public static final String MOD_ID = "coppersword";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}