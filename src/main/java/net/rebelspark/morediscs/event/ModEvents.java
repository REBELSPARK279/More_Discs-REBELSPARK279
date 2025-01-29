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
    5 24
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
                    new ItemStack(Items.FLINT, 8), 10, 4, 0.07f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 12),
                    new ItemStack(ModItems.ARIA_MATH_DISC.get(), 1), 10, 4, 0.07f));




        }
    }

    @SubscribeEvent
    public static void addWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTradesMAMAMAMA = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

        genericTradesMAMAMAMA.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 3),
                new ItemStack(Items.FLINT, 8), 8, 4, 0.15f));
    }


}