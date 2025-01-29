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
import net.rebelspark.morediscs.block.ModBlocks;

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
                        output.accept(ModItems.DANNYDISC.get());
                        output.accept(ModItems.DOGDISC.get());
                        output.accept(ModItems.DREITONDISC.get());
                        output.accept(ModItems.EXECUTIONER_DISC.get());
                        output.accept(ModItems.FLOATING_TREES_DISC.get());
                        output.accept(ModItems.HAGGSTROMDISC.get());
                        output.accept(ModItems.HARDCOREMINECRAFTDISC.get());
                        output.accept(ModItems.HAUNT_MUSKIE_DISC.get());
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
                        output.accept(ModItems.SWEDEN_DISC.get());
                        output.accept(ModItems.WET_HANDS_DISC.get());

                    }).build());


    public static final RegistryObject<CreativeModeTab> MOD_DISC_CORES_TAB = CREATIVE_MODE_TABS.register("disc_cores_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EMPTY_DISC_CORE.get()))
                    .title(Component.translatable("creativetab.more_discs_rebelspark.disc_cores"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.EMPTY_DISC_CORE.get());

                        output.accept(ModItems.DANNY_DISC_CORE.get());
                        output.accept(ModItems.DOG_DISC_CORE.get());
                        output.accept(ModItems.DREITON_DISC_CORE.get());

                        }).build());

    public static final RegistryObject<CreativeModeTab> PARTY_EQUIPMENT_TAB = CREATIVE_MODE_TABS.register("party_equipment_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DISCO_BALL.get()))
                    .title(Component.translatable("creativetab.more_discs_rebelspark.party_equipment"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModBlocks.WHITE_LED_DANCE_FLOOR.get());
                        output.accept(ModBlocks.LIGHT_GREY_DANCE_FLOOR.get());
                        output.accept(ModBlocks.GREY_DANCE_FLOOR.get());
                        output.accept(ModBlocks.BLACK_DANCE_FLOOR.get());
                        output.accept(ModBlocks.BROWN_DANCE_FLOOR.get());
                        output.accept(ModBlocks.RED_DANCE_FLOOR.get());
                        output.accept(ModBlocks.ORANGE_DANCE_FLOOR.get());
                        output.accept(ModBlocks.YELLOW_DANCE_FLOOR.get());
                        output.accept(ModBlocks.LIME_DANCE_FLOOR.get());
                        output.accept(ModBlocks.GREEN_DANCE_FLOOR.get());
                        output.accept(ModBlocks.CYAN_DANCE_FLOOR.get());
                        output.accept(ModBlocks.LIGHT_BLUE_DANCE_FLOOR.get());
                        output.accept(ModBlocks.BLUE_DANCE_FLOOR.get());
                        output.accept(ModBlocks.PURPLE_DANCE_FLOOR.get());
                        output.accept(ModBlocks.MAGENTA_DANCE_FLOOR.get());
                        output.accept(ModBlocks.PINK_DANCE_FLOOR.get());


                        output.accept(ModBlocks.DISCO_BALL.get());
                        output.accept(ModBlocks.STANDING_DISCO_BALL.get());

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
