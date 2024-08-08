package io.Kmod.patchworkmod.item.aromor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

public class ArmorObsidianChestplate extends ArmorItem {

    public ArmorObsidianChestplate() {
        super(ModArmorMaterial.OBSIDIAN, Type.CHESTPLATE, new Item.Properties().fireResistant());
    }
}
