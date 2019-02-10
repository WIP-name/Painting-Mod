package arthurbambou.paintingmod.mainmod.registery;

import arthurbambou.paintingmod.mainmod.api.*;
import arthurbambou.paintingmod.mainmod.blocks.SoggyClay;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.sound.BlockSoundGroup;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<ColoredObject> COLORED_BLOCKS = new ArrayList<ColoredObject>();

    public static Block SOGGY_CLAY;

    public static ColoredBlock STONE;
    public static ColoredBlock GRANITE;
    public static ColoredBlock POLISHED_GRANITE;
    public static ColoredBlock DIORITE;
    public static ColoredBlock POLISHED_DIORITE;
    public static ColoredBlock ANDESITE;
    public static ColoredBlock POLISHED_ANDESITE;
    public static ColoredBlock DIRT;
    public static ColoredBlock COARSE_DIRT;
    public static ColoredBlock COBBLESTONE;
    public static ColoredBlock OAK_PLANK;
    public static ColoredBlock SPRUCE_PLANK;
    public static ColoredBlock BIRCH_PLANK;
    public static ColoredBlock JUNGLE_PLANK;
    public static ColoredBlock ACACIA_PLANK;
    public static ColoredBlock DARK_OAK_PLANK;
    public static ColoredBlock SAND;
    public static ColoredBlock RED_SAND;
    public static ColoredBlock GRAVEL;
    public static ColoredBlock STRIPPED_OAK_WOOD;
    public static ColoredBlock STRIPPED_SPRUCE_WOOD;
    public static ColoredBlock STRIPPED_BIRCH_WOOD;
    public static ColoredBlock STRIPPED_JUNGLE_WOOD;
    public static ColoredBlock STRIPPED_ACACIA_WOOD;
    public static ColoredBlock STRIPPED_DARK_OAK_WOOD;
    public static ColoredBlock OAK_WOOD;
    public static ColoredBlock SPRUCE_WOOD;
    public static ColoredBlock BIRCH_WOOD;
    public static ColoredBlock JUNGLE_WOOD;
    public static ColoredBlock ACACIA_WOOD;
    public static ColoredBlock DARK_OAK_WOOD;
    public static ColoredBlock SPONGE;
    public static ColoredBlock WET_SPONGE;
    public static ColoredBlock LAPIS_LAZULI_BLOCK;
    public static ColoredBlock SANDSTONE;
    public static ColoredBlock RED_SANDSTONE;
    public static ColoredBlock GOLD_BLOCK;
    public static ColoredBlock IRON_BLOCK;
    public static ColoredBlock SMOOTH_QUARTZ;
    public static ColoredBlock SMOOTH_RED_SANDSTONE;
    public static ColoredBlock SMOOTH_SANDSTONE;
    public static ColoredBlock SMOOTH_STONE;
    public static ColoredBlock BRICK;
    public static ColoredBlock MOSS_STONE;
    public static ColoredBlock OBSIDIAN;
    public static ColoredBlock DIAMOND_BLOCK;
    public static ColoredBlock ICE;
    public static ColoredBlock SNOW_BLOCK;
    public static ColoredBlock CLAY_BLOCK;
    public static ColoredBlock NETHERRACK;
    public static ColoredBlock SOUL_SAND;
    public static ColoredBlock GLOWSTONE;
    public static ColoredBlock STONE_BRICK;
    public static ColoredBlock CRACKED_STONE_BRICK;
    public static ColoredBlock MOSSY_STONE_BRICK;
    public static ColoredBlock CHISELED_STONE_BRICK;
    public static ColoredBlock NETHER_BRICK;
    public static ColoredBlock END_STONE;
    public static ColoredBlock EMERALD_BLOCK;
    public static ColoredBlock QUARTZ_BLOCK;
    public static ColoredBlock PRISMARINE;
    public static ColoredBlock PRISMARINE_BRICK;
    public static ColoredBlock DARK_PRISMARINE;
    public static ColoredBlock SEA_LANTERN;
    public static ColoredBlock COAL_BLOCK;
    public static ColoredBlock PACKET_ICE;
    public static ColoredBlock PURPUR_BLOCK;
    public static ColoredBlock END_STONE_BRICK;
    public static ColoredBlock MAGMA_BLOCK;
    public static ColoredBlock NETHER_WART_BLOCK;
    public static ColoredBlock RED_NETHER_BRICK;
    public static ColoredBlock OAK_LEAVES;
    public static ColoredBlock SPRUCE_LEAVES;
    public static ColoredBlock BIRCH_LEAVES;
    public static ColoredBlock JUNGLE_LEAVES;
    public static ColoredBlock ACACIA_LEAVES;
    public static ColoredBlock DARK_OAK_LEAVES;
    public static ColoredBlock SLIME_BLOCK;
    public static ColoredBlock DEAD_TUBE_CORAL_BLOCK;
    public static ColoredBlock DEAD_BRAIN_CORAL_BLOCK;
    public static ColoredBlock DEAD_BUBBLE_CORAL_BLOCK;
    public static ColoredBlock DEAD_FIRE_CORAL_BLOCK;
    public static ColoredBlock DEAD_HORN_CORAL_BLOCK;

    public static ColoredStairs PURPUR_STAIRS;
    public static ColoredStairs OAK_PLANKS_STAIRS;
    public static ColoredStairs COBBLESTONE_STAIRS;
    public static ColoredStairs BRICK_STAIRS;
    public static ColoredStairs STONE_BRICK_STAIRS;
    public static ColoredStairs NETHER_BRICK_STAIRS;
    public static ColoredStairs SANDSTONE_STAIRS;
    public static ColoredStairs SPRUCE_PLANKS_STAIRS;
    public static ColoredStairs BIRCH_PLANKS_STAIRS;
    public static ColoredStairs JUNGLE_PLANKS_STAIRS;
    public static ColoredStairs QUARTZ_STAIRS;
    public static ColoredStairs ACACIA_PLANKS_STAIRS;
    public static ColoredStairs DARK_OAK_PLANKS_STAIRS;
    public static ColoredStairs PRISMARINE_STAIRS;
    public static ColoredStairs PRISMARINE_BRICK_STAIRS;
    public static ColoredStairs DARK_PRISMARINE_STAIRS;
    public static ColoredStairs RED_SANDSTONE_STAIRS;
    public static ColoredStairs POLISHED_GRANITE_STAIRS;
    public static ColoredStairs SMOOTH_RED_SANDSTONE_STAIRS;
    public static ColoredStairs MOSSY_STONE_BRICK_STAIRS;
    public static ColoredStairs POLISHED_DIORITE_STAIRS;
    public static ColoredStairs MOSSY_COBBLESTONE_STAIRS;
    public static ColoredStairs END_STONE_BRICK_STAIRS;
    public static ColoredStairs STONE_STAIRS;
    public static ColoredStairs SMOOTH_SANDSTONE_STAIRS;
    public static ColoredStairs SMOOTH_QUARTZ_STAIRS;
    public static ColoredStairs GRANITE_STAIRS;
    public static ColoredStairs ANDESITE_STAIRS;
    public static ColoredStairs RED_NETHER_BRICK_STAIRS;
    public static ColoredStairs POLISHED_ANDESITE_STAIRS;
    public static ColoredStairs DIORITE_STAIRS;

    public static ColoredSlab OAK_PLANK_SLAB;
    public static ColoredSlab SPRUCE_PLANK_SLAB;
    public static ColoredSlab BIRCH_PLANK_SLAB;
    public static ColoredSlab JUNGLE_PLANK_SLAB;
    public static ColoredSlab ACACIA_PLANK_SLAB;
    public static ColoredSlab DARK_OAK_PLANK_SLAB;
    public static ColoredSlab STONE_SLAB;
    public static ColoredSlab SMOOTH_STONE_SLAB;
    public static ColoredSlab SANDSTONE_SLAB;
    public static ColoredSlab PETRIFIED_OAK_PLANK_SLAB;
    public static ColoredSlab COBBLESTONE_SLAB;
    public static ColoredSlab BRICK_SLAB;
    public static ColoredSlab STONE_BRICK_SLAB;
    public static ColoredSlab NETHER_BRICK_SLAB;
    public static ColoredSlab QUARTZ_SLAB;
    public static ColoredSlab RED_SANDSTONE_SLAB;
    public static ColoredSlab PURPUR_SLAB;
    public static ColoredSlab PRISMARINE_SLAB;
    public static ColoredSlab PRISMARINE_BRICK_SLAB;
    public static ColoredSlab DARK_PRISMARINE_SLAB;
    public static ColoredSlab POLISHED_GRANITE_SLAB;
    public static ColoredSlab SMOOTH_RED_SANDSTONE_SLAB;
    public static ColoredSlab MOSSY_STONE_BRICK_SLAB;
    public static ColoredSlab POLISHED_DIORITE_SLAB;
    public static ColoredSlab MOSSY_COBBLESTONE_SLAB;
    public static ColoredSlab END_STONE_BRICK_SLAB;
    public static ColoredSlab SMOOTH_SANDSTONE_SLAB;
    public static ColoredSlab SMOOTH_QUARTZ_SLAB;
    public static ColoredSlab GRANITE_SLAB;
    public static ColoredSlab ANDESITE_SLAB;
    public static ColoredSlab RED_NETHER_BRICK_SLAB;
    public static ColoredSlab POLISHED_ANDESITE_SLAB;
    public static ColoredSlab DIORITE_SLAB;

    public static ColoredWall COBBLESTONE_WALL;
    public static ColoredWall MOSSY_COBBLESTONE_WALL;
    public static ColoredWall BRICK_WALL;
    public static ColoredWall PRISMARINE_WALL;
    public static ColoredWall RED_SANDSTONE_WALL;
    public static ColoredWall MOSSY_STONE_BRICK_WALL;
    public static ColoredWall GRANITE_WALL;
    public static ColoredWall STONE_BRICK_WALL;
    public static ColoredWall NETHER_BRICK_WALL;
    public static ColoredWall ANDESITE_WALL;
    public static ColoredWall RED_NETHER_BRICK_WALL;
    public static ColoredWall SANDSTONE_WALL;
    public static ColoredWall END_STONE_BRICK_WALL;
    public static ColoredWall DIORITE_WALL;

    public static ColoredFenceGate OAK_PLANK_FENCE_GATE;
    public static ColoredFenceGate SPRUCE_PLANK_FENCE_GATE;
    public static ColoredFenceGate BIRCH_PLANK_FENCE_GATE;
    public static ColoredFenceGate JUNGLE_PLANK_FENCE_GATE;
    public static ColoredFenceGate ACACIA_PLANK_FENCE_GATE;
    public static ColoredFenceGate DARK_OAK_PLANK_FENCE_GATE;

    public static ColoredFence OAK_PLANK_FENCE;
    public static ColoredFence SPRUCE_PLANK_FENCE;
    public static ColoredFence BIRCH_PLANK_FENCE;
    public static ColoredFence JUNGLE_PLANK_FENCE;
    public static ColoredFence ACACIA_PLANK_FENCE;
    public static ColoredFence DARK_OAK_PLANK_FENCE;
    public static ColoredFence NETHER_BRICK_FENCE;

    public static ColoredPressurePlate STONE_PRESSURE_PLATE;
    public static ColoredPressurePlate OAK_PLANK_PRESSURE_PLATE;
    public static ColoredPressurePlate SPRUCE_PLANK_PRESSURE_PLATE;
    public static ColoredPressurePlate BIRCH_PLANK_PRESSURE_PLATE;
    public static ColoredPressurePlate JUNGLE_PLANK_PRESSURE_PLATE;
    public static ColoredPressurePlate ACACIA_PLANK_PRESSURE_PLATE;
    public static ColoredPressurePlate DARK_OAK_PLANK_PRESSURE_PLATE;
    public static ColoredWeightedPressurePlate LIGHT_WEIGHTED_PRESSURE_PLATE;
    public static ColoredWeightedPressurePlate HEAVY_WEIGHTED_PRESSURE_PLATE;

    public static ColoredStoneButton STONE_BUTTON;
    public static ColoredWoodButton OAK_PLANK_BUTTON;
    public static ColoredWoodButton SPRUCE_PLANK_BUTTON;
    public static ColoredWoodButton BIRCH_PLANK_BUTTON;
    public static ColoredWoodButton JUNGLE_PLANK_BUTTON;
    public static ColoredWoodButton ACACIA_PLANK_BUTTON;
    public static ColoredWoodButton DARK_OAK_PLANK_BUTTON;

    public static void init() {
        SOGGY_CLAY = new SoggyClay(FabricBlockSettings.of(Material.SAND).sounds(BlockSoundGroup.SAND).build(), "soggy_clay");

        STONE = new ColoredBlock("stone", Blocks.STONE);
        GRANITE = new ColoredBlock("granite", Blocks.GRANITE);
        POLISHED_GRANITE = new ColoredBlock("polished_granite", Blocks.POLISHED_GRANITE);
        DIORITE = new ColoredBlock("diorite", Blocks.DIORITE);
        POLISHED_DIORITE = new ColoredBlock("polished_diorite", Blocks.POLISHED_DIORITE);
        ANDESITE = new ColoredBlock("andesite", Blocks.ANDESITE);
        POLISHED_ANDESITE = new ColoredBlock("polished_andesite", Blocks.POLISHED_ANDESITE);
        DIRT = new ColoredBlock("dirt", Blocks.DIRT);
        COARSE_DIRT = new ColoredBlock("coarse_dirt", Blocks.COARSE_DIRT);
        COBBLESTONE = new ColoredBlock("cobblestone", Blocks.COBBLESTONE);
        OAK_PLANK = new ColoredBlock("oak_plank", Blocks.OAK_PLANKS);
        SPRUCE_PLANK = new ColoredBlock("spruce_plank", Blocks.SPRUCE_PLANKS);
        BIRCH_PLANK = new ColoredBlock("birch_plank", Blocks.BIRCH_PLANKS);
        JUNGLE_PLANK = new ColoredBlock("jungle_plank", Blocks.JUNGLE_PLANKS);
        ACACIA_PLANK = new ColoredBlock("acacia_plank", Blocks.ACACIA_PLANKS);
        DARK_OAK_PLANK = new ColoredBlock("dark_oak_plank", Blocks.DARK_OAK_PLANKS);
        SAND = new ColoredBlock("sand", Blocks.SAND);
        RED_SAND = new ColoredBlock("red_sand", Blocks.RED_SAND);
        GRAVEL = new ColoredBlock("gravel", Blocks.GRAVEL);
//        STRIPPED_OAK_WOOD = new ColoredBlock("stripped_oak_wood", Blocks.STRIPPED_OAK_WOOD);
//        STRIPPED_SPRUCE_WOOD = new ColoredBlock("stripped_spruce_wood", Blocks.STRIPPED_SPRUCE_WOOD);
//        STRIPPED_BIRCH_WOOD = new ColoredBlock("stripped_birch_wood", Blocks.STRIPPED_BIRCH_WOOD);
//        STRIPPED_JUNGLE_WOOD = new ColoredBlock("stripped_jungle_wood", Blocks.STRIPPED_JUNGLE_WOOD);
//        STRIPPED_ACACIA_WOOD = new ColoredBlock("stripped_acacia_wood", Blocks.STRIPPED_ACACIA_WOOD);
//        STRIPPED_DARK_OAK_WOOD = new ColoredBlock("stripped_dark_oak_wood", Blocks.STRIPPED_DARK_OAK_WOOD);
//        OAK_WOOD = new ColoredBlock("oak_wood", Blocks.OAK_WOOD);
//        SPRUCE_WOOD = new ColoredBlock("spruce_wood", Blocks.SPRUCE_WOOD);
//        BIRCH_WOOD = new ColoredBlock("birch_wood", Blocks.BIRCH_WOOD);
//        JUNGLE_WOOD = new ColoredBlock("jungle_wood", Blocks.JUNGLE_WOOD);
//        ACACIA_WOOD = new ColoredBlock("acacia_wood", Blocks.ACACIA_WOOD);
//        DARK_OAK_WOOD = new ColoredBlock("dark_oak_wood", Blocks.DARK_OAK_WOOD);
        SPONGE = new ColoredBlock("sponge", Blocks.SPONGE);
        WET_SPONGE = new ColoredBlock("wet_sponge", Blocks.SPONGE);
        LAPIS_LAZULI_BLOCK = new ColoredBlock("lapis_lazuli_block", Blocks.LAPIS_BLOCK);
//        SANDSTONE = new ColoredBlock("sandstone", Blocks.SANDSTONE);
//        RED_SANDSTONE = new ColoredBlock("red_sandstone", Blocks.RED_SANDSTONE);
        GOLD_BLOCK = new ColoredBlock("gold_block", Blocks.GOLD_BLOCK);
        IRON_BLOCK = new ColoredBlock("iron_block", Blocks.IRON_BLOCK);
//        SMOOTH_QUARTZ = new ColoredBlock("smooth_quartz", Blocks.SMOOTH_QUARTZ);
//        SMOOTH_RED_SANDSTONE = new ColoredBlock("smooth_red_sandstone", Blocks.SMOOTH_RED_SANDSTONE);
//        SMOOTH_SANDSTONE = new ColoredBlock("smooth_sandstone", Blocks.SMOOTH_SANDSTONE);
//        SMOOTH_STONE = new ColoredBlock("smooth_stone", Blocks.SMOOTH_STONE);
        BRICK = new ColoredBlock("brick", Blocks.BRICKS);
        MOSS_STONE = new ColoredBlock("moss_stone", Blocks.MOSSY_COBBLESTONE);
        OBSIDIAN = new ColoredBlock("obsidian", Blocks.OBSIDIAN);
        DIAMOND_BLOCK = new ColoredBlock("diamond_block", Blocks.DIAMOND_BLOCK);
        ICE = new ColoredBlock("ice", Blocks.ICE);
        SNOW_BLOCK = new ColoredBlock("snow_block", Blocks.SNOW_BLOCK);
        CLAY_BLOCK = new ColoredBlock("clay_block", Blocks.CLAY);
        NETHERRACK = new ColoredBlock("netherrack", Blocks.NETHERRACK);
        SOUL_SAND = new ColoredBlock("soul_sand", Blocks.SOUL_SAND);
        GLOWSTONE = new ColoredBlock("glowstone", Blocks.GLOWSTONE);
        STONE_BRICK = new ColoredBlock("stone_brick", Blocks.STONE_BRICKS);
        CRACKED_STONE_BRICK = new ColoredBlock("cracked_stone_brick", Blocks.CRACKED_STONE_BRICKS);
        MOSSY_STONE_BRICK = new ColoredBlock("mossy_stone_brick", Blocks.MOSSY_STONE_BRICKS);
        CHISELED_STONE_BRICK = new ColoredBlock("chiseled_stone_brick", Blocks.CHISELED_STONE_BRICKS);
        NETHER_BRICK = new ColoredBlock("nether_brick", Blocks.NETHER_BRICKS);
        END_STONE = new ColoredBlock("end_stone", Blocks.END_STONE);
        EMERALD_BLOCK = new ColoredBlock("emerald_block", Blocks.EMERALD_BLOCK);
//        QUARTZ_BLOCK = new ColoredBlock("quartz_block", Blocks.QUARTZ_BLOCK);
        PRISMARINE = new ColoredBlock("prismarine", Blocks.PRISMARINE);
        PRISMARINE_BRICK = new ColoredBlock("prismarine_brick", Blocks.PRISMARINE_BRICKS);
        DARK_PRISMARINE = new ColoredBlock("dark_prismarine", Blocks.DARK_PRISMARINE);
        SEA_LANTERN = new ColoredBlock("sea_lantern", Blocks.SEA_LANTERN);
        COAL_BLOCK = new ColoredBlock("coal_block", Blocks.COAL_BLOCK);
        PACKET_ICE = new ColoredBlock("packet_ice", Blocks.PACKED_ICE);
        PURPUR_BLOCK = new ColoredBlock("purpur_block", Blocks.PURPUR_BLOCK);
        END_STONE_BRICK = new ColoredBlock("end_stone_brick", Blocks.END_STONE_BRICKS);
        MAGMA_BLOCK = new ColoredBlock("magma_block", Blocks.MAGMA_BLOCK);
        NETHER_WART_BLOCK = new ColoredBlock("nether_wart_block", Blocks.NETHER_WART_BLOCK);
        RED_NETHER_BRICK = new ColoredBlock("red_nether_brick", Blocks.RED_NETHER_BRICKS);
//        OAK_LEAVES = new ColoredBlock("oak_leaves", Blocks.OAK_LEAVES);
        SPRUCE_LEAVES = new ColoredBlock("spruce_leaves", Blocks.SPRUCE_LEAVES);
//        BIRCH_LEAVES = new ColoredBlock("birch_leaves", Blocks.BIRCH_LEAVES);
        JUNGLE_LEAVES = new ColoredBlock("jungle_leaves", Blocks.JUNGLE_LEAVES);
//        ACACIA_LEAVES = new ColoredBlock("acacia_leaves", Blocks.ACACIA_LEAVES);
//        DARK_OAK_LEAVES = new ColoredBlock("dark_oak_leaves", Blocks.DARK_OAK_LEAVES);
        SLIME_BLOCK = new ColoredBlock("slime_block", Blocks.SLIME_BLOCK);
//        DEAD_TUBE_CORAL_BLOCK = new ColoredBlock("dead_tube_coral_block", Blocks.DEAD_TUBE_CORAL_BLOCK);
//        DEAD_BRAIN_CORAL_BLOCK = new ColoredBlock("dead_brain_coral_block", Blocks.DEAD_BRAIN_CORAL_BLOCK);
//        DEAD_BUBBLE_CORAL_BLOCK = new ColoredBlock("dead_bubble_coral_block", Blocks.DEAD_BUBBLE_CORAL_BLOCK);
//        DEAD_FIRE_CORAL_BLOCK = new ColoredBlock("dead_fire_coral_block", Blocks.DEAD_FIRE_CORAL_BLOCK);
//        DEAD_HORN_CORAL_BLOCK = new ColoredBlock("dead_horn_coral_block", Blocks.DEAD_HORN_CORAL_BLOCK);


        PURPUR_STAIRS = new ColoredStairs("purpur_stairs", Blocks.PURPUR_STAIRS);
        OAK_PLANKS_STAIRS = new ColoredStairs("oak_plank_stairs", Blocks.OAK_STAIRS);
        COBBLESTONE_STAIRS = new ColoredStairs("cobblestone_stairs", Blocks.COBBLESTONE_STAIRS);
        BRICK_STAIRS = new ColoredStairs("brick_stairs", Blocks.BRICK_STAIRS);
        STONE_BRICK_STAIRS = new ColoredStairs("stone_brick_stairs", Blocks.STONE_BRICK_STAIRS);
        NETHER_BRICK_STAIRS = new ColoredStairs("nether_brick_stairs", Blocks.NETHER_BRICK_STAIRS);
//        SANDSTONE_STAIRS = new ColoredStairs("sandstone_stairs", Blocks.SANDSTONE_STAIRS);
        SPRUCE_PLANKS_STAIRS = new ColoredStairs("spruce_plank_stairs", Blocks.SPRUCE_STAIRS);
        BIRCH_PLANKS_STAIRS = new ColoredStairs("birch_plank_stairs", Blocks.BIRCH_STAIRS);
        JUNGLE_PLANKS_STAIRS = new ColoredStairs("jungle_plank_stairs", Blocks.JUNGLE_STAIRS);
//        QUARTZ_STAIRS = new ColoredStairs("quartz_stairs", Blocks.QUARTZ_STAIRS);
        ACACIA_PLANKS_STAIRS = new ColoredStairs("acacia_plank_stairs", Blocks.ACACIA_STAIRS);
        DARK_OAK_PLANKS_STAIRS = new ColoredStairs("dark_oak_plank_stairs", Blocks.DARK_OAK_STAIRS);
        PRISMARINE_STAIRS = new ColoredStairs("prismarine_stairs", Blocks.PRISMARINE_STAIRS);
        PRISMARINE_BRICK_STAIRS = new ColoredStairs("prismarine_brick_stairs", Blocks.PRISMARINE_BRICK_STAIRS);
        DARK_PRISMARINE_STAIRS = new ColoredStairs("dark_prismarine_stairs", Blocks.DARK_PRISMARINE_STAIRS);
//        RED_SANDSTONE_STAIRS = new ColoredStairs("red_sandstone_stairs", Blocks.RED_SANDSTONE_STAIRS);
        POLISHED_GRANITE_STAIRS = new ColoredStairs("polished_granite_stairs", Blocks.POLISHED_GRANITE_STAIRS);
//        SMOOTH_RED_SANDSTONE_STAIRS = new ColoredStairs("smooth_red_sandstone_stairs", Blocks.SMOOTH_RED_SANDSTONE_STAIRS);
        MOSSY_STONE_BRICK_STAIRS = new ColoredStairs("mossy_stone_brick_stairs", Blocks.MOSSY_STONE_BRICK_STAIRS);
        POLISHED_DIORITE_STAIRS = new ColoredStairs("polished_diorite_stairs", Blocks.POLISHED_DIORITE_STAIRS);
        MOSSY_COBBLESTONE_STAIRS = new ColoredStairs("mossy_cobblestone_stairs", Blocks.MOSSY_COBBLESTONE_STAIRS);
        END_STONE_BRICK_STAIRS = new ColoredStairs("end_stone_brick_stairs", Blocks.END_STONE_BRICK_STAIRS);
        STONE_STAIRS = new ColoredStairs("stone_stairs", Blocks.STONE_STAIRS);
//        SMOOTH_SANDSTONE_STAIRS = new ColoredStairs("smooth_sandstone_stairs", Blocks.SMOOTH_SANDSTONE_STAIRS);
//        SMOOTH_QUARTZ_STAIRS = new ColoredStairs("smooth_quartz_stairs", Blocks.SMOOTH_QUARTZ_STAIRS);
        GRANITE_STAIRS = new ColoredStairs("granite_stairs", Blocks.GRANITE_STAIRS);
        ANDESITE_STAIRS = new ColoredStairs("andesite_stairs", Blocks.ANDESITE_STAIRS);
        RED_NETHER_BRICK_STAIRS = new ColoredStairs("red_nether_brick_stairs", Blocks.RED_NETHER_BRICK_STAIRS);
        POLISHED_ANDESITE_STAIRS = new ColoredStairs("polished_andesite_stairs", Blocks.POLISHED_ANDESITE_STAIRS);
        DIORITE_STAIRS = new ColoredStairs("diorite_stairs", Blocks.DIORITE_STAIRS);

        OAK_PLANK_SLAB = new ColoredSlab("oak_plank_slab", Blocks.OAK_SLAB);
        SPRUCE_PLANK_SLAB = new ColoredSlab("spruce_plank_slab", Blocks.SPRUCE_SLAB);
        BIRCH_PLANK_SLAB = new ColoredSlab("birch_plank_slab", Blocks.BIRCH_SLAB);
        JUNGLE_PLANK_SLAB = new ColoredSlab("jungle_plank_slab", Blocks.JUNGLE_SLAB);
        ACACIA_PLANK_SLAB = new ColoredSlab("acacia_plank_slab", Blocks.ACACIA_SLAB);
        DARK_OAK_PLANK_SLAB = new ColoredSlab("dark_oak_plank_slab", Blocks.DARK_OAK_SLAB);
        STONE_SLAB = new ColoredSlab("stone_slab", Blocks.STONE_SLAB);
//        SMOOTH_STONE_SLAB = new ColoredSlab("smooth_stone_slab", Blocks.SMOOTH_STONE_SLAB);
//        SANDSTONE_SLAB = new ColoredSlab("sandstone_slab", Blocks.STONE_SLAB);
//        PETRIFIED_OAK_PLANK_SLAB = new ColoredSlab("petrified_oak_plank_slab", Blocks.STONE_SLAB);
        COBBLESTONE_SLAB = new ColoredSlab("cobblestone_slab", Blocks.COBBLESTONE_SLAB);
        BRICK_SLAB = new ColoredSlab("brick_slab", Blocks.BRICK_SLAB);
        STONE_BRICK_SLAB = new ColoredSlab("stone_brick_slab", Blocks.STONE_BRICK_SLAB);
        NETHER_BRICK_SLAB = new ColoredSlab("nether_brick_slab", Blocks.NETHER_BRICK_SLAB);
//        QUARTZ_SLAB = new ColoredSlab("quartz_slab", Blocks.STONE_SLAB);
//        RED_SANDSTONE_SLAB = new ColoredSlab("red_sandstone_slab", Blocks.STONE_SLAB);
        PURPUR_SLAB = new ColoredSlab("purpur_slab", Blocks.PURPUR_SLAB);
        PRISMARINE_SLAB = new ColoredSlab("prismarine_slab", Blocks.PRISMARINE_SLAB);
        PRISMARINE_BRICK_SLAB = new ColoredSlab("prismarine_brick_slab", Blocks.PRISMARINE_BRICK_SLAB);
        DARK_PRISMARINE_SLAB = new ColoredSlab("dark_prismarine_slab", Blocks.DARK_PRISMARINE_SLAB);
        POLISHED_GRANITE_SLAB = new ColoredSlab("polished_granite_slab", Blocks.POLISHED_GRANITE_SLAB);
//        SMOOTH_RED_SANDSTONE_SLAB = new ColoredSlab("smooth_red_sandstone_slab", Blocks.STONE_SLAB);
        MOSSY_STONE_BRICK_SLAB = new ColoredSlab("mossy_stone_brick_slab", Blocks.MOSSY_STONE_BRICK_SLAB);
        POLISHED_DIORITE_SLAB = new ColoredSlab("polished_diorite_slab", Blocks.POLISHED_DIORITE_SLAB);
        MOSSY_COBBLESTONE_SLAB = new ColoredSlab("mossy_cobblestone_slab", Blocks.MOSSY_COBBLESTONE_SLAB);
        END_STONE_BRICK_SLAB = new ColoredSlab("end_stone_brick_slab", Blocks.END_STONE_BRICK_SLAB);
//        SMOOTH_SANDSTONE_SLAB = new ColoredSlab("smooth_sandstone_slab", Blocks.STONE_SLAB);
//        SMOOTH_QUARTZ_SLAB = new ColoredSlab("smooth_quartz_slab", Blocks.STONE_SLAB);
        GRANITE_SLAB = new ColoredSlab("granite_slab", Blocks.GRANITE_SLAB);
        ANDESITE_SLAB = new ColoredSlab("andesite_slab", Blocks.ANDESITE_SLAB);
        RED_NETHER_BRICK_SLAB = new ColoredSlab("red_nether_brick_slab", Blocks.RED_NETHER_BRICK_SLAB);
        POLISHED_ANDESITE_SLAB = new ColoredSlab("polished_andesite_slab", Blocks.POLISHED_ANDESITE_SLAB);
        DIORITE_SLAB = new ColoredSlab("diorite_slab", Blocks.DIORITE_SLAB);

        COBBLESTONE_WALL = new ColoredWall("cobblestone_wall", Blocks.COBBLESTONE_WALL);
        MOSSY_COBBLESTONE_WALL = new ColoredWall("mossy_cobblestone_wall", Blocks.MOSSY_COBBLESTONE_WALL);
        BRICK_WALL = new ColoredWall("brick_wall", Blocks.BRICK_WALL);
        PRISMARINE_WALL = new ColoredWall("prismarine_wall", Blocks.PRISMARINE_WALL);
//        RED_SANDSTONE_WALL = new ColoredWall("red_sandstone_wall", Blocks.RED_SANDSTONE_WALL);
        MOSSY_STONE_BRICK_WALL = new ColoredWall("mossy_stone_brick_wall", Blocks.MOSSY_STONE_BRICK_WALL);
        GRANITE_WALL = new ColoredWall("granite_wall", Blocks.GRANITE_WALL);
        STONE_BRICK_WALL = new ColoredWall("stone_brick_wall", Blocks.STONE_BRICK_WALL);
        NETHER_BRICK_WALL = new ColoredWall("nether_brick_wall", Blocks.NETHER_BRICK_WALL);
        ANDESITE_WALL = new ColoredWall("andesite_wall", Blocks.ANDESITE_WALL);
        RED_NETHER_BRICK_WALL = new ColoredWall("red_nether_brick_wall", Blocks.RED_NETHER_BRICK_WALL);
//        SANDSTONE_WALL = new ColoredWall("sandstone_wall", Blocks.SANDSTONE_WALL);
        END_STONE_BRICK_WALL = new ColoredWall("end_stone_brick_wall", Blocks.END_STONE_BRICK_WALL);
        DIORITE_WALL = new ColoredWall("diorite_wall", Blocks.DIORITE_WALL);

        OAK_PLANK_FENCE_GATE = new ColoredFenceGate("oak_plank_fence_gate", Blocks.OAK_FENCE_GATE);
        SPRUCE_PLANK_FENCE_GATE = new ColoredFenceGate("spruce_plank_fence_gate", Blocks.SPRUCE_FENCE_GATE);
        BIRCH_PLANK_FENCE_GATE = new ColoredFenceGate("birch_plank_fence_gate", Blocks.BIRCH_FENCE_GATE);
        JUNGLE_PLANK_FENCE_GATE = new ColoredFenceGate("jungle_plank_fence_gate", Blocks.JUNGLE_FENCE_GATE);
        ACACIA_PLANK_FENCE_GATE = new ColoredFenceGate("acacia_plank_fence_gate", Blocks.ACACIA_FENCE_GATE);
        DARK_OAK_PLANK_FENCE_GATE = new ColoredFenceGate("dark_oak_plank_fence_gate", Blocks.DARK_OAK_FENCE_GATE);

        OAK_PLANK_FENCE = new ColoredFence("oak_plank_fence", Blocks.OAK_FENCE);
        SPRUCE_PLANK_FENCE = new ColoredFence("spruce_plank_fence", Blocks.SPRUCE_FENCE);
        BIRCH_PLANK_FENCE = new ColoredFence("birch_plank_fence", Blocks.BIRCH_FENCE);
        JUNGLE_PLANK_FENCE = new ColoredFence("jungle_plank_fence", Blocks.JUNGLE_FENCE);
        ACACIA_PLANK_FENCE = new ColoredFence("acacia_plank_fence", Blocks.ACACIA_FENCE);
        DARK_OAK_PLANK_FENCE = new ColoredFence("dark_oak_plank_fence", Blocks.DARK_OAK_FENCE);
        NETHER_BRICK_FENCE = new ColoredFence("nether_brick_fence", Blocks.NETHER_BRICK_FENCE);

        STONE_PRESSURE_PLATE = new ColoredPressurePlate("stone_pressure_plate", Blocks.STONE_PRESSURE_PLATE, PressurePlateBlock.Type.STONE);
        OAK_PLANK_PRESSURE_PLATE = new ColoredPressurePlate("oak_plank_pressure_plate", Blocks.OAK_PRESSURE_PLATE, PressurePlateBlock.Type.WOOD);
        SPRUCE_PLANK_PRESSURE_PLATE = new ColoredPressurePlate("spruce_plank_pressure_plate", Blocks.SPRUCE_PRESSURE_PLATE, PressurePlateBlock.Type.WOOD);
        BIRCH_PLANK_PRESSURE_PLATE = new ColoredPressurePlate("birch_plank_pressure_plate", Blocks.BIRCH_PRESSURE_PLATE, PressurePlateBlock.Type.WOOD);
        JUNGLE_PLANK_PRESSURE_PLATE = new ColoredPressurePlate("jungle_plank_pressure_plate", Blocks.JUNGLE_PRESSURE_PLATE, PressurePlateBlock.Type.WOOD);
        ACACIA_PLANK_PRESSURE_PLATE = new ColoredPressurePlate("acacia_plank_pressure_plate", Blocks.ACACIA_PRESSURE_PLATE, PressurePlateBlock.Type.WOOD);
        DARK_OAK_PLANK_PRESSURE_PLATE = new ColoredPressurePlate("dark_oak_plank_pressure_plate", Blocks.DARK_OAK_PRESSURE_PLATE, PressurePlateBlock.Type.WOOD);
        LIGHT_WEIGHTED_PRESSURE_PLATE = new ColoredWeightedPressurePlate("light_weighted_pressure_plate", Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE, 15);
        HEAVY_WEIGHTED_PRESSURE_PLATE = new ColoredWeightedPressurePlate("heavy_weighted_pressure_plate", Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, 150);

        STONE_BUTTON = new ColoredStoneButton("stone_button", Blocks.STONE_BUTTON);
        OAK_PLANK_BUTTON = new ColoredWoodButton("oak_plank_button", Blocks.OAK_BUTTON);
        SPRUCE_PLANK_BUTTON = new ColoredWoodButton("spruce_plank_button", Blocks.SPRUCE_BUTTON);
        BIRCH_PLANK_BUTTON = new ColoredWoodButton("birch_plank_button", Blocks.BIRCH_BUTTON);
        JUNGLE_PLANK_BUTTON = new ColoredWoodButton("jungle_plank_button", Blocks.JUNGLE_BUTTON);
        ACACIA_PLANK_BUTTON = new ColoredWoodButton("acacia_plank_button", Blocks.ACACIA_BUTTON);
        DARK_OAK_PLANK_BUTTON = new ColoredWoodButton("dark_oak_plank_button", Blocks.DARK_OAK_BUTTON);

        for (ColoredObject coloredBlock : COLORED_BLOCKS) {
            coloredBlock.createBlocks();
        }
    }
}
