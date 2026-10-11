package net.morthen.resource_cracker.provider;

import net.minecraft.advancements.predicates.StatePropertiesPredicate;
import net.minecraft.core.registries.SingleRegistryBootstrap;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.predicates.MatchBlock;
import net.morthen.resource_cracker.block.GarlicCropBlock;
import net.morthen.resource_cracker.registries.BlockRegistry;
import net.morthen.resource_cracker.registries.ItemRegistry;
import net.morthen.resourcelibrary.registration.RegistryObject;

import java.util.List;
import java.util.Set;

public class Loot extends BlockLootSubProvider {

    public static SingleRegistryBootstrap<LootTable> create() {
        return new LootTableProvider(Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(Loot::new, LootContextParamSets.BLOCK)));
    }

    public Loot(LootTableSubProvider.Context output) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), output);
    }

    @Override
    public void generate() {
        this.add(BlockRegistry.GARLIC_CROP.get(), createCropDrops(BlockRegistry.GARLIC_CROP.get(), ItemRegistry.GARLIC.get(),
                ItemRegistry.GARLIC.get(), MatchBlock.blockMatches(this.blocks, BlockRegistry.GARLIC_CROP.get(),
                        StatePropertiesPredicate.Builder.properties().hasProperty(GarlicCropBlock.AGE, 5))));

        this.dropSelf(BlockRegistry.STEEL_BLOCK.get());
        this.dropSelf(BlockRegistry.WATER_SPRING_BLOCK.get());
        this.dropSelf(BlockRegistry.LAVA_SPRING_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}