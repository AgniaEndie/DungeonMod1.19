package com.endienasg.dungeonmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.endienasg.dungeonmod.DungeonMod.MODID;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE = DeferredRegister.create(ForgeRegistries.ENTITIES, MODID);

    public static void register(IEventBus iEventBus){
        ENTITY_TYPE.register(iEventBus);
    }
}
