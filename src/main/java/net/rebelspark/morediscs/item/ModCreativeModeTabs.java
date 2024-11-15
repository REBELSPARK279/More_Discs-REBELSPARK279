package net.rebelspark.morediscs.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.morediscs.MoreDiscs;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreDiscs.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_DISCS_TAB = CREATIVE_MODE_TABS.register("mod_discs_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CASTLEMANIADISC.get()))
                    .title(Component.translatable("creativetab.more_discs_rebelspark.mod_discs"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.ARIA_MATH_DISC.get());
                        output.accept(ModItems.BACK_ON_DASH_DISC.get());
                        output.accept(ModItems.CASTLEMANIADISC.get());
                        output.accept(ModItems.CASTLEMANIA2DISC.get());
                        output.accept(ModItems.HARDCOREMINECRAFTDISC.get());
                        output.accept(ModItems.HEADBUGDISC.get());
                        output.accept(ModItems.INVINCIBLEDISC.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
