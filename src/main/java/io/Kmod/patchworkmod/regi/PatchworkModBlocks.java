package io.Kmod.patchworkmod.regi;

import io.Kmod.patchworkmod.block.BlockCompressedCobblestone;
import io.Kmod.patchworkmod.main.Patchworkmod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PatchworkModBlocks {

    public static class Blocks{
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Patchworkmod.MODID);
        public static final RegistryObject<Block> COMPRESSED_COBBLESTONE = BLOCKS.register("compressed_cobblestone", BlockCompressedCobblestone::new);
    }
    public static class BlockItems{
        public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Patchworkmod.MODID);
        public static final RegistryObject<Item> COMPRESSED_COBBLESTONE = BLOCK_ITEMS.register("compressed_cobblestone", () -> new BlockItem(Blocks.COMPRESSED_COBBLESTONE.get(), new Item.Properties()));
    }
}
