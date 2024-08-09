package io.Kmod.patchworkmod.item.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

public class ArmorObsidianHelmet extends ArmorItem {
    public ArmorObsidianHelmet() {
        super(ModArmorMaterial.OBSIDIAN, Type.HELMET, new Item.Properties().fireResistant());
    }
}
