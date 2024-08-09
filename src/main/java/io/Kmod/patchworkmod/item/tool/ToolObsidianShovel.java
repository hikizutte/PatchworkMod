package io.Kmod.patchworkmod.item.tool;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;

public class ToolObsidianShovel extends ShovelItem {

    public ToolObsidianShovel() {
        super(PatchworkModTiers.OBSIDIAN, 1.5F, -3.2F, new Item.Properties().fireResistant());
    }
}
