package io.Kmod.patchworkmod.datagen;

import io.Kmod.patchworkmod.main.Patchworkmod;
import io.Kmod.patchworkmod.regi.PatchworkModBlocks;
import io.Kmod.patchworkmod.regi.PatchworkModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Patchworkmod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(PatchworkModItems.OBSIDIAN_INGOT);
        simpleItem(PatchworkModItems.OBSIDIAN_SWORD);
        simpleItem(PatchworkModItems.OBSIDIAN_PICKAXE);
        simpleItem(PatchworkModItems.OBSIDIAN_AXE);
        simpleItem(PatchworkModItems.OBSIDIAN_SHOVEL);
        simpleItem(PatchworkModItems.OBSIDIAN_HOE);
        simpleItem(PatchworkModItems.OBSIDIAN_HELMET);
        simpleItem(PatchworkModItems.OBSIDIAN_CHESTPLATE);
        simpleItem(PatchworkModItems.OBSIDIAN_LEGGINGS);
        simpleItem(PatchworkModItems.OBSIDIAN_BOOTS);
        simpleItem(PatchworkModItems.OBSIDIAN_BOW);

        simpleItem(PatchworkModBlocks.BlockItems.COMPRESSED_COBBLESTONE);
        simpleItem(PatchworkModBlocks.BlockItems.COMPRESSED_IRON_BLOCK);
        simpleItem(PatchworkModBlocks.BlockItems.COMPRESSED_GOLD_BLOCK);
        simpleItem(PatchworkModBlocks.BlockItems.COMPRESSED_DIAMOND_BLOCK);
        simpleItem(PatchworkModBlocks.BlockItems.COMPRESSED_EMERALD_BLOCK);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Patchworkmod.MODID,"item/" + item.getId().getPath()));
    }
}