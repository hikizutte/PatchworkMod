package io.Kmod.patchworkmod.item.tool;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;

public class ToolObsidianAxe extends AxeItem {
    public ToolObsidianAxe() {
        super(PatchworkModTiers.OBSIDIAN, 6F, -3.0F, new Item.Properties().fireResistant());
    }
}
