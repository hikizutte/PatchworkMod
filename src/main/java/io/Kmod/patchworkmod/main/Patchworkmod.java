package io.Kmod.patchworkmod.main;

import com.mojang.logging.LogUtils;
import io.Kmod.patchworkmod.regi.PatchworkModBlocks;
import io.Kmod.patchworkmod.regi.PatchworkModItems;
import io.Kmod.patchworkmod.regi.tab.PatchworkModTab;
import net.minecraft.client.Minecraft;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Patchworkmod.MODID)
public class Patchworkmod {

    public static final String MODID = "patchworkmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final IEventBus PATCHWORKMOD_EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();
    public static final IEventBus EVENT_BUS = MinecraftForge.EVENT_BUS;

    public Patchworkmod() {
        EVENT_BUS.register(this);

        //アイテム登録の設定
        PatchworkModItems.ITEMS.register(PATCHWORKMOD_EVENT_BUS);
        PatchworkModItems.BOWS.register(PATCHWORKMOD_EVENT_BUS);
        //ブロックアイテム登録の設定
        PatchworkModBlocks.Blocks.BLOCKS.register(PATCHWORKMOD_EVENT_BUS);
        PatchworkModBlocks.BlockItems.BLOCK_ITEMS.register(PATCHWORKMOD_EVENT_BUS);
        //クリエイティブタブの追加
        PatchworkModTab.MOD_TABS.register(PATCHWORKMOD_EVENT_BUS);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));

//        if (Config.logDirtBlock)
//            LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
//
//        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);
//
//        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
