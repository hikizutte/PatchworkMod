package io.Kmod.patchworkmod.item.weapon;

import io.Kmod.patchworkmod.regi.PatchworkModItems;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum BowTiers implements BowTier{

    OBSIDIAN(384 * 12, 1f, 5, Ingredient.of(PatchworkModItems.OBSIDIAN_INGOT.get()));

    private final int durability;
    private final float damageBonus;
    private final int enchantmentValue;
    private final Ingredient repairIngredient;

    BowTiers(int durability, float damageBonus, int enchantmentValue, Ingredient repairIngredient) {
        this.durability = durability;
        this.damageBonus = damageBonus;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damageBonus;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
