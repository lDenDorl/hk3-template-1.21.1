package com.hk3.item;

import com.hk3.Hk3;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STONE_SPEEDS = registerItem("stone_speeds", new Item(new Item.Settings()));
    public static final Item RAW_STONE_SPEEDS = registerItem("raw_stone_speeds",new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Hk3.MOD_ID, name), item);
    }


    public static void registerModItems(){
        Hk3.LOGGER.info("Реєстрація Мод Предмету для " + Hk3.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STONE_SPEEDS);
            fabricItemGroupEntries.add(RAW_STONE_SPEEDS);
        });
    }
}
