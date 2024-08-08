package io.Kmod.patchworkmod.item.aromor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

public class ArmorObsidianHelmet extends ArmorItem {
    public ArmorObsidianHelmet() {
        super(ModArmorMaterial.OBSIDIAN, Type.HELMET, new Item.Properties().fireResistant());
    }
}
