package net.tarykota.avataradventures.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.tarykota.avataradventures.AvatarAdventuresMod;
import net.tarykota.avataradventures.block.ModBlocks;
import net.tarykota.avataradventures.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AvatarAdventuresMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.UNOBTAINIUM);
        simpleItem(ModItems.UNOBTAINIUM_INGOT);
        simpleItem(ModItems.UNOBTAINIUM_SHEET);
        simpleItem(ModItems.BANSHEE_SADDLE);

        simpleItem(ModItems.TEYLU);
        simpleItem(ModItems.COOKED_TEYLU);
        simpleItem(ModItems.RAW_BANSHEE);
        simpleItem(ModItems.COOKED_BANSHEE);
        simpleItem(ModItems.GLOW_WORM);
        simpleItem(ModItems.BANANA_FRUIT);

        simpleBlockItemBlockTexture(ModBlocks.CHEADLE);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(AvatarAdventuresMod.MOD_ID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(AvatarAdventuresMod.MOD_ID,"block/" + item.getId().getPath()));
    }
}
