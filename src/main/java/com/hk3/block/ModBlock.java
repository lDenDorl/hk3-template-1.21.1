package com.hk3.block;

import com.hk3.Hk3;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlock {

    public static final Block STONE_SPEEDS_BLOCK = registerBlock("stone_speeds_block",
            new Block(AbstractBlock.Settings.create().strength(2f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block RAW_STONE_SPEEDS_BLOCK = registerBlock("raw_stone_speeds_block",
            new Block(AbstractBlock.Settings.create().strength(1f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Hk3.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Hk3.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }
    public static void registerModBlock(){
        Hk3.LOGGER.info("Реєстрація Мод Блока для " + Hk3.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlock.STONE_SPEEDS_BLOCK);
            fabricItemGroupEntries.add(ModBlock.RAW_STONE_SPEEDS_BLOCK);
        });
    }
}
