package net.tarykota.avataradventures.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tarykota.avataradventures.AvatarAdventuresMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AvatarAdventuresMod.MOD_ID);

    public static final RegistryObject<Item> UNOBTAINIUM = ITEMS.register("unobtainium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNOBTAINIUM_SHEET = ITEMS.register("unobtainium_sheet",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
