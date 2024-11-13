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
    public static final RegistryObject<Item> ARIA_MATH_DISC = ITEMS.register("aria_math_music_disc",
        () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ARIA_MATH_KEY).stacksTo(1)));
//C
    public static final RegistryObject<Item> CASTLEMANIADISC = ITEMS.register("castlemania_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.CASTLEMANIA_KEY).stacksTo(1)));
    public static final RegistryObject<Item> CASTLEMANIA2DISC = ITEMS.register("castlemania2_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.CASTLEMANIA2_KEY).stacksTo(1)));

//H
    public static final RegistryObject<Item> HARDCOREMINECRAFTDISC = ITEMS.register("hardcoreminecraft_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.HARDCOREMINECRAFT_KEY).stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
