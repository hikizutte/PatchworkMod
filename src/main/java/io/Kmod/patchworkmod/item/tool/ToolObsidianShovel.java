package io.Kmod.patchworkmod.item.tool;

import net.minecraft.commands.arguments.item.ItemParser;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

public class ToolObsidianShovel extends ShovelItem {
    public ToolObsidianShovel() {
        super(PatchworkModTiers.OBSIDIAN, 1.5F, -3.0F, new Item.Properties().fireResistant());
    }
}
