package io.Kmod.patchworkmod.item;

import com.mojang.blaze3d.shaders.Effect;
import io.Kmod.patchworkmod.regi.PatchworkModTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;

public class ItemObsidianIngot extends Item {

    @Override
    public void inventoryTick(ItemStack stack, Level world, Entity entity, int slot, boolean bool) {
        super.inventoryTick(stack, world, entity, slot, bool);
        if(entity instanceof  Player){
            Player player = (Player) entity;
            if(player.getMainHandItem().is(PatchworkModTags.Items.OBSIDIANS)){
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 0));
            }
        }
    }

    //初期状態では引数が存在するが、それは消す
    public ItemObsidianIngot() {
        super(new Properties()
                .fireResistant()    //ネザライト同様に溶岩や炎で燃えない
                .rarity(Rarity.COMMON)  //レアリティに応じて発光したりする

        );
    }
}
