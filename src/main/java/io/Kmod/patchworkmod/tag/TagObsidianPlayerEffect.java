package io.Kmod.patchworkmod.tag;

import io.Kmod.patchworkmod.main.Patchworkmod;
import io.Kmod.patchworkmod.regi.PatchworkModTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Patchworkmod.MODID)
public class TagObsidianPlayerEffect {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        Inventory inventory = player.getInventory();
        Iterable<ItemStack> armor = player.getArmorSlots();
        // プレイヤーのインベントリをチェック
        for (ItemStack stack : inventory.items) {
            if (stack.is(PatchworkModTags.Items.OBSIDIANS)) {
                // 特定のタグが付いたアイテムが見つかった場合、効果を発揮させる
                applyEffect(player);
            }
        }
        for(ItemStack stack : armor){
            if (stack.is(PatchworkModTags.Items.OBSIDIANS)) {
                // 特定のタグが付いたアイテムが見つかった場合、効果を発揮させる
                applyEffect(player);
            }
        }
    }

    private static void applyEffect(Player player) {
        // 効果を実装
        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 0));
    }
}
