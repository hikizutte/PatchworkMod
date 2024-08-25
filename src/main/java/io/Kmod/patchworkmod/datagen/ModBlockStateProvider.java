package io.Kmod.patchworkmod.datagen;

import io.Kmod.patchworkmod.main.Patchworkmod;

import io.Kmod.patchworkmod.regi.PatchworkModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output,  Patchworkmod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(PatchworkModBlocks.Blocks.COMPRESSED_COBBLESTONE);
        blockWithItem(PatchworkModBlocks.Blocks.COMPRESSED_IRON_BLOCK);
        blockWithItem(PatchworkModBlocks.Blocks.COMPRESSED_GOLD_BLOCK);
        blockWithItem(PatchworkModBlocks.Blocks.COMPRESSED_DIAMOND_BLOCK);
        blockWithItem(PatchworkModBlocks.Blocks.COMPRESSED_EMERALD_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
