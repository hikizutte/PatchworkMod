package io.Kmod.patchworkmod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class BlockCompressedIronBlock extends Block {
    public BlockCompressedIronBlock() {
        super(Properties.of()
                .mapColor(MapColor.METAL)
                .requiresCorrectToolForDrops()
                .strength(4.0F, 8.0F)
                .sound(SoundType.METAL));
    }
}
