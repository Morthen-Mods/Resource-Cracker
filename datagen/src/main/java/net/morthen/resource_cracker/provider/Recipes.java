package net.morthen.resource_cracker.provider;

import net.minecraft.advancements.Advancement;
import net.minecraft.core.registries.MultiRegistryBootstrap;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;
import net.morthen.resource_cracker.helper.BaseRecipes;
import net.morthen.resource_cracker.item.tags.CrackerItemTags;
import net.morthen.resource_cracker.registries.BlockRegistry;
import net.morthen.resource_cracker.registries.ItemRegistry;
import net.neoforged.neoforge.common.Tags;

public class Recipes extends BaseRecipes {

    public static MultiRegistryBootstrap create() {
        return RecipeProvider.asBootstrap(Recipes::new);
    }

    protected Recipes(BootstrapContext<Recipe<?>> recipes, BootstrapContext<Advancement> advancements) {
        super(recipes, advancements);
    }

    @Override
    protected void buildRecipes() {
        /////////////
        //  Tools  //
        /////////////
        /* Crack Hammer */
        crackHammerRecipe(ItemRegistry.CRACK_HAMMER_COPPER.get(), Tags.Items.INGOTS_COPPER);
        crackHammerRecipe(ItemRegistry.CRACK_HAMMER_GOLD.get(), Tags.Items.INGOTS_GOLD);
        crackHammerRecipe(ItemRegistry.CRACK_HAMMER_IRON.get(), Tags.Items.INGOTS_IRON);
        crackHammerRecipe(ItemRegistry.CRACK_HAMMER_DIAMOND.get(), Tags.Items.GEMS_DIAMOND);
        crackHammerRecipe(ItemRegistry.CRACK_HAMMER_STEEL.get(), CrackerItemTags.STEEL_INGOTS);
        smithingUpgrade(ItemRegistry.CRACK_HAMMER_NETHERITE.get(), ItemRegistry.CRACK_HAMMER_DIAMOND.get(), Tags.Items.INGOTS_NETHERITE);

        /*  Chisel  */
        chiselRecipe(ItemRegistry.CHISEL_COPPER.get(), Tags.Items.INGOTS_COPPER);
        chiselRecipe(ItemRegistry.CHISEL_GOLD.get(), Tags.Items.INGOTS_GOLD);
        chiselRecipe(ItemRegistry.CHISEL_IRON.get(), Tags.Items.INGOTS_IRON);
        chiselRecipe(ItemRegistry.CHISEL_DIAMOND.get(), Tags.Items.GEMS_DIAMOND);
        chiselRecipe(ItemRegistry.CHISEL_STEEL.get(), CrackerItemTags.STEEL_INGOTS);
        smithingUpgrade(ItemRegistry.CHISEL_NETHERITE.get(), ItemRegistry.CHISEL_DIAMOND.get(), Tags.Items.INGOTS_NETHERITE);

        /* Scythe */
        scytheRecipe(ItemRegistry.SCYTHE_COPPER.get(), Tags.Items.INGOTS_COPPER);
        scytheRecipe(ItemRegistry.SCYTHE_IRON.get(), Tags.Items.INGOTS_IRON);
        scytheRecipe(ItemRegistry.SCYTHE_GOLD.get(), Tags.Items.INGOTS_GOLD);
        scytheRecipe(ItemRegistry.SCYTHE_STEEL.get(), CrackerItemTags.STEEL_INGOTS);
        scytheRecipe(ItemRegistry.SCYTHE_DIAMOND.get(), Tags.Items.GEMS_DIAMOND);
        smithingUpgrade(ItemRegistry.SCYTHE_NETHERITE.get(), ItemRegistry.SCYTHE_DIAMOND.get(), Tags.Items.INGOTS_NETHERITE);

        ////////////////////////
        //   Material Dusts   //
        ////////////////////////
        materialDustRecipe(ItemRegistry.MATERIAL_DUST_CARBON.get(), Items.CHARCOAL, 2);
        materialDustRecipe(ItemRegistry.MATERIAL_DUST_COPPER.get(), Items.RAW_COPPER, 2);
        materialDustRecipe(ItemRegistry.MATERIAL_DUST_IRON.get(), Items.RAW_IRON, 2);
        materialDustRecipe(ItemRegistry.MATERIAL_DUST_GOLD.get(), Items.RAW_GOLD, 2);

        materialDustRecipe(ItemRegistry.MATERIAL_DUST_COPPER.get(), Tags.Items.INGOTS_COPPER, 1);
        materialDustRecipe(ItemRegistry.MATERIAL_DUST_IRON.get(), Tags.Items.INGOTS_IRON, 1);
        materialDustRecipe(ItemRegistry.MATERIAL_DUST_GOLD.get(), Tags.Items.INGOTS_GOLD, 1);
        materialDustRecipe(ItemRegistry.MATERIAL_DUST_STEEL.get(), CrackerItemTags.STEEL_INGOTS, 1);
        materialDustRecipe(ItemRegistry.MATERIAL_DUST_DIAMOND.get(), Items.DIAMOND, 1);
        materialDustRecipe(ItemRegistry.MATERIAL_DUST_NETHERITE_SCRAP.get(), Items.NETHERITE_SCRAP, 1);
        materialDustRecipe(ItemRegistry.MATERIAL_DUST_NETHERITE.get(), Tags.Items.INGOTS_NETHERITE, 1);
        materialDustRecipe(ItemRegistry.MATERIAL_DUST_EMERALD.get(), Items.EMERALD, 1);

        materialDustRecipe(ItemRegistry.MATERIAL_DUST_DIAMOND.get(), Items.DIAMOND_ORE, 2);
        materialDustRecipe(ItemRegistry.MATERIAL_DUST_DIAMOND.get(), Items.DEEPSLATE_DIAMOND_ORE, 2);
        materialDustRecipe(ItemRegistry.MATERIAL_DUST_EMERALD.get(), Items.EMERALD_ORE, 2);
        materialDustRecipe(ItemRegistry.MATERIAL_DUST_EMERALD.get(), Items.DEEPSLATE_EMERALD_ORE, 2);
        materialDustRecipe(ItemRegistry.MATERIAL_DUST_NETHERITE_SCRAP.get(), Items.ANCIENT_DEBRIS, 2);

        ////////////////
        //   Blocks   //
        ////////////////
        springBlockRecipe(BlockRegistry.WATER_SPRING_BLOCK.get(), Items.WATER_BUCKET);
        springBlockRecipe(BlockRegistry.LAVA_SPRING_BLOCK.get(), Items.LAVA_BUCKET);

        ////////////////
        //  Smelting  //
        ////////////////
        smeltingRecipe(Items.COPPER_INGOT, ItemRegistry.MATERIAL_DUST_COPPER.get());
        smeltingRecipe(Items.IRON_INGOT, ItemRegistry.MATERIAL_DUST_IRON.get());
        smeltingRecipe(Items.GOLD_INGOT, ItemRegistry.MATERIAL_DUST_GOLD.get());
        smeltingRecipe(ItemRegistry.STEEL_INGOT.get(), ItemRegistry.MATERIAL_DUST_STEEL.get());
        smeltingRecipe(ItemRegistry.MATERIAL_DUST_SULFUR.get(), ItemRegistry.GARLIC.get());
        smeltingRecipe(Items.LEATHER, Items.ROTTEN_FLESH);

        ////////////////
        //  Blasting  //
        ////////////////
        blastingRecipe(Items.COPPER_INGOT, ItemRegistry.MATERIAL_DUST_COPPER.get());
        blastingRecipe(Items.IRON_INGOT, ItemRegistry.MATERIAL_DUST_IRON.get());
        blastingRecipe(Items.GOLD_INGOT, ItemRegistry.MATERIAL_DUST_GOLD.get());
        blastingRecipe(Items.DIAMOND, ItemRegistry.MATERIAL_DUST_DIAMOND.get());
        blastingRecipe(Items.EMERALD, ItemRegistry.MATERIAL_DUST_EMERALD.get());
        blastingRecipe(Items.NETHERITE_SCRAP, ItemRegistry.MATERIAL_DUST_NETHERITE_SCRAP.get());
        blastingRecipe(Items.NETHERITE_INGOT, ItemRegistry.MATERIAL_DUST_NETHERITE.get());
        blastingRecipe(ItemRegistry.STEEL_INGOT.get(), ItemRegistry.MATERIAL_DUST_STEEL.get());
        blastingRecipe(ItemRegistry.MATERIAL_DUST_SULFUR.get(), ItemRegistry.GARLIC.get());
        blastingRecipe(Items.LEATHER, Items.ROTTEN_FLESH);

        ////////////////
        //  Campfire  //
        ////////////////
        campfireRecipe(ItemRegistry.MATERIAL_DUST_SULFUR.get(), ItemRegistry.GARLIC.get());
        campfireRecipe(Items.LEATHER, Items.ROTTEN_FLESH);

        ///////////////
        //  Smoking  //
        ///////////////
        smokingRecipe(ItemRegistry.BEEF_JERKY.get(), Items.ROTTEN_FLESH);

        ///////////////////
        //  Compressing  //
        ///////////////////
        compressRecipe(BlockRegistry.STEEL_BLOCK.get(), ItemRegistry.STEEL_INGOT.get());
        compressRecipe(Items.DIAMOND, ItemRegistry.NUGGET_DIAMOND.get());
        compressRecipe(Items.EMERALD, ItemRegistry.NUGGET_EMERALD.get());

        /////////////////////
        //  Decompressing  //
        /////////////////////
        decompressRecipe(ItemRegistry.STEEL_INGOT.get(), BlockRegistry.STEEL_BLOCK.get());

        ////////////
        //  Misc  //
        ////////////
        this.shaped(RecipeCategory.MISC, ItemRegistry.MATERIAL_DUST_STEEL.get(), 4)
                .pattern("CC").pattern("II")
                .define('C', CrackerItemTags.CARBON_DUSTS)
                .define('I', CrackerItemTags.IRON_DUSTS)
                .unlockedBy("has_carbon_dust", has(CrackerItemTags.CARBON_DUSTS))
                .save(this.output, path("crafting/steel_dust"));

        this.shaped(RecipeCategory.MISC, Items.GUNPOWDER, 3)
                .pattern("SPC")
                .define('S', CrackerItemTags.SULFUR_DUSTS)
                .define('P', CrackerItemTags.SALTPETER_DUSTS)
                .define('C', Items.CHARCOAL)
                .unlockedBy(getHasName(Items.CHARCOAL), has(Items.CHARCOAL))
                .save(this.output, path("crafting/gunpowder_from_sulfur_saltpeter_charcoal"));

        this.shaped(RecipeCategory.MISC, Items.SLIME_BALL, 2)
                .pattern("HCS")
                .define('H', Items.HONEYCOMB)
                .define('C', Items.DYE.green())
                .define('S', CrackerItemTags.SALTPETER_DUSTS)
                .unlockedBy("has_saltpeter_dust", has(CrackerItemTags.SALTPETER_DUSTS))
                .save(this.output, path("crafting/slimeball_from_comb_dye_saltpeter"));

        this.shaped(RecipeCategory.MISC, ItemRegistry.MATERIAL_DUST_NETHERITE.get(), 1)
                .pattern("NNN").pattern("NGG").pattern("G  ")
                .define('N', CrackerItemTags.NETHERITE_SCRAP_DUSTS)
                .define('G', CrackerItemTags.GOLD_DUSTS)
                .unlockedBy("has_netherite_scrap_dust", has(CrackerItemTags.NETHERITE_SCRAP_DUSTS))
                .save(this.output, path("crafting/netherite_dust_from_scrap_gold_dust"));
    }
}
