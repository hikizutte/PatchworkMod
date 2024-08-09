package io.Kmod.patchworkmod.item.tool;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;

public class ToolObsidianHoe extends HoeItem {
    public ToolObsidianHoe() {
        super(PatchworkModTiers.OBSIDIAN, -4, 0.0F, new Item.Properties().fireResistant());
    }
}
