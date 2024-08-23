package io.Kmod.patchworkmod.regi;

import io.Kmod.patchworkmod.block.*;
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
        public static final RegistryObject<Block> COMPRESSED_IRON_BLOCK = BLOCKS.register("compressed_iron_block", BlockCompressedIronBlock::new);
        public static final RegistryObject<Block> COMPRESSED_GOLD_BLOCK = BLOCKS.register("compressed_gold_block", BlockCompressedGoldBlock::new);
        public static final RegistryObject<Block> COMPRESSED_DIAMOND_BLOCK = BLOCKS.register("compressed_diamond_block", BlockCompressedDiamondBlock::new);
        public static final RegistryObject<Block> COMPRESSED_EMERALD_BLOCK = BLOCKS.register("compressed_emerald_block", BlockCompressedEmeraldBlock::new);
    }
    public static class BlockItems{
        public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Patchworkmod.MODID);
        public static final RegistryObject<Item> COMPRESSED_COBBLESTONE = BLOCK_ITEMS.register("compressed_cobblestone", () -> new BlockItem(Blocks.COMPRESSED_COBBLESTONE.get(), new Item.Properties()));
        public static final RegistryObject<Item> COMPRESSED_IRON_BLOCK = BLOCK_ITEMS.register("compressed_iron_block", () -> new BlockItem(Blocks.COMPRESSED_IRON_BLOCK.get(), new Item.Properties()));
        public static final RegistryObject<Item> COMPRESSED_GOLD_BLOCK = BLOCK_ITEMS.register("compressed_gold_block", () -> new BlockItem(Blocks.COMPRESSED_GOLD_BLOCK.get(), new Item.Properties()));
        public static final RegistryObject<Item> COMPRESSED_DIAMOND_BLOCK = BLOCK_ITEMS.register("compressed_diamond_block", () -> new BlockItem(Blocks.COMPRESSED_DIAMOND_BLOCK.get(), new Item.Properties()));
        public static final RegistryObject<Item> COMPRESSED_EMERALD_BLOCK = BLOCK_ITEMS.register("compressed_emerald_block", () -> new BlockItem(Blocks.COMPRESSED_EMERALD_BLOCK.get(), new Item.Properties()));
    }
}
