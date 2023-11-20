package net.tarykota.avataradventures.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.tarykota.avataradventures.AvatarAdventuresMod;
import net.tarykota.avataradventures.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AvatarAdventuresMod.MOD_ID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.UNOBTAINIUM_ORE);

        simpleBlockWithItem(ModBlocks.CHEADLE.get(), models().cross(blockTexture(ModBlocks.CHEADLE.get()).getPath(),
                blockTexture(ModBlocks.CHEADLE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_CHEADLE.get(), models().singleTexture("potted_cheadle", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CHEADLE.get())).renderType("cutout"));
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
