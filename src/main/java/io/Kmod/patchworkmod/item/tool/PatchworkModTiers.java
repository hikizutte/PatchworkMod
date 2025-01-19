package io.Kmod.patchworkmod.item.tool;

import io.Kmod.patchworkmod.main.Patchworkmod;
import io.Kmod.patchworkmod.regi.PatchworkModItems;
import io.Kmod.patchworkmod.regi.PatchworkModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import  net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class PatchworkModTiers {

    public static ForgeTier OBSIDIAN = new ForgeTier(3,2200, 10.0F, 4.5F, 7, PatchworkModTags.Blocks.NEEDS_OLDERITE_TOOL, ()-> Ingredient.of(PatchworkModItems.OBSIDIAN_INGOT.get()));

    static {
        TierSortingRegistry.registerTier(OBSIDIAN, new ResourceLocation(Patchworkmod.MODID, "obsidian"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
    }
}
