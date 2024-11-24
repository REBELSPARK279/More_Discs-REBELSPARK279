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

                        output.accept(ModItems.ALPHA_DISC.get());
                        output.accept(ModItems.ARIA_MATH_DISC.get());
                        output.accept(ModItems.BACK_ON_DASH_DISC.get());
                        output.accept(ModItems.BEGINNING2_DISC.get());
                        output.accept(ModItems.BIOME_FEST_DISC.get());
                        output.accept(ModItems.BLIND_SPOTS_DISC.get());
                        output.accept(ModItems.CASTLEMANIADISC.get());
                        output.accept(ModItems.CASTLEMANIA2DISC.get());
                        output.accept(ModItems.EXECUTIONER_DISC.get());
                        output.accept(ModItems.FLOATING_TREES_DISC.get());
                        output.accept(ModItems.HAGGSTROMDISC.get());
                        output.accept(ModItems.HARDCOREMINECRAFTDISC.get());
                        output.accept(ModItems.HEADBUGDISC.get());
                        output.accept(ModItems.INVINCIBLEDISC.get());
                        output.accept(ModItems.KIDISC.get());
                        output.accept(ModItems.LIVING_MICE_DISC.get());
                        output.accept(ModItems.MICE_ON_VENUS_DISC.get());
                        output.accept(ModItems.MINECRAFTDISC.get());
                        output.accept(ModItems.MOOG_CITY_DISC.get());
                        output.accept(ModItems.MOOG_CITY2_DISC.get());
                        output.accept(ModItems.MUTATIONDISC.get());
                        output.accept(ModItems.SUBWOOFER_LULLABY_DISC.get());
                        output.accept(ModItems.WET_HANDS_DISC.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
