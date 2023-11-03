package net.tarykota.avataradventures.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tarykota.avataradventures.AvatarAdventuresMod;
import net.tarykota.avataradventures.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AvatarAdventuresMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AVATAR_TAB = CREATIVE_MODE_TABS.register("avatar_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.UNOBTAINIUM.get()))
                    .title(Component.translatable("creativetab.avatar_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.UNOBTAINIUM_ORE.get());
                        pOutput.accept(ModItems.UNOBTAINIUM.get());
                        pOutput.accept(ModItems.UNOBTAINIUM_INGOT.get());
                        pOutput.accept(ModItems.UNOBTAINIUM_SHEET.get());
                        pOutput.accept(ModItems.BANSHEE_SADDLE.get());

                        pOutput.accept(ModItems.TEYLU.get());
                        pOutput.accept(ModItems.COOKED_TEYLU.get());
                        pOutput.accept(ModItems.RAW_BANSHEE.get());
                        pOutput.accept(ModItems.COOKED_BANSHEE.get());
                        pOutput.accept(ModItems.GLOW_WORM.get());



                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
