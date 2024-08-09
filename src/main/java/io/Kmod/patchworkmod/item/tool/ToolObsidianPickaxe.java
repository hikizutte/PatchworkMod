package io.Kmod.patchworkmod.item.tool;

import net.minecraft.world.item.PickaxeItem;

public class ToolObsidianPickaxe extends PickaxeItem {

    public ToolObsidianPickaxe() {
        super(PatchworkModTiers.OBSIDIAN, 1, -3.0F, new Properties().fireResistant());  //Tier、ベースダメージ、攻撃速度、プロパティ)
        //攻撃速度は4 + float、実際の速度は　1 / (4 + float) 秒
    }
}
