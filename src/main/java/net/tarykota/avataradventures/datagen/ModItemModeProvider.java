package net.tarykota.avataradventures.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.tarykota.avataradventures.AvatarAdventuresMod;
import net.tarykota.avataradventures.item.ModItems;

public class ModItemModeProvider extends ItemModelProvider {
    public ModItemModeProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AvatarAdventuresMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.UNOBTAINIUM);
        simpleItem(ModItems.UNOBTAINIUM_SHEET);
        simpleItem(ModItems.BANSHEE_SADDLE);

        simpleItem(ModItems.TEYLU);
        simpleItem(ModItems.COOKED_TEYLU);
        simpleItem(ModItems.RAW_BANSHEE);
        simpleItem(ModItems.COOKED_BANSHEE);
        simpleItem(ModItems.GLOW_WORM);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(AvatarAdventuresMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
