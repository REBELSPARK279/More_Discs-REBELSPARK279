package net.rebelspark.morediscs.event;

import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.rebelspark.morediscs.MoreDiscs;
import net.minecraftforge.fml.common.Mod;
import net.rebelspark.morediscs.item.ModItems;
import net.rebelspark.morediscs.villager.ModVillagers;

import java.util.List;


@Mod.EventBusSubscriber(modid = MoreDiscs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEvents {

    /*
    DISC RARITY PRICES
    VILLAGERS
    Common
    1 20
    2 18
    3 16
    4 12
    5 8
    Uncommon
    2 25
    3 22
    4 18
    5 16
    Rare
    3 30
    4 26
    5 21
    Villager Exclusive
    4 48
    5 40
    Epic
    5 52
    WANDY-T'S
    Generic[
    Common: 10
    Uncommon: 14
    Exclusive Generic: 32
    ]
    Rare[
    Uncommon: 10
    Rare: 20
    Epic: 40
    Exclusive Rare: 48
    ]
    */

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == ModVillagers.DISC_JOCKEY.get()) {
            var trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 4),
                    new ItemStack(Items.FLINT, 8), 16, 1, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 3),
                    new ItemStack(Items.FLINT, 8), 16, 1, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 4),
                    new ItemStack(Items.FLINT, 9), 16, 1, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 3),
                    new ItemStack(Items.FLINT, 7), 16, 1, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 5),
                    new ItemStack(Items.FLINT, 9), 16, 1, 0.02f));


            //COMMON

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 20),
                    new ItemStack(ModItems.DREITONDISC.get(), 1), 10, 4, 0.07f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 18),
                    new ItemStack(ModItems.DREITONDISC.get(), 1), 10, 8, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 16),
                    new ItemStack(ModItems.DREITONDISC.get(), 1), 10, 12, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 12),
                    new ItemStack(ModItems.DREITONDISC.get(), 1), 10, 16, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 8),
                    new ItemStack(ModItems.DREITONDISC.get(), 1), 10, 20, 0.07f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 20),
                    new ItemStack(ModItems.DRYHANDSDISC.get(), 1), 10, 4, 0.07f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 18),
                    new ItemStack(ModItems.DRYHANDSDISC.get(), 1), 10, 8, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 16),
                    new ItemStack(ModItems.DRYHANDSDISC.get(), 1), 10, 12, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 12),
                    new ItemStack(ModItems.DRYHANDSDISC.get(), 1), 10, 16, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 8),
                    new ItemStack(ModItems.DRYHANDSDISC.get(), 1), 10, 20, 0.07f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 20),
                    new ItemStack(ModItems.FLOATING_TREES_DISC.get(), 1), 10, 4, 0.07f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 18),
                    new ItemStack(ModItems.FLOATING_TREES_DISC.get(), 1), 10, 8, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 16),
                    new ItemStack(ModItems.FLOATING_TREES_DISC.get(), 1), 10, 12, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 12),
                    new ItemStack(ModItems.FLOATING_TREES_DISC.get(), 1), 10, 16, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 8),
                    new ItemStack(ModItems.FLOATING_TREES_DISC.get(), 1), 10, 20, 0.07f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 20),
                    new ItemStack(ModItems.HAUNT_MUSKIE_DISC.get(), 1), 10, 4, 0.07f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 18),
                    new ItemStack(ModItems.HAUNT_MUSKIE_DISC.get(), 1), 10, 8, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 16),
                    new ItemStack(ModItems.HAUNT_MUSKIE_DISC.get(), 1), 10, 12, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 12),
                    new ItemStack(ModItems.HAUNT_MUSKIE_DISC.get(), 1), 10, 16, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 8),
                    new ItemStack(ModItems.HAUNT_MUSKIE_DISC.get(), 1), 10, 20, 0.07f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 20),
                    new ItemStack(ModItems.HEADBUGDISC.get(), 1), 10, 4, 0.07f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 18),
                    new ItemStack(ModItems.HEADBUGDISC.get(), 1), 10, 8, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 16),
                    new ItemStack(ModItems.HEADBUGDISC.get(), 1), 10, 12, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 12),
                    new ItemStack(ModItems.HEADBUGDISC.get(), 1), 10, 16, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 8),
                    new ItemStack(ModItems.HEADBUGDISC.get(), 1), 10, 20, 0.07f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 20),
                    new ItemStack(ModItems.KIDISC.get(), 1), 10, 4, 0.07f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 18),
                    new ItemStack(ModItems.KIDISC.get(), 1), 10, 8, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 16),
                    new ItemStack(ModItems.KIDISC.get(), 1), 10, 12, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 12),
                    new ItemStack(ModItems.KIDISC.get(), 1), 10, 16, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 8),
                    new ItemStack(ModItems.KIDISC.get(), 1), 10, 20, 0.07f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 20),
                    new ItemStack(ModItems.SWEDEN_DISC.get(), 1), 10, 4, 0.07f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 18),
                    new ItemStack(ModItems.SWEDEN_DISC.get(), 1), 10, 8, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 16),
                    new ItemStack(ModItems.SWEDEN_DISC.get(), 1), 10, 12, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 12),
                    new ItemStack(ModItems.SWEDEN_DISC.get(), 1), 10, 16, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 8),
                    new ItemStack(ModItems.SWEDEN_DISC.get(), 1), 10, 20, 0.07f));

            //UNCOMMON

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 25),
                    new ItemStack(ModItems.ALPHA_DISC.get(), 1), 10, 10, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 22),
                    new ItemStack(ModItems.ALPHA_DISC.get(), 1), 10, 15, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 18),
                    new ItemStack(ModItems.ALPHA_DISC.get(), 1), 10, 20, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 16),
                    new ItemStack(ModItems.ALPHA_DISC.get(), 1), 10, 25, 0.07f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 25),
                    new ItemStack(ModItems.ARIA_MATH_DISC.get(), 1), 10, 10, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 22),
                    new ItemStack(ModItems.ARIA_MATH_DISC.get(), 1), 10, 15, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 18),
                    new ItemStack(ModItems.ARIA_MATH_DISC.get(), 1), 10, 20, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 16),
                    new ItemStack(ModItems.ARIA_MATH_DISC.get(), 1), 10, 25, 0.07f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 25),
                    new ItemStack(ModItems.BLIND_SPOTS_DISC.get(), 1), 10, 10, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 22),
                    new ItemStack(ModItems.BLIND_SPOTS_DISC.get(), 1), 10, 15, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 18),
                    new ItemStack(ModItems.BLIND_SPOTS_DISC.get(), 1), 10, 20, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 16),
                    new ItemStack(ModItems.BLIND_SPOTS_DISC.get(), 1), 10, 25, 0.07f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 25),
                    new ItemStack(ModItems.LIVING_MICE_DISC.get(), 1), 10, 10, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 22),
                    new ItemStack(ModItems.LIVING_MICE_DISC.get(), 1), 10, 15, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 18),
                    new ItemStack(ModItems.LIVING_MICE_DISC.get(), 1), 10, 20, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 16),
                    new ItemStack(ModItems.LIVING_MICE_DISC.get(), 1), 10, 25, 0.07f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 25),
                    new ItemStack(ModItems.MOOG_CITY_DISC.get(), 1), 10, 10, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 22),
                    new ItemStack(ModItems.MOOG_CITY_DISC.get(), 1), 10, 15, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 18),
                    new ItemStack(ModItems.MOOG_CITY_DISC.get(), 1), 10, 20, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 16),
                    new ItemStack(ModItems.MOOG_CITY_DISC.get(), 1), 10, 25, 0.07f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 25),
                    new ItemStack(ModItems.MUTATIONDISC.get(), 1), 10, 10, 0.07f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 22),
                    new ItemStack(ModItems.MUTATIONDISC.get(), 1), 10, 15, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 18),
                    new ItemStack(ModItems.MUTATIONDISC.get(), 1), 10, 20, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 16),
                    new ItemStack(ModItems.MUTATIONDISC.get(), 1), 10, 25, 0.07f));

            //RARE

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 30),
                    new ItemStack(ModItems.BEGINNING2_DISC.get(), 1), 10, 18, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 26),
                    new ItemStack(ModItems.BEGINNING2_DISC.get(), 1), 10, 24, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 21),
                    new ItemStack(ModItems.BEGINNING2_DISC.get(), 1), 10, 30, 0.07f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 30),
                    new ItemStack(ModItems.SUBWOOFER_LULLABY_DISC.get(), 1), 10, 18, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 26),
                    new ItemStack(ModItems.SUBWOOFER_LULLABY_DISC.get(), 1), 10, 24, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 21),
                    new ItemStack(ModItems.SUBWOOFER_LULLABY_DISC.get(), 1), 10, 30, 0.07f));


            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 30),
                    new ItemStack(ModItems.WET_HANDS_DISC.get(), 1), 10, 18, 0.07f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 26),
                    new ItemStack(ModItems.WET_HANDS_DISC.get(), 1), 10, 24, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 21),
                    new ItemStack(ModItems.WET_HANDS_DISC.get(), 1), 10, 30, 0.07f));

            //DISC JOCKEY EXCLUSIVE

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 48),
                    new ItemStack(ModItems.BACK_ON_DASH_DISC.get(), 1), 10, 28, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 40),
                    new ItemStack(ModItems.BACK_ON_DASH_DISC.get(), 1), 10, 35, 0.07f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 48),
                    new ItemStack(ModItems.DEATHDISC.get(), 1), 10, 28, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 40),
                    new ItemStack(ModItems.DEATHDISC.get(), 1), 10, 35, 0.07f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 48),
                    new ItemStack(ModItems.EXECUTIONER_DISC.get(), 1), 10, 28, 0.07f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 40),
                    new ItemStack(ModItems.EXECUTIONER_DISC.get(), 1), 10, 35, 0.07f));

            //EPIC

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 52),
                    new ItemStack(ModItems.BIOME_FEST_DISC.get(), 1), 10, 40, 0.07f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 52),
                    new ItemStack(ModItems.HAGGSTROMDISC.get(), 1), 10, 40, 0.07f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 52),
                    new ItemStack(ModItems.MICE_ON_VENUS_DISC.get(), 1), 10, 40, 0.07f));


        }
    }

    @SubscribeEvent
    public static void addWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 3),
                new ItemStack(Items.FLINT, 8), 8, 4, 0.15f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 10),
                new ItemStack(ModItems.DREITONDISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 10),
                new ItemStack(ModItems.DRYHANDSDISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 10),
                new ItemStack(ModItems.FLOATING_TREES_DISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 10),
                new ItemStack(ModItems.HAUNT_MUSKIE_DISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 10),
                new ItemStack(ModItems.HEADBUGDISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 10),
                new ItemStack(ModItems.KIDISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 10),
                new ItemStack(ModItems.SWEDEN_DISC.get(), 1), 3, 4, 0.25f));

        //UNCOMMON

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 14),
                new ItemStack(ModItems.ALPHA_DISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 14),
                new ItemStack(ModItems.ARIA_MATH_DISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 14),
                new ItemStack(ModItems.BLIND_SPOTS_DISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 14),
                new ItemStack(ModItems.LIVING_MICE_DISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 14),
                new ItemStack(ModItems.MOOG_CITY_DISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 14),
                new ItemStack(ModItems.MUTATIONDISC.get(), 1), 3, 4, 0.25f));

        //EXCLUSIVE

        rareTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 48),
                new ItemStack(ModItems.CASTLEMANIA2DISC.get(), 1), 3, 4, 0.25f));

        rareTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 48),
                new ItemStack(ModItems.HARDCOREMINECRAFTDISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 48),
                new ItemStack(ModItems.CASTLEMANIADISC.get(), 1), 3, 4, 0.25f));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 48),
                new ItemStack(ModItems.INVINCIBLEDISC.get(), 1), 3, 4, 0.25f));

    }


}