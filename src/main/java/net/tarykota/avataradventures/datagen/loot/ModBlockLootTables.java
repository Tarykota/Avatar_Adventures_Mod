package net.tarykota.avataradventures.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraftforge.registries.RegistryObject;
import net.tarykota.avataradventures.block.ModBlocks;
import net.tarykota.avataradventures.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.add(ModBlocks.UNOBTAINIUM_ORE.get(),
                block -> createOreDrops(ModBlocks.UNOBTAINIUM_ORE.get(), ModItems.UNOBTAINIUM.get()));

        this.dropSelf(ModBlocks.CHEADLE.get());
        this.add(ModBlocks.POTTED_CHEADLE.get(), createPotFlowerItemTable(ModBlocks.CHEADLE.get()));

    }

    protected LootTable.Builder createOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}