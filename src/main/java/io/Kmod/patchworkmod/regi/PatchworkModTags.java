package io.Kmod.patchworkmod.regi;

import io.Kmod.patchworkmod.main.Patchworkmod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class PatchworkModTags {

    public static class Blocks{

        public static final TagKey<Block> NEEDS_OLDERITE_TOOL = tag("needs_olderite_tool");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(Patchworkmod.MODID, name));
        }
    }
    public static class Items {

        public static final TagKey<Item> OBSIDIANS = tag("obsidians");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Patchworkmod.MODID, name));
        }
    }
}
