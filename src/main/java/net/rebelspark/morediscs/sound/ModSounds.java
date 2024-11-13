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
    public static final RegistryObject<SoundEvent> ARIA_MATH = registerSoundEvent("aria_math");
    public static final ResourceKey<JukeboxSong> ARIA_MATH_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "aria_math"));
    //C
    public static final RegistryObject<SoundEvent> CASTLEMANIA = registerSoundEvent("castlemania");
    public static final ResourceKey<JukeboxSong> CASTLEMANIA_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "castlemania"));
    public static final RegistryObject<SoundEvent> CASTLEMANIA2 = registerSoundEvent("castlemania2");
    public static final ResourceKey<JukeboxSong> CASTLEMANIA2_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "castlemania2"));

    //H

    public static final RegistryObject<SoundEvent> HARDCOREMINECRAFT = registerSoundEvent("hardcoreminecraft");
    public static final ResourceKey<JukeboxSong> HARDCOREMINECRAFT_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, "hardcoreminecraft"));


    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(MoreDiscs.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
