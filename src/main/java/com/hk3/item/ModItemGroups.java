package com.hk3.item;

import com.hk3.Hk3;
import com.hk3.block.ModBlock;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.core.appender.rolling.action.PathSortByModificationTime;

public class ModItemGroups {
    public static final ItemGroup STONE_SPEEDS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Hk3.MOD_ID, "stone_speeds_items"),
            FabricItemGroup.builder().icon(()->new ItemStack(ModItems.STONE_SPEEDS))
                    .displayName(Text.translatable("itemgroup.hk3.stone_speeds_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.STONE_SPEEDS);
                        entries.add(ModItems.RAW_STONE_SPEEDS);
                    }).build());

    public static final ItemGroup STONE_SPEEDS_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Hk3.MOD_ID, "stone_speeds_blocks"),
            FabricItemGroup.builder().icon(()->new ItemStack(ModBlock.STONE_SPEEDS_BLOCK))
                    .displayName(Text.translatable("itemgroup.hk3.stone_speeds_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlock.STONE_SPEEDS_BLOCK);
                        entries.add(ModBlock.RAW_STONE_SPEEDS_BLOCK);
                    }).build());




    public static void registerItemGroups(){
        Hk3.LOGGER.info("Реєстрація Предмет Групи для" + Hk3.MOD_ID);
    }
}
