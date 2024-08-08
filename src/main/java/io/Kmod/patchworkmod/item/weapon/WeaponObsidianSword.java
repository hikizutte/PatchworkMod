package io.Kmod.patchworkmod.item.weapon;

import io.Kmod.patchworkmod.item.tool.PatchworkModTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class WeaponObsidianSword extends SwordItem {
    public WeaponObsidianSword() {
        super(PatchworkModTiers.OBSIDIAN, 3, -2.4F, new Item.Properties().fireResistant());
    }
}
