package net.rebelspark.morediscs.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.morediscs.MoreDiscs;
import net.rebelspark.morediscs.sound.ModSounds;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreDiscs.MOD_ID);



//A

    public static final RegistryObject<Item> ALPHA_DISC = ITEMS.register("alpha_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ALPHA_KEY).stacksTo(1)));

    public static final RegistryObject<Item> ARIA_MATH_DISC = ITEMS.register("aria_math_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ARIA_MATH_KEY).stacksTo(1)));
//B
    public static final RegistryObject<Item> BACK_ON_DASH_DISC = ITEMS.register("back_on_dash_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.BACK_ON_DASH_KEY).stacksTo(1)));

    public static final RegistryObject<Item> BEGINNING2_DISC = ITEMS.register("beginning2_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.BEGINNING2_KEY).stacksTo(1)));

    public static final RegistryObject<Item> BIOME_FEST_DISC = ITEMS.register("biome_fest_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.BIOME_FEST_KEY).stacksTo(1)));

    public static final RegistryObject<Item> BLIND_SPOTS_DISC = ITEMS.register("blind_spots_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.BLIND_SPOTS_KEY).stacksTo(1)));
//C

    public static final RegistryObject<Item> CASTLEMANIADISC = ITEMS.register("castlemania_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.CASTLEMANIA_KEY).stacksTo(1)));

    public static final RegistryObject<Item> CASTLEMANIA2DISC = ITEMS.register("castlemania2_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.CASTLEMANIA2_KEY).stacksTo(1)));
//E
    public static final RegistryObject<Item> EXECUTIONER_DISC = ITEMS.register("executioner_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.EXECUTIONER_KEY).stacksTo(1)));

//F

    public static final RegistryObject<Item> FLOATING_TREES_DISC = ITEMS.register("floating_trees_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.FLOATING_TREES_KEY).stacksTo(1)));

//H
    public static final RegistryObject<Item> HAGGSTROMDISC = ITEMS.register("haggstrom_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.HAGGSTROM_KEY).stacksTo(1)));

    public static final RegistryObject<Item> HARDCOREMINECRAFTDISC = ITEMS.register("hardcoreminecraft_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.HARDCOREMINECRAFT_KEY).stacksTo(1)));

    public static final RegistryObject<Item> HEADBUGDISC = ITEMS.register("headbug_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.HEADBUG_KEY).stacksTo(1)));

//I

    public static final RegistryObject<Item> INVINCIBLEDISC = ITEMS.register("invincible_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.INVINCIBLE_KEY).stacksTo(1)));

//K

    public static final RegistryObject<Item> KIDISC = ITEMS.register("ki_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.KI_KEY).stacksTo(1)));


//L

    public static final RegistryObject<Item> LIVING_MICE_DISC = ITEMS.register("living_mice_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.LIVING_MICE_KEY).stacksTo(1)));

//M
    public static final RegistryObject<Item> MICE_ON_VENUS_DISC = ITEMS.register("mice_on_venus_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.MICE_ON_VENUS_KEY).stacksTo(1)));

    public static final RegistryObject<Item> MINECRAFTDISC = ITEMS.register("minecraft_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.MINECRAFT_KEY).stacksTo(1)));

    public static final RegistryObject<Item> MOOG_CITY_DISC = ITEMS.register("moog_city_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.MOOG_CITY_KEY).stacksTo(1)));

    public static final RegistryObject<Item> MOOG_CITY2_DISC = ITEMS.register("moog_city2_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.MOOG_CITY2_KEY).stacksTo(1)));

    public static final RegistryObject<Item> MUTATIONDISC = ITEMS.register("mutation_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.MUTATION_KEY).stacksTo(1)));
//S
    public static final RegistryObject<Item> SUBWOOFER_LULLABY_DISC = ITEMS.register("subwoofer_lullaby_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SUBWOOFER_LULLABY_KEY).stacksTo(1)));

//W
    public static final RegistryObject<Item> WET_HANDS_DISC = ITEMS.register("wet_hands_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.WET_HANDS_KEY).stacksTo(1)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
