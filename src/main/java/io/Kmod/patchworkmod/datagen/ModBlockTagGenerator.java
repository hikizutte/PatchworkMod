package io.Kmod.patchworkmod.datagen;

import io.Kmod.patchworkmod.main.Patchworkmod;
import io.Kmod.patchworkmod.regi.PatchworkModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Patchworkmod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
//        this.tag(PatchworkModTags.Blocks.NEEDS_OLDERITE_TOOL)
//                .add(ModBlocks.SAPPHIRE_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(PatchworkModBlocks.Blocks.COMPRESSED_COBBLESTONE.get(),
                        PatchworkModBlocks.Blocks.COMPRESSED_IRON_BLOCK.get(),
                        PatchworkModBlocks.Blocks.COMPRESSED_GOLD_BLOCK.get(),
                        PatchworkModBlocks.Blocks.COMPRESSED_DIAMOND_BLOCK.get(),
                        PatchworkModBlocks.Blocks.COMPRESSED_EMERALD_BLOCK.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(PatchworkModBlocks.Blocks.COMPRESSED_IRON_BLOCK.get(),
                        PatchworkModBlocks.Blocks.COMPRESSED_GOLD_BLOCK.get(),
                        PatchworkModBlocks.Blocks.COMPRESSED_DIAMOND_BLOCK.get(),
                        PatchworkModBlocks.Blocks.COMPRESSED_EMERALD_BLOCK.get());

//        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
//                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(PatchworkModBlocks.Blocks.COMPRESSED_COBBLESTONE.get());

//        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
//                .add(ModBlocks.END_STONE_SAPPHIRE_ORE.get());


    }
}
