package io.Kmod.patchworkmod.item.weapon;

import net.minecraft.world.item.Item;

public class WeaponObsidianBow extends TieredBowItem {
    public WeaponObsidianBow() {
        super(BowTiers.OBSIDIAN ,new Item.Properties().fireResistant());
    }
}
