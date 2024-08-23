package io.Kmod.patchworkmod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class BlockCompressedGoldBlock extends Block {
    public BlockCompressedGoldBlock() {
        super(Properties.of()
                .mapColor(MapColor.GOLD)
                .requiresCorrectToolForDrops()
                .strength(5.0F, 12.0F)
                .sound(SoundType.METAL));
    }
}
