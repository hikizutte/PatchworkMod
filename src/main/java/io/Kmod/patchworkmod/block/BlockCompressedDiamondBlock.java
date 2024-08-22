package io.Kmod.patchworkmod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class BlockCompressedDiamondBlock extends Block {
    public BlockCompressedDiamondBlock() {
        super(Properties.of()
                .mapColor(MapColor.DIAMOND)
                .requiresCorrectToolForDrops()
                .strength(6.0F, 12.0F)
                .sound(SoundType.METAL));
    }
}
