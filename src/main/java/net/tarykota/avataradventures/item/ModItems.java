package net.tarykota.avataradventures.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tarykota.avataradventures.AvatarAdventuresMod;
import net.tarykota.avataradventures.item.custom.ExopackArmorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AvatarAdventuresMod.MOD_ID);

    public static final RegistryObject<Item> UNOBTAINIUM = ITEMS.register("unobtainium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNOBTAINIUM_INGOT = ITEMS.register("unobtainium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNOBTAINIUM_SHEET = ITEMS.register("unobtainium_sheet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EXOPACK_FACEPLATE = ITEMS.register("exopack_faceplate",
            () -> new ExopackArmorItem(ModArmorMaterials.EXOPACK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> EXOPACK_TANK = ITEMS.register("exopack_tank",
            () -> new ExopackArmorItem(ModArmorMaterials.EXOPACK, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> BANSHEE_SADDLE = ITEMS.register("banshee_saddle",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TEYLU = ITEMS.register("teylu",
            () -> new Item(new Item.Properties().food(ModFoods.TEYLU)));
    public static final RegistryObject<Item> COOKED_TEYLU = ITEMS.register("cooked_teylu",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_TEYLU)));
    public static final RegistryObject<Item> RAW_BANSHEE = ITEMS.register("raw_banshee",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_BANSHEE)));
    public static final RegistryObject<Item> COOKED_BANSHEE = ITEMS.register("cooked_banshee",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_BANSHEE)));
    public static final RegistryObject<Item> GLOW_WORM = ITEMS.register("glow_worm",
            () -> new Item(new Item.Properties().food(ModFoods.GLOW_WORM)));
    public static final RegistryObject<Item> BANANA_FRUIT = ITEMS.register("banana_fruit",
            () -> new Item(new Item.Properties().food(ModFoods.BANANA_FRUIT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
