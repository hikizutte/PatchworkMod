package io.Kmod.patchworkmod.datagen;

import io.Kmod.patchworkmod.main.Patchworkmod;
import io.Kmod.patchworkmod.regi.PatchworkModItems;
import io.Kmod.patchworkmod.regi.PatchworkModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Patchworkmod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(PatchworkModTags.Items.OBSIDIANS)
                .add(PatchworkModItems.OBSIDIAN_INGOT.get(),
                        PatchworkModItems.OBSIDIAN_SWORD.get(),
                        PatchworkModItems.OBSIDIAN_PICKAXE.get(),
                        PatchworkModItems.OBSIDIAN_AXE.get(),
                        PatchworkModItems.OBSIDIAN_SHOVEL.get(),
                        PatchworkModItems.OBSIDIAN_HOE.get(),
                        PatchworkModItems.OBSIDIAN_HELMET.get(),
                        PatchworkModItems.OBSIDIAN_CHESTPLATE.get(),
                        PatchworkModItems.OBSIDIAN_LEGGINGS.get(),
                        PatchworkModItems.OBSIDIAN_BOOTS.get(),
                        PatchworkModItems.OBSIDIAN_BOW.get());
    }
}