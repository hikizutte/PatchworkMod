package io.Kmod.patchworkmod.regi;

import io.Kmod.patchworkmod.item.ItemObsidianIngot;
import io.Kmod.patchworkmod.item.armor.ArmorObsidianBoots;
import io.Kmod.patchworkmod.item.armor.ArmorObsidianChestplate;
import io.Kmod.patchworkmod.item.armor.ArmorObsidianHelmet;
import io.Kmod.patchworkmod.item.armor.ArmorObsidianLeggings;
import io.Kmod.patchworkmod.item.tool.ToolObsidianAxe;
import io.Kmod.patchworkmod.item.tool.ToolObsidianHoe;
import io.Kmod.patchworkmod.item.tool.ToolObsidianPickaxe;
import io.Kmod.patchworkmod.item.tool.ToolObsidianShovel;
import io.Kmod.patchworkmod.item.weapon.WeaponObsidianBow;
import io.Kmod.patchworkmod.item.weapon.WeaponObsidianSword;
import io.Kmod.patchworkmod.main.Patchworkmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PatchworkModItems {

    public static final DeferredRegister<Item> BOWS = DeferredRegister.create(ForgeRegistries.ITEMS, Patchworkmod.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Patchworkmod.MODID);

    public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot", ItemObsidianIngot::new);
    //黒曜石装備
    public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", WeaponObsidianSword::new);
    public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", ToolObsidianPickaxe::new);
    public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", ToolObsidianAxe::new);
    public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", ToolObsidianShovel::new);
    public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", ToolObsidianHoe::new);
    public static final RegistryObject<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", ArmorObsidianHelmet::new);
    public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate", ArmorObsidianChestplate::new);
    public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings", ArmorObsidianLeggings::new);
    public static final RegistryObject<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots", ArmorObsidianBoots::new);
    public static final RegistryObject<Item> OBSIDIAN_BOW = BOWS.register("obsidian_bow", WeaponObsidianBow::new);
}
