package net.morthen.resource_cracker.modifier;


import net.morthen.resourcelibrary.modifier.LootTableModifier;

public class LootModifier {

    public static void init() {
        LootTableModifier.register(modifier -> {
            BlockLootModifier.init(modifier);
            ChestLootModifier.init(modifier);
            EntityLootModifier.init(modifier);
        });
    }
}
