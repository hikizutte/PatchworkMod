package io.Kmod.patchworkmod.item.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

public class ArmorObsidianLeggings extends ArmorItem{
    public ArmorObsidianLeggings() {
        super(ModArmorMaterial.OBSIDIAN, Type.LEGGINGS, new Item.Properties().fireResistant());
    }
}
