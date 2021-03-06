package com.brand.blockus;

import com.brand.blockus.content.BlockusBlocks;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Items;
import net.minecraft.item.ShovelItem;

import java.util.HashMap;

public class Instance {

    public static void init() {


// Flammable

        // general		
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WOODEN_FRAME, 30, 60);

        // small hedges
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.OAK_SMALL_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.ACACIA_SMALL_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BIRCH_SMALL_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.DARK_OAK_SMALL_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.JUNGLE_SMALL_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.SPRUCE_SMALL_HEDGE, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_SMALL_HEDGE, 30, 60);

        // paper
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.PAPER_WALL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.PAPER_DOOR, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.PAPER_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BURNED_PAPER_BLOCK, 5, 60);

        // timber frames
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.ACACIA_CROSS_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.ACACIA_DIAGONAL_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.ACACIA_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BAMBOO_CROSS_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BAMBOO_DIAGONAL_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BAMBOO_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BIRCH_CROSS_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BIRCH_DIAGONAL_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BIRCH_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.DARK_OAK_CROSS_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.DARK_OAK_DIAGONAL_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.DARK_OAK_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.JUNGLE_CROSS_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.JUNGLE_DIAGONAL_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.JUNGLE_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.OAK_CROSS_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.OAK_DIAGONAL_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.OAK_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.SPRUCE_CROSS_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.SPRUCE_DIAGONAL_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.SPRUCE_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_CROSS_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_DIAGONAL_TIMBER_FRAME, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_TIMBER_FRAME, 5, 20);


        // patterned wools
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.ORANGE_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.MAGENTA_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.LIGHT_BLUE_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.YELLOW_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.LIME_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.PINK_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.GRAY_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.LIGHT_GRAY_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.CYAN_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.PURPLE_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BLUE_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BROWN_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.GREEN_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.RED_PATTERNED_WOOL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BLACK_PATTERNED_WOOL, 30, 60);

        // bamboo
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BAMBOO_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BAMBOO_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BAMBOO_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BAMBOO_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BAMBOO_FENCE_GATE, 5, 20);

        // white oak
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.STRIPPED_WHITE_OAK_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.STRIPPED_WHITE_OAK_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_LEAVES, 30, 60);

        // small logs		
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.OAK_SMALL_LOGS, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.BIRCH_SMALL_LOGS, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.SPRUCE_SMALL_LOGS, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.JUNGLE_SMALL_LOGS, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.ACACIA_SMALL_LOGS, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.DARK_OAK_SMALL_LOGS, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(BlockusBlocks.WHITE_OAK_SMALL_LOGS, 5, 5);


// Fuel
        // general
        FuelRegistry.INSTANCE.add(Items.DRIED_KELP, 200);
        FuelRegistry.INSTANCE.add(Blocks.SUGAR_CANE, 50);

        // small hedges
        FuelRegistry.INSTANCE.add(BlockusBlocks.OAK_SMALL_HEDGE, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.ACACIA_SMALL_HEDGE, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BIRCH_SMALL_HEDGE, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.DARK_OAK_SMALL_HEDGE, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.JUNGLE_SMALL_HEDGE, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.SPRUCE_SMALL_HEDGE, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_SMALL_HEDGE, 100);

        // paper
        FuelRegistry.INSTANCE.add(Items.PAPER, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.PAPER_WALL, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.PAPER_BLOCK, 500);

        // timber frames
        FuelRegistry.INSTANCE.add(BlockusBlocks.ACACIA_CROSS_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.ACACIA_DIAGONAL_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.ACACIA_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BAMBOO_CROSS_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BAMBOO_DIAGONAL_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BAMBOO_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BIRCH_CROSS_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BIRCH_DIAGONAL_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BIRCH_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.DARK_OAK_CROSS_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.DARK_OAK_DIAGONAL_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.DARK_OAK_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.JUNGLE_CROSS_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.JUNGLE_DIAGONAL_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.JUNGLE_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.OAK_CROSS_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.OAK_DIAGONAL_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.OAK_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.SPRUCE_CROSS_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.SPRUCE_DIAGONAL_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.SPRUCE_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_CROSS_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_DIAGONAL_TIMBER_FRAME, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_TIMBER_FRAME, 300);


        // patterned wools
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_PATTERNED_WOOL, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.ORANGE_PATTERNED_WOOL, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.MAGENTA_PATTERNED_WOOL, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.LIGHT_BLUE_PATTERNED_WOOL, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.YELLOW_PATTERNED_WOOL, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.LIME_PATTERNED_WOOL, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.PINK_PATTERNED_WOOL, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.GRAY_PATTERNED_WOOL, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.LIGHT_GRAY_PATTERNED_WOOL, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.CYAN_PATTERNED_WOOL, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.PURPLE_PATTERNED_WOOL, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BLUE_PATTERNED_WOOL, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BROWN_PATTERNED_WOOL, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.GREEN_PATTERNED_WOOL, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.RED_PATTERNED_WOOL, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BLACK_PATTERNED_WOOL, 100);

        // bamboo
        FuelRegistry.INSTANCE.add(BlockusBlocks.BAMBOO_PLANKS, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BAMBOO_SLAB, 150);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BAMBOO_STAIRS, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BAMBOO_FENCE, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BAMBOO_FENCE_GATE, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BAMBOO_DOOR, 200);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BAMBOO_TRAPDOOR, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BAMBOO_PRESSURE_PLATE, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BAMBOO_BUTTON, 100);

        // white oak
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_LOG, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.STRIPPED_WHITE_OAK_LOG, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_WOOD, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.STRIPPED_WHITE_OAK_LOG, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_PLANKS, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_SLAB, 150);
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_STAIRS, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_FENCE, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_FENCE_GATE, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_DOOR, 200);
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_TRAPDOOR, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_PRESSURE_PLATE, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_BUTTON, 100);
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_LEAVES, 100);

        // small logs
        FuelRegistry.INSTANCE.add(BlockusBlocks.OAK_SMALL_LOGS, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.BIRCH_SMALL_LOGS, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.SPRUCE_SMALL_LOGS, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.JUNGLE_SMALL_LOGS, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.ACACIA_SMALL_LOGS, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.DARK_OAK_SMALL_LOGS, 300);
        FuelRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_SMALL_LOGS, 300);

// Composting

        CompostingChanceRegistry.INSTANCE.add(Items.ROTTEN_FLESH, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.ROTTEN_FLESH_BLOCK, 0.85f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.OAK_SMALL_HEDGE, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.ACACIA_SMALL_HEDGE, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.BIRCH_SMALL_HEDGE, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.DARK_OAK_SMALL_HEDGE, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.JUNGLE_SMALL_HEDGE, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.SPRUCE_SMALL_HEDGE, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_SMALL_HEDGE, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_LEAVES, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.WHITE_OAK_SAPLING, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(Items.BAMBOO, 0.5f);
        CompostingChanceRegistry.INSTANCE.add(Items.GRASS_BLOCK, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(Items.PODZOL, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(Items.MYCELIUM, 0.3f);
        CompostingChanceRegistry.INSTANCE.add(Items.DIRT, 0.15f);
        CompostingChanceRegistry.INSTANCE.add(Items.COARSE_DIRT, 0.15f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.THATCH, 0.75f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.THATCH_STAIRS, 0.75f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.THATCH_SLAB, 0.65f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.APPLE_CRATE, 0.95f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.BEETROOT_CRATE, 0.95f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.BREAD_BOX, 1.0f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.CARROT_CRATE, 0.95f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.COOKIE_BLOCK, 1.0f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.POTATO_CRATE, 0.95f);
        CompostingChanceRegistry.INSTANCE.add(BlockusBlocks.SWEET_BERRIES_CRATE, 0.50f);

// Instance

        addStrippables();
        addPathBlocks();
    }


    public static void addStrippables() {
        AxeItem.STRIPPED_BLOCKS = new HashMap<>(AxeItem.STRIPPED_BLOCKS);
        AxeItem.STRIPPED_BLOCKS.put(BlockusBlocks.WHITE_OAK_LOG, BlockusBlocks.STRIPPED_WHITE_OAK_LOG);
        AxeItem.STRIPPED_BLOCKS.put(BlockusBlocks.WHITE_OAK_WOOD, BlockusBlocks.STRIPPED_WHITE_OAK_WOOD);
    }

    public static void addPathBlocks() {
        ShovelItem.PATH_STATES = new HashMap<>(ShovelItem.PATH_STATES);
        ShovelItem.PATH_STATES.put(Blocks.DIRT, BlockusBlocks.PATH.getDefaultState());
        ShovelItem.PATH_STATES.put(Blocks.COARSE_DIRT, BlockusBlocks.PATH.getDefaultState());
        ShovelItem.PATH_STATES.put(Blocks.GRASS_PATH, BlockusBlocks.PATH.getDefaultState());
    }
}
