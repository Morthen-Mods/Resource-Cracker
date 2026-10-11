package net.morthen.resource_cracker.modifier;

import net.minecraft.world.level.block.Blocks;
import net.morthen.resource_cracker.config.LootConfig;
import net.morthen.resource_cracker.registries.ItemRegistry;
import net.morthen.resourcelibrary.modifier.LootTableModifier;

import java.util.List;

public class BlockLootModifier {

    public static void init(LootTableModifier modifier) {
        modifier.addItem(ItemRegistry.NUGGET_DIAMOND.get(), 1, 3, () -> LootConfig.diamondNuggetFromDiamondOre,
                List.of(Blocks.DIAMOND_ORE.getLootTable().get(),
                        Blocks.DEEPSLATE_DIAMOND_ORE.getLootTable().get()));

        modifier.addItem(ItemRegistry.NUGGET_DIAMOND.get(), 1, () -> LootConfig.diamondNuggetFromCoalOre,
                List.of(Blocks.COAL_ORE.getLootTable().get(),
                        Blocks.DEEPSLATE_COAL_ORE.getLootTable().get()));

        modifier.addItem(ItemRegistry.NUGGET_EMERALD.get(), 1, 4, () -> LootConfig.emeraldNuggetFromOre,
                List.of(Blocks.EMERALD_ORE.getLootTable().get(),
                        Blocks.DEEPSLATE_EMERALD_ORE.getLootTable().get()));
    }
}