package io.Kmod.patchworkmod.item.weapon;

import net.minecraft.world.item.crafting.Ingredient;

public interface BowTier {
    int getDurability();

    float getAttackDamageBonus();

    int getEnchantmentValue();

    Ingredient getRepairIngredient();
}
