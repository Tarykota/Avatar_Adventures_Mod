package net.tarykota.avataradventures.item.client;

import net.minecraft.resources.ResourceLocation;
import net.tarykota.avataradventures.AvatarAdventuresMod;
import net.tarykota.avataradventures.item.custom.ExopackArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class ExopackArmorModel extends GeoModel<ExopackArmorItem> {
    @Override
    public ResourceLocation getModelResource(ExopackArmorItem animatable) {
        return new ResourceLocation(AvatarAdventuresMod.MOD_ID, "geo/exopack.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ExopackArmorItem animatable) {
        return new ResourceLocation(AvatarAdventuresMod.MOD_ID, "textures/armor/exopack.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ExopackArmorItem animatable) {
        return new ResourceLocation(AvatarAdventuresMod.MOD_ID, "animations/exopack.animation.json");
    }
}
