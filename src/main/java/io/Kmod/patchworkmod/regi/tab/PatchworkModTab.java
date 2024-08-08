package io.Kmod.patchworkmod.regi.tab;

import io.Kmod.patchworkmod.main.Patchworkmod;
import io.Kmod.patchworkmod.regi.PatchworkModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class PatchworkModTab {
    private static final String[] TabName = { "patchwork", "patchworksub"};

    public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Patchworkmod.MODID);
    public static final RegistryObject<CreativeModeTab> PATCHWORK_MAIN = MOD_TABS.register(TabName[0],
            () -> {return CreativeModeTab.builder().icon(() -> new ItemStack(PatchworkModItems.OBSIDIAN_INGOT.get()))
                    .title(Component.translatable("itemGroup.patchwork_main"))
                    .displayItems((param,output) -> {
                        for(Item item : PatchworkMain.items){
                            output.accept(item);
                        }
                    }).build();
    });
    public static final RegistryObject<CreativeModeTab> PATCHWORK_SUB = MOD_TABS.register(TabName[1],
            () -> {return CreativeModeTab.builder().icon(() -> new ItemStack(PatchworkModItems.OBSIDIAN_PICKAXE.get()))
                    .title(Component.translatable("itemGroup.patchwork_equipments"))
                    .withTabsBefore(PatchworkModTab.PATCHWORK_MAIN.getId())
                    .displayItems((param,output) -> {
                        for(Item item : PatchworkMain.tools){
                            output.accept(item);
                        }
                    }).build();
            });
}
