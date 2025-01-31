package net.rebelspark.morediscs.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.morediscs.MoreDiscs;
import net.rebelspark.morediscs.sound.ModSounds;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreDiscs.MOD_ID);



    //PARTY EQUIPMENT




    //DISC CORES

    //D

    public static final RegistryObject<Item> DANNY_DISC_CORE = ITEMS.register("danny_disc_core",
            () -> new Item(new Item.Properties().stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.disc_core_normal"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });



    public static final RegistryObject<Item> DOG_DISC_CORE = ITEMS.register("dog_disc_core",
            () -> new Item(new Item.Properties().stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.disc_core_normal"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> DREITON_DISC_CORE = ITEMS.register("dreiton_disc_core",
            () -> new Item(new Item.Properties().stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.disc_core_normal"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    //E

    public static final RegistryObject<Item> EMPTY_DISC_CORE = ITEMS.register("empty_disc_core",
            () -> new Item(new Item.Properties().stacksTo(16)));


    public static final RegistryObject<Item> COMMON = ITEMS.register("common",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.common_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });
    public static final RegistryObject<Item> UNCOMMON = ITEMS.register("uncommon",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });
    public static final RegistryObject<Item> RARE = ITEMS.register("rare",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.rare_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });
    public static final RegistryObject<Item> EPIC = ITEMS.register("epic",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.epic_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });
    public static final RegistryObject<Item> LEGENDARY = ITEMS.register("legendary",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.legendary_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

//DISCS BELOW

//A

    public static final RegistryObject<Item> ALPHA_DISC = ITEMS.register("alpha_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ALPHA_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> ARIA_MATH_DISC = ITEMS.register("aria_math_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ARIA_MATH_KEY).stacksTo(1)) {
            @Override
            public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));
                super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
            }
        });
//B
    public static final RegistryObject<Item> BACK_ON_DASH_DISC = ITEMS.register("back_on_dash_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.BACK_ON_DASH_KEY).stacksTo(1)) {
            @Override
            public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.vill_disc"));
                super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
            }
        });

    public static final RegistryObject<Item> BEGINNING2_DISC = ITEMS.register("beginning2_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.BEGINNING2_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.rare_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> BIOME_FEST_DISC = ITEMS.register("biome_fest_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.BIOME_FEST_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.epic_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> BLIND_SPOTS_DISC = ITEMS.register("blind_spots_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.BLIND_SPOTS_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });
//C

    public static final RegistryObject<Item> CASTLEMANIADISC = ITEMS.register("castlemania_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.CASTLEMANIA_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.gen_wandy-t_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> CASTLEMANIA2DISC = ITEMS.register("castlemania2_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.CASTLEMANIA2_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.rare_wandy-t_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

//D

    public static final RegistryObject<Item> DANNYDISC = ITEMS.register("danny_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.DANNY_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.legendary_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> DEATHDISC = ITEMS.register("death_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.DEATH_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.vill_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> DOGDISC = ITEMS.register("dog_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.DOG_KEY).stacksTo(1)) {
            @Override
            public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.legendary_disc"));
                super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
            }
        });

    public static final RegistryObject<Item> DREITONDISC = ITEMS.register("dreiton_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.DREITON_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.common_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> DRYHANDSDISC = ITEMS.register("dry_hands_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.DRYHANDS_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.common_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

//E
    public static final RegistryObject<Item> EXECUTIONER_DISC = ITEMS.register("executioner_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.EXECUTIONER_KEY).stacksTo(1)) {
            @Override
            public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.vill_disc"));
                super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
            }
        });

//F

    public static final RegistryObject<Item> FLOATING_TREES_DISC = ITEMS.register("floating_trees_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.FLOATING_TREES_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.common_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

//H
    public static final RegistryObject<Item> HAGGSTROMDISC = ITEMS.register("haggstrom_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.HAGGSTROM_KEY).stacksTo(1)) {
            @Override
            public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.epic_disc"));
                super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
            }
        });

    public static final RegistryObject<Item> HARDCOREMINECRAFTDISC = ITEMS.register("hardcoreminecraft_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.HARDCOREMINECRAFT_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.rare_wandy-t_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> HAUNT_MUSKIE_DISC = ITEMS.register("haunt_muskie_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.HAUNT_MUSKIE_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.common_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> HEADBUGDISC = ITEMS.register("headbug_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.HEADBUG_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.common_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

//I

    public static final RegistryObject<Item> INVINCIBLEDISC = ITEMS.register("invincible_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.INVINCIBLE_KEY).stacksTo(1)) {
            @Override
            public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.gen_wandy-t_disc"));
                super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
            }
        });

//K

    public static final RegistryObject<Item> KIDISC = ITEMS.register("ki_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.KI_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.common_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });


//L

    public static final RegistryObject<Item> LIVING_MICE_DISC = ITEMS.register("living_mice_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.LIVING_MICE_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

//M
    public static final RegistryObject<Item> MICE_ON_VENUS_DISC = ITEMS.register("mice_on_venus_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.MICE_ON_VENUS_KEY).stacksTo(1)) {
            @Override
            public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.epic_disc"));
                super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
            }
        });

    public static final RegistryObject<Item> MINECRAFTDISC = ITEMS.register("minecraft_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.MINECRAFT_KEY).stacksTo(1)) {
            @Override
            public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.legendary_disc"));
                super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
            }
        });

    public static final RegistryObject<Item> MOOG_CITY_DISC = ITEMS.register("moog_city_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.MOOG_CITY_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> MOOG_CITY2_DISC = ITEMS.register("moog_city2_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.MOOG_CITY2_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.legendary_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

    public static final RegistryObject<Item> MUTATIONDISC = ITEMS.register("mutation_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.MUTATION_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });
//S
    public static final RegistryObject<Item> SUBWOOFER_LULLABY_DISC = ITEMS.register("subwoofer_lullaby_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SUBWOOFER_LULLABY_KEY).stacksTo(1)) {
            @Override
            public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.rare_disc"));
                super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
            }
        });

    public static final RegistryObject<Item> SWEDEN_DISC = ITEMS.register("sweden_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SWEDEN_KEY).stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.common_disc"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });

//W
    public static final RegistryObject<Item> WET_HANDS_DISC = ITEMS.register("wet_hands_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.WET_HANDS_KEY).stacksTo(1)) {
            @Override
            public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                pTooltipComponents.add(Component.translatable("tooltip.more_discs_rebelspark.rare_disc"));
                super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
            }
        });



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
