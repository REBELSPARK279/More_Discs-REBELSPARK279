package net.rebelspark.morediscs.sound;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.morediscs.MoreDiscs;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MoreDiscs.MOD_ID);

    //A
    public static final RegistryObject<SoundEvent> ALPHA = registerSoundEvent("alpha");
    public static final ResourceKey<JukeboxSong> ALPHA_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "alpha"));

    public static final RegistryObject<SoundEvent> ARIA_MATH = registerSoundEvent("aria_math");
    public static final ResourceKey<JukeboxSong> ARIA_MATH_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "aria_math"));
    //B
    public static final RegistryObject<SoundEvent> BACK_ON_DASH = registerSoundEvent("back_on_dash");
    public static final ResourceKey<JukeboxSong> BACK_ON_DASH_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "back_on_dash"));

    public static final RegistryObject<SoundEvent> BEGINNING2 = registerSoundEvent("beginning2");
    public static final ResourceKey<JukeboxSong> BEGINNING2_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "beginning2"));

    public static final RegistryObject<SoundEvent> BIOME_FEST = registerSoundEvent("biome_fest");
    public static final ResourceKey<JukeboxSong> BIOME_FEST_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "biome_fest"));

    public static final RegistryObject<SoundEvent> BLIND_SPOTS = registerSoundEvent("blind_spots");
    public static final ResourceKey<JukeboxSong> BLIND_SPOTS_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "blind_spots"));

    //C
    public static final RegistryObject<SoundEvent> CASTLEMANIA = registerSoundEvent("castlemania");
    public static final ResourceKey<JukeboxSong> CASTLEMANIA_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "castlemania"));

    public static final RegistryObject<SoundEvent> CASTLEMANIA2 = registerSoundEvent("castlemania2");
    public static final ResourceKey<JukeboxSong> CASTLEMANIA2_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "castlemania2"));

    //D

    public static final RegistryObject<SoundEvent> DANNY = registerSoundEvent("danny");
    public static final ResourceKey<JukeboxSong> DANNY_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "danny"));

    public static final RegistryObject<SoundEvent> DOG = registerSoundEvent("dog");
    public static final ResourceKey<JukeboxSong> DOG_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "dog"));

    public static final RegistryObject<SoundEvent> DREITON = registerSoundEvent("dreiton");
    public static final ResourceKey<JukeboxSong> DREITON_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "dreiton"));

    //E

    public static final RegistryObject<SoundEvent> EXECUTIONER = registerSoundEvent("executioner");
    public static final ResourceKey<JukeboxSong> EXECUTIONER_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "executioner"));

    //F

    public static final RegistryObject<SoundEvent> FLOATING_TREES = registerSoundEvent("floating_trees");
    public static final ResourceKey<JukeboxSong> FLOATING_TREES_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "floating_trees"));


    //H

    public static final RegistryObject<SoundEvent> HAGGSTROM = registerSoundEvent("haggstrom");
    public static final ResourceKey<JukeboxSong> HAGGSTROM_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "haggstrom"));

    public static final RegistryObject<SoundEvent> HARDCOREMINECRAFT = registerSoundEvent("hardcoreminecraft");
    public static final ResourceKey<JukeboxSong> HARDCOREMINECRAFT_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "hardcoreminecraft"));

    public static final RegistryObject<SoundEvent> HAUNT_MUSKIE = registerSoundEvent("haunt_muskie");
    public static final ResourceKey<JukeboxSong> HAUNT_MUSKIE_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "haunt_muskie"));

    public static final RegistryObject<SoundEvent> HEADBUG = registerSoundEvent("headbug");
    public static final ResourceKey<JukeboxSong> HEADBUG_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "headbug"));

    //I

    public static final RegistryObject<SoundEvent> INVINCIBLE = registerSoundEvent("invincible");
    public static final ResourceKey<JukeboxSong> INVINCIBLE_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "invincible"));

    //K

    public static final RegistryObject<SoundEvent> KI = registerSoundEvent("ki");
    public static final ResourceKey<JukeboxSong> KI_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "ki"));

    //L

    public static final RegistryObject<SoundEvent> LIVINGMICE = registerSoundEvent("living_mice");
    public static final ResourceKey<JukeboxSong> LIVING_MICE_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "living_mice"));

    //M

    public static final RegistryObject<SoundEvent> MICE_ON_VENUS = registerSoundEvent("mice_on_venus");
    public static final ResourceKey<JukeboxSong> MICE_ON_VENUS_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "mice_on_venus"));

    public static final RegistryObject<SoundEvent> MINECRAFT = registerSoundEvent("minecraft");
    public static final ResourceKey<JukeboxSong> MINECRAFT_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "minecraft"));

    public static final RegistryObject<SoundEvent> MOOG_CITY = registerSoundEvent("moog_city");
    public static final ResourceKey<JukeboxSong> MOOG_CITY_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "moog_city"));

    public static final RegistryObject<SoundEvent> MOOG_CITY2 = registerSoundEvent("moog_city2");
    public static final ResourceKey<JukeboxSong> MOOG_CITY2_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "moog_city2"));

    public static final RegistryObject<SoundEvent> MUTATION = registerSoundEvent("mutation");
    public static final ResourceKey<JukeboxSong> MUTATION_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "mutation"));

    //S

    public static final RegistryObject<SoundEvent> SUBWOOFER_LULLABY = registerSoundEvent("subwoofer_lullaby");
    public static final ResourceKey<JukeboxSong> SUBWOOFER_LULLABY_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "subwoofer_lullaby"));

    public static final RegistryObject<SoundEvent> SWEDEN = registerSoundEvent("sweden");
    public static final ResourceKey<JukeboxSong> SWEDEN_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "sweden"));

    //W

    public static final RegistryObject<SoundEvent> WET_HANDS = registerSoundEvent("wet_hands");
    public static final ResourceKey<JukeboxSong> WET_HANDS_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "wet_hands"));


    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
