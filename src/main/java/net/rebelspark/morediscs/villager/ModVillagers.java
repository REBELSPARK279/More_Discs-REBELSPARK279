package net.rebelspark.morediscs.villager;

import com.google.common.collect.ImmutableSet;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.common.data.SoundDefinition;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.morediscs.MoreDiscs;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, MoreDiscs.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, MoreDiscs.MOD_ID);

    public static final RegistryObject<PoiType> DISK_JOCKEY_POI = POI_TYPES.register("disc_jockey_poi",
            () -> new PoiType(ImmutableSet.copyOf(Blocks.JUKEBOX.getStateDefinition().getPossibleStates()),
                    1,2));
    public static final RegistryObject<VillagerProfession> DISC_JOCKEY = VILLAGER_PROFESSIONS.register("disc_jockey",
            () -> new VillagerProfession("disc_jockey", holder -> holder.value() == DISK_JOCKEY_POI.get(),
                    holder -> holder.value() == DISK_JOCKEY_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.ALLAY_AMBIENT_WITHOUT_ITEM));




    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
