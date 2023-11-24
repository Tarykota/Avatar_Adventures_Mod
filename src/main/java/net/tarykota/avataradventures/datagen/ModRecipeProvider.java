package net.tarykota.avataradventures.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.tarykota.avataradventures.AvatarAdventuresMod;
import net.tarykota.avataradventures.block.ModBlocks;
import net.tarykota.avataradventures.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> UNOBTAINIUM_SMELTABLES = List.of(ModItems.UNOBTAINIUM.get(),
            ModBlocks.UNOBTAINIUM_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, UNOBTAINIUM_SMELTABLES, RecipeCategory.MISC, ModItems.UNOBTAINIUM_INGOT.get(), 0.7f, 200, "unobtainium");
        oreBlasting(pWriter, UNOBTAINIUM_SMELTABLES, RecipeCategory.MISC, ModItems.UNOBTAINIUM_INGOT.get(), 0.7f, 100, "unobtainium");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BANSHEE_SADDLE.get())
                .pattern("VLV")
                .pattern("LBL")
                .pattern("# #")
                .define('V', Items.VINE)
                .define('L', Items.LEATHER)
                .define('B', Items.BONE)
                .define('#', ModItems.UNOBTAINIUM.get())
                .unlockedBy(getHasName(ModItems.UNOBTAINIUM.get()), has(ModItems.UNOBTAINIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.UNOBTAINIUM_SHEET.get(), 4 )
                .pattern("II")
                .define('I', ModItems.UNOBTAINIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.UNOBTAINIUM_INGOT.get()), has(ModItems.UNOBTAINIUM_INGOT.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AIR_CANISTER.get())
                .pattern(" SN")
                .pattern("SPS")
                .pattern("NS ")
                .define('S', ModItems.UNOBTAINIUM_SHEET.get())
                .define('N', Items.IRON_NUGGET)
                .define('P', Items.GLASS_PANE)
                .unlockedBy(getHasName(ModItems.UNOBTAINIUM_SHEET.get()), has(ModItems.UNOBTAINIUM_SHEET.get()))
                .save(pWriter);

    }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  AvatarAdventuresMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }

}
