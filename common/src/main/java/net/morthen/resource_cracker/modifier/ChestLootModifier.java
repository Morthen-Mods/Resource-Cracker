package net.morthen.resource_cracker.modifier;

import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.morthen.resource_cracker.config.LootConfig;
import net.morthen.resource_cracker.registries.ItemRegistry;
import net.morthen.resourcelibrary.modifier.LootTableModifier;

import java.util.List;

public class ChestLootModifier {

    public static void init(LootTableModifier modifier) {
        modifier.addItem(ItemRegistry.MATERIAL_DUST_SULFUR, 6, () -> LootConfig.sulfur,
                List.of(BuiltInLootTables.RUINED_PORTAL,
                BuiltInLootTables.BASTION_OTHER,
                BuiltInLootTables.BASTION_BRIDGE,
                BuiltInLootTables.NETHER_BRIDGE,
                BuiltInLootTables.VILLAGE_DESERT_HOUSE));

        modifier.addItem(ItemRegistry.MATERIAL_DUST_SALTPETER, 1, 6, () -> LootConfig.saltpeter,
                List.of(BuiltInLootTables.RUINED_PORTAL,
                BuiltInLootTables.BASTION_OTHER,
                BuiltInLootTables.BASTION_BRIDGE,
                BuiltInLootTables.NETHER_BRIDGE,
                BuiltInLootTables.DESERT_PYRAMID,
                BuiltInLootTables.VILLAGE_DESERT_HOUSE));

        modifier.addItem(ItemRegistry.MATERIAL_DUST_COPPER, 1, 6, () -> LootConfig.copperDust,
                List.of(BuiltInLootTables.VILLAGE_ARMORER,
                BuiltInLootTables.VILLAGE_TOOLSMITH,
                BuiltInLootTables.VILLAGE_WEAPONSMITH,
                BuiltInLootTables.ABANDONED_MINESHAFT));

        modifier.addItem(ItemRegistry.MATERIAL_DUST_GOLD, 1, 6, () -> LootConfig.goldDust,
                List.of(BuiltInLootTables.VILLAGE_ARMORER,
                BuiltInLootTables.VILLAGE_TOOLSMITH,
                BuiltInLootTables.VILLAGE_WEAPONSMITH,
                BuiltInLootTables.ABANDONED_MINESHAFT));

        modifier.addItem(ItemRegistry.MATERIAL_DUST_IRON, 1, 6, () -> LootConfig.ironDust,
                List.of(BuiltInLootTables.VILLAGE_ARMORER,
                BuiltInLootTables.VILLAGE_TOOLSMITH,
                BuiltInLootTables.VILLAGE_WEAPONSMITH,
                BuiltInLootTables.ABANDONED_MINESHAFT));

        modifier.addItem(ItemRegistry.MATERIAL_DUST_EMERALD, 1, 3, () -> LootConfig.emeraldDust,
                List.of(BuiltInLootTables.SHIPWRECK_TREASURE,
                BuiltInLootTables.ABANDONED_MINESHAFT));

        modifier.addItem(ItemRegistry.MATERIAL_DUST_DIAMOND, 1, 3, () -> LootConfig.diamondDust,
                List.of(BuiltInLootTables.SHIPWRECK_TREASURE,
                BuiltInLootTables.ABANDONED_MINESHAFT));

        modifier.addItem(ItemRegistry.MATERIAL_DUST_NETHERITE_SCRAP, 1, 2, () -> LootConfig.netheriteScrapDust,
                List.of(BuiltInLootTables.RUINED_PORTAL,
                BuiltInLootTables.BASTION_OTHER,
                BuiltInLootTables.BASTION_BRIDGE,
                BuiltInLootTables.NETHER_BRIDGE,
                BuiltInLootTables.ANCIENT_CITY,
                BuiltInLootTables.ANCIENT_CITY_ICE_BOX));

        modifier.addItem(ItemRegistry.MATERIAL_DUST_NETHERITE, 1, 2, () -> LootConfig.netheriteDust,
                List.of(BuiltInLootTables.RUINED_PORTAL,
                BuiltInLootTables.BASTION_OTHER,
                BuiltInLootTables.BASTION_BRIDGE,
                BuiltInLootTables.NETHER_BRIDGE,
                BuiltInLootTables.ANCIENT_CITY,
                BuiltInLootTables.ANCIENT_CITY_ICE_BOX));

        modifier.addItem(ItemRegistry.NUGGET_DIAMOND, 1, 4, () -> LootConfig.diamondNugget,
                List.of(BuiltInLootTables.DESERT_PYRAMID,
                BuiltInLootTables.SHIPWRECK_TREASURE,
                BuiltInLootTables.ABANDONED_MINESHAFT,
                BuiltInLootTables.ANCIENT_CITY,
                BuiltInLootTables.ANCIENT_CITY_ICE_BOX));

        modifier.addItem(ItemRegistry.NUGGET_EMERALD, 1, 4, () -> LootConfig.emeraldNugget,
                List.of(BuiltInLootTables.DESERT_PYRAMID,
                BuiltInLootTables.SHIPWRECK_TREASURE,
                BuiltInLootTables.ABANDONED_MINESHAFT,
                BuiltInLootTables.ANCIENT_CITY,
                BuiltInLootTables.ANCIENT_CITY_ICE_BOX));

        modifier.addItem(ItemRegistry.GARLIC, 1, 6, () -> LootConfig.garlic,
                List.of(BuiltInLootTables.SPAWN_BONUS_CHEST,
                BuiltInLootTables.ABANDONED_MINESHAFT));

        modifier.addItem(ItemRegistry.CRACK_HAMMER_COPPER, 1, () -> LootConfig.copperHammer,
                List.of(BuiltInLootTables.SPAWN_BONUS_CHEST));

        modifier.addItem(ItemRegistry.CRACK_HAMMER_IRON, 1, () -> LootConfig.ironHammer,
                List.of(BuiltInLootTables.SPAWN_BONUS_CHEST,
                BuiltInLootTables.VILLAGE_ARMORER,
                BuiltInLootTables.VILLAGE_TOOLSMITH,
                BuiltInLootTables.VILLAGE_WEAPONSMITH));

        modifier.addItem(ItemRegistry.CRACK_HAMMER_STEEL, 1, () -> LootConfig.steelHammer,
                List.of(BuiltInLootTables.VILLAGE_ARMORER,
                BuiltInLootTables.VILLAGE_TOOLSMITH,
                BuiltInLootTables.VILLAGE_WEAPONSMITH));

        modifier.addItem(ItemRegistry.STEEL_INGOT, 1, 2, () -> LootConfig.steelIngot,
                List.of(BuiltInLootTables.ABANDONED_MINESHAFT,
                BuiltInLootTables.VILLAGE_ARMORER,
                BuiltInLootTables.VILLAGE_TOOLSMITH,
                BuiltInLootTables.VILLAGE_WEAPONSMITH));

        modifier.addItem(ItemRegistry.MATERIAL_DUST_STEEL, 1, 2, () -> LootConfig.steelDust,
                List.of(BuiltInLootTables.ABANDONED_MINESHAFT,
                BuiltInLootTables.VILLAGE_ARMORER,
                BuiltInLootTables.VILLAGE_TOOLSMITH,
                BuiltInLootTables.VILLAGE_WEAPONSMITH));

        modifier.addItem(ItemRegistry.MATERIAL_DUST_CARBON, 1, 4, () -> LootConfig.carbonDust,
                List.of(BuiltInLootTables.ABANDONED_MINESHAFT,
                BuiltInLootTables.VILLAGE_WEAPONSMITH,
                BuiltInLootTables.NETHER_BRIDGE,
                BuiltInLootTables.BASTION_BRIDGE,
                BuiltInLootTables.NETHER_BRIDGE,
                BuiltInLootTables.RUINED_PORTAL));
    }
}