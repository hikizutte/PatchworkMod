package io.Kmod.patchworkmod.main;

import io.Kmod.patchworkmod.item.weapon.TieredBowItem;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.event.ComputeFovModifierEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.api.distmarker.Dist;

//https://github.com/mpbb/ironbows/blob/1.20.1/src/main/java/com/mpbb/ironbows/ForgeClient.java

@Mod.EventBusSubscriber(modid = Patchworkmod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ForgeClient {
    @SubscribeEvent
    public static void onFOVUpdate(ComputeFovModifierEvent event)
    {
        LivingEntity player = event.getPlayer();
        Item item = player.getUseItem().getItem();
        if(item instanceof TieredBowItem) {
            float FOVModifier = player.getTicksUsingItem() / (float)TieredBowItem.MAX_DRAW_DURATION;
            if (FOVModifier > 1.0f) {
                FOVModifier = 1.0f;
            }
            else {
                FOVModifier *= FOVModifier;
            }
            event.setNewFovModifier(event.getNewFovModifier() * (1.0f - FOVModifier * 0.15f));
        }
    }
}
