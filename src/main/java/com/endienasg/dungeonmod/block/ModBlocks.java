package com.endienasg.dungeonmod.block;

import com.endienasg.dungeonmod.DungeonMod;
import com.endienasg.dungeonmod.item.ModItems;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.network.chat.Component;
import javax.annotation.Nullable;
import java.awt.*;
import java.util.List;
import java.util.function.Supplier;

import static com.endienasg.dungeonmod.DungeonMod.MODID;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DungeonMod.MODID);

    public static final RegistryObject<Block> EXAMPLE_BLOCK = register("example_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).friction(0.5f).strength(1f, 5f).requiresCorrectToolForDrops()),
            new Item.Properties().tab(DungeonMod.TAB));

    public static final RegistryObject<Block> EXAMPLE2_BLOCK = register("example2_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).strength(2.5f, 18f).requiresCorrectToolForDrops()),
            new Item.Properties().tab(DungeonMod.TAB));

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}
