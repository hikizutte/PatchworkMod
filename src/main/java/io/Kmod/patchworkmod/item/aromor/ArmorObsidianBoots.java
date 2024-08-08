package io.Kmod.patchworkmod.item.aromor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;

public class ArmorObsidianBoots extends ArmorItem {

    public ArmorObsidianBoots() {
        super(ModArmorMaterial.OBSIDIAN, Type.BOOTS, new Item.Properties().fireResistant());
    }
}
