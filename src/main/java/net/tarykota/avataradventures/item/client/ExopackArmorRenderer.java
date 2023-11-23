package net.tarykota.avataradventures.item.client;

import net.tarykota.avataradventures.item.custom.ExopackArmorItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ExopackArmorRenderer extends GeoArmorRenderer<ExopackArmorItem> {
    public ExopackArmorRenderer() {
        super(new ExopackArmorModel());
    }
}
