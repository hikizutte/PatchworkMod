package io.Kmod.patchworkmod.item.weapon;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;
//https://github.com/mpbb/ironbows/blob/1.20.1/src/main/java/com/mpbb/ironbows/item/TieredBowItem.java
public class TieredBowItem extends BowItem {
    private final BowTier tier;

    public TieredBowItem(BowTier tier, Properties properties) {
        super(properties.durability(tier.getDurability()));
        this.tier = tier;
    }

    public BowTier getTier(){
        return this.tier;
    }

    @Override
    public @NotNull AbstractArrow customArrow(AbstractArrow arrow) {
        arrow.setBaseDamage(arrow.getBaseDamage() + this.tier.getAttackDamageBonus());
        return arrow;
    }

    @Override
    public int getEnchantmentValue() {
        return this.tier.getEnchantmentValue();
    }

    @Override
    public boolean isValidRepairItem(@NotNull ItemStack p_41402_, @NotNull ItemStack p_41403_) {
        return this.tier.getRepairIngredient().test(p_41403_);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack,  Level world, List<Component> components, @NotNull TooltipFlag flag) {
        components.add(Component.literal("+" + Float.toString(this.tier.getAttackDamageBonus()) + " ")
                .append(Component.translatable("item.patchworkmod.damage_tooltip"))
                .withStyle(ChatFormatting.DARK_GREEN));
        super.appendHoverText(stack, world, components, flag);
    }
}
