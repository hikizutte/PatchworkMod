package io.Kmod.patchworkmod.datagen;

import io.Kmod.patchworkmod.main.Patchworkmod;
import io.Kmod.patchworkmod.regi.PatchworkModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
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

        simpleBowItem(PatchworkModItems.OBSIDIAN_BOW);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Patchworkmod.MODID,"item/" + item.getId().getPath()));
    }

    private void simpleBowItem(RegistryObject<Item> item) {
        // ベースの弓アイテムのモデルを設定
        getBuilder(item.getId().getPath())
                .parent(new ModelFile.UncheckedModelFile("item/bow"))
                .texture("layer0", new ResourceLocation(Patchworkmod.MODID, "item/" + item.getId().getPath()))
                .override()
                .predicate(new ResourceLocation("pulling"), 1)
                .model(new ModelFile.UncheckedModelFile(new ResourceLocation(Patchworkmod.MODID, "item/" + item.getId().getPath() + "_pulling_0")))
                .end()
                .override()
                .predicate(new ResourceLocation("pulling"), 1)
                .predicate(new ResourceLocation("pull"), 0.65f)
                .model(new ModelFile.UncheckedModelFile(new ResourceLocation(Patchworkmod.MODID, "item/" + item.getId().getPath() + "_pulling_1")))
                .end()
                .override()
                .predicate(new ResourceLocation("pulling"), 1)
                .predicate(new ResourceLocation("pull"), 0.9f)
                .model(new ModelFile.UncheckedModelFile(new ResourceLocation(Patchworkmod.MODID, "item/" + item.getId().getPath() + "_pulling_2")))
                .end();

        // obsidian_bow_pulling_0.json の生成
        getBuilder(item.getId().getPath() + "_pulling_0")
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", new ResourceLocation(Patchworkmod.MODID, "item/" + item.getId().getPath() + "_pulling_0"));

        // obsidian_bow_pulling_1.json の生成
        getBuilder(item.getId().getPath() + "_pulling_1")
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", new ResourceLocation(Patchworkmod.MODID, "item/" + item.getId().getPath() + "_pulling_1"));

        // obsidian_bow_pulling_2.json の生成
        getBuilder(item.getId().getPath() + "_pulling_2")
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", new ResourceLocation(Patchworkmod.MODID, "item/" + item.getId().getPath() + "_pulling_2"));
    }
}