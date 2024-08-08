package io.Kmod.patchworkmod.item.tool;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class ToolObsidianPickaxe extends PickaxeItem {

    public ToolObsidianPickaxe() {
        super(PatchworkModTiers.OBSIDIAN, 1, -2.8F, new Properties().fireResistant());  //Tier、ベースダメージ、攻撃速度、プロパティ)
        //攻撃速度は4 + float、実際の速度は　1 / (4 + float) 秒
    }
}
