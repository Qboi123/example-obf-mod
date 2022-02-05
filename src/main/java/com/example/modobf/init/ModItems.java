package com.example.modobf.init;

import com.example.modobf.registration.Registration;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public final class ModItems {
    private ModItems() {
        throw new UnsupportedOperationException("Initiation of utility class.");
    }

    public static final RegistryObject<Item> EXPLODING_ITEM = register("exploding_item", () -> new Item(new Item.Properties().stacksTo(8)));

    private static <T extends Item> RegistryObject<T> register(String name, Supplier<T> supplier) {
        return Registration.ITEMS.register(name, supplier);
    }
}
