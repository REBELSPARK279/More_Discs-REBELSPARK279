package net.rebelspark.morediscs.block;


import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.morediscs.MoreDiscs;
import net.rebelspark.morediscs.block.custom.DanceFloor;
import net.rebelspark.morediscs.block.custom.DiscoBall;
import net.rebelspark.morediscs.block.custom.StandingDiscoBall;
import net.rebelspark.morediscs.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MoreDiscs.MOD_ID);

    public static final RegistryObject<Block> EXAMPLE_BLOCK = registerBlock("example_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.STONE)));


    public static final RegistryObject<Block> WHITE_LED_DANCE_FLOOR = registerBlock("white_led_dance_floor",
            () -> new DanceFloor(BlockBehaviour.Properties.of().lightLevel(state -> 15).strength(1f).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> LIGHT_GREY_DANCE_FLOOR = registerBlock("light_grey_dance_floor",
            () -> new DanceFloor(BlockBehaviour.Properties.of().lightLevel(state -> 12).strength(1f).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> GREY_DANCE_FLOOR = registerBlock("grey_dance_floor",
            () -> new DanceFloor(BlockBehaviour.Properties.of().lightLevel(state -> 7).strength(1f).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> BLACK_DANCE_FLOOR = registerBlock("black_dance_floor",
            () -> new DanceFloor(BlockBehaviour.Properties.of().lightLevel(state -> 1).strength(1f).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> BROWN_DANCE_FLOOR = registerBlock("brown_dance_floor",
            () -> new DanceFloor(BlockBehaviour.Properties.of().lightLevel(state -> 5).strength(1f).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> RED_DANCE_FLOOR = registerBlock("red_dance_floor",
            () -> new DanceFloor(BlockBehaviour.Properties.of().lightLevel(state -> 4).strength(1f).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> ORANGE_DANCE_FLOOR = registerBlock("orange_dance_floor",
            () -> new DanceFloor(BlockBehaviour.Properties.of().lightLevel(state -> 9).strength(1f).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> YELLOW_DANCE_FLOOR = registerBlock("yellow_dance_floor",
            () -> new DanceFloor(BlockBehaviour.Properties.of().lightLevel(state -> 13).strength(1f).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> LIME_DANCE_FLOOR = registerBlock("lime_dance_floor",
            () -> new DanceFloor(BlockBehaviour.Properties.of().lightLevel(state -> 11).strength(1f).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> GREEN_DANCE_FLOOR = registerBlock("green_dance_floor",
            () -> new DanceFloor(BlockBehaviour.Properties.of().lightLevel(state -> 9).strength(1f).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> CYAN_DANCE_FLOOR = registerBlock("cyan_dance_floor",
            () -> new DanceFloor(BlockBehaviour.Properties.of().lightLevel(state -> 7).strength(1f).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> LIGHT_BLUE_DANCE_FLOOR = registerBlock("light_blue_dance_floor",
            () -> new DanceFloor(BlockBehaviour.Properties.of().lightLevel(state -> 12).strength(1f).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> BLUE_DANCE_FLOOR = registerBlock("blue_dance_floor",
            () -> new DanceFloor(BlockBehaviour.Properties.of().lightLevel(state -> 7).strength(1f).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> PURPLE_DANCE_FLOOR = registerBlock("purple_dance_floor",
            () -> new DanceFloor(BlockBehaviour.Properties.of().lightLevel(state -> 8).strength(1f).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> MAGENTA_DANCE_FLOOR = registerBlock("magenta_dance_floor",
            () -> new DanceFloor(BlockBehaviour.Properties.of().lightLevel(state -> 10).strength(1f).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> PINK_DANCE_FLOOR = registerBlock("pink_dance_floor",
            () -> new DanceFloor(BlockBehaviour.Properties.of().lightLevel(state -> 13).strength(1f).sound(SoundType.COPPER)));



    public static final RegistryObject<Block> STANDING_DISCO_BALL = registerBlock("standing_disco_ball",
            () -> new StandingDiscoBall(BlockBehaviour.Properties.of().lightLevel(state -> 12).strength(1f).sound(SoundType.GLASS).noOcclusion()));

    public static final RegistryObject<Block> DISCO_BALL = registerBlock("disco_ball",
            () -> new DiscoBall(BlockBehaviour.Properties.of().lightLevel(state -> 13).strength(1f).sound(SoundType.GLASS).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
