package com.hk3;

import com.hk3.block.ModBlock;
import com.hk3.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//Тест
public class Hk3 implements ModInitializer {
    public static final String MOD_ID = "hk3";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlock.registerModBlock();
    }
}