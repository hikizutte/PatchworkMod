package io.Kmod.patchworkmod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class BlockCompressedCobblestone extends Block {

    public BlockCompressedCobblestone() {
        super(Properties.of()
                .strength(5F, 6F)
//                .harvestTool(ToolType.PICKAXE)
//                .harvestLevel(2)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()
        );
    }
}