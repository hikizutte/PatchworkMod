package io.Kmod.patchworkmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ItemObsidianIngot extends Item {
    //初期状態では引数が存在するが、それは消す
    public ItemObsidianIngot() {
        super(new Properties()
                .fireResistant()    //ネザライト同様に溶岩や炎で燃えない
                .rarity(Rarity.COMMON)  //レアリティに応じて発光したりする

        );
    }
}
