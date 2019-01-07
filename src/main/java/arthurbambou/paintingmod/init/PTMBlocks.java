package arthurbambou.paintingmod.init;

import java.util.ArrayList;
import java.util.List;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.api.*;
import arthurbambou.paintingmod.api.BlockWall;
import arthurbambou.paintingmod.blocks.*;
import arthurbambou.paintingmod.blocks.PTMSoggyClay;
import arthurbambou.paintingmod.coloredblocks.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class PTMBlocks {
	
	public static final List<Block> BLOCKS_ID = new ArrayList<Block>();
	public static final List<ColoredBlock> COLORED_BLOCKS = new ArrayList<ColoredBlock>();
	public static final List<Block> BLOCKS_META = new ArrayList<Block>();
	public static final List<ColoredBlockMeta> COLORED_BLOCKS_META = new ArrayList<ColoredBlockMeta>();
	public static final List<ColoredFallingBlockMeta> COLORED_FALLING_BLOCK_METAS = new ArrayList<ColoredFallingBlockMeta>();
	public static final List<ColoredStairs> COLORED_STAIRS_META_LIST = new ArrayList<ColoredStairs>();
	public static final List<BlockStairs> BLOCK_STAIRS_LIST = new ArrayList<BlockStairs>();
	public static final List<ColoredFence> COLORED_FENCE_LIST = new ArrayList<ColoredFence>();
	public static final List<BlockFence> BLOCK_FENCE_LIST = new ArrayList<BlockFence>();
	public static final List<ColoredWall> COLORED_WALL_LIST = new ArrayList<ColoredWall>();
	public static final List<BlockWall> BLOCK_WALL_LIST = new ArrayList<BlockWall>();
	public static final List<ColoredSlab> COLORED_SLAB_LIST = new ArrayList<ColoredSlab>();
	public static final List<ColoredBlockSlab> COLORED_BLOCK_SLABS = new ArrayList<ColoredBlockSlab>();
	public static final List<ColoredBlockSlabDouble> COLORED_BLOCK_SLAB_DOUBLES = new ArrayList<ColoredBlockSlabDouble>();
	
	public static final Block SOGGY_CLAY = new PTMSoggyClay("soggy_clay", Material.IRON, PTMMain.PAINTING_MOD_BLOCKS);

	public static final ColoredBlockMeta STONE_META = new PTMColoredBlockMetaBase("stone", 1.5F, 30.0F, Blocks.STONE, 0);
	public static final ColoredBlockMeta GRANITE_META = new PTMColoredBlockMetaBase("granite",  1.5F, 30.0F, Blocks.STONE,  1);
	public static final ColoredBlockMeta POLISHED_GRANITE_META = new PTMColoredBlockMetaBase("polished_granite",  1.5F, 30.0F,  Blocks.STONE,  2);
	public static final ColoredBlockMeta DIORITE_META = new PTMColoredBlockMetaBase("diorite",  1.5F, 30.0F,  Blocks.STONE, 3);
	public static final ColoredBlockMeta POLISHED_DIORITE_META = new PTMColoredBlockMetaBase("polished_diorite",  1.5F, 30.0F,  Blocks.STONE,  4);
	public static final ColoredBlockMeta ANDESITE_META = new PTMColoredBlockMetaBase("andesite",  1.5F, 30.0F,  Blocks.STONE,  5);
	public static final ColoredBlockMeta POLISHED_ANDESITE_META = new PTMColoredBlockMetaBase("polished_andesite",  1.5F, 30.0F,  Blocks.STONE,  6);
	public static final ColoredBlockMeta DIRT_META = new PTMColoredBlockMetaBase("dirt",  0.5F, 2.5F,  Blocks.DIRT,  0);
	public static final ColoredBlockMeta COARSE_DIRT_META = new PTMColoredBlockMetaBase("coarse_dirt",  0.5F, 2.5F,  Blocks.DIRT,  1);
	public static final ColoredBlockMeta COBBLESTONE_META = new PTMColoredBlockMetaBase("cobblestone",  2.0F, 30.0F,  Blocks.COBBLESTONE);
	public static final ColoredBlockMeta PLANK_META = new PTMColoredBlockMetaBase("plank",  2.0F, 15.0F,  Blocks.PLANKS);
	public static final ColoredFallingBlockMeta SAND_META = new PTMColoredFallingBlockMeta("sand",  0.5F, 2.5F,  Blocks.SAND);
	public static final ColoredFallingBlockMeta GRAVEL_META = new PTMColoredFallingBlockMeta("gravel",  0.6F, 3.0F,  Blocks.GRAVEL);
	public static final ColoredBlockMeta SPONGE_META = new PTMColoredBlockMetaBase("sponge",  0.6F, 3.0F,  Blocks.SPONGE,  0);
	public static final ColoredBlockMeta WET_SPONGE_META = new PTMColoredBlockMetaBase("wet_sponge",  0.6F, 3.0F,  Blocks.SPONGE,  1);
	public static final ColoredBlockMeta LAPIS_LAZULI_BLOCK_META = new PTMColoredBlockMetaBase("lapis_lazuli_block",  3.0F, 15.0F,  Blocks.LAPIS_BLOCK);
	// public static final ColoredBlock SANDSTONE_META = new PTMColoredBlockMetaBase("sandstone",  0.8F, 4.0F, Blocks.SANDSTONE, 0);
	public static final ColoredBlockMeta GOLD_BLOCK_META = new PTMColoredBlockMetaBase("gold_block",  3.0F, 30.0F,  Blocks.GOLD_BLOCK);
	public static final ColoredBlockMeta IRON_BLOCK_META = new PTMColoredBlockMetaBase("iron_block",  5.0F, 30.0F,  Blocks.IRON_BLOCK);
	public static final ColoredBlockMeta BRICK_META = new PTMColoredBlockMetaBase("brick",  2.0F, 30.0F,  Blocks.BRICK_BLOCK);
	public static final ColoredBlockMeta MOSS_STONE_META = new PTMColoredBlockMetaBase("moss_stone",  2.0F, 30.0F,  Blocks.MOSSY_COBBLESTONE);
	public static final ColoredBlockMeta OBSIDIAN_META = new PTMColoredBlockMetaBase("obsidian",  50.0F, 6000.0F,  Blocks.OBSIDIAN);
	public static final ColoredBlockMeta DIAMOND_BLOCK_META = new PTMColoredBlockMetaBase("diamond_block",  5.0F, 30.0F,  Blocks.DIAMOND_BLOCK);
	public static final ColoredBlockMeta ICE_META = new PTMColoredBlockMetaBase("ice",  0.5F, 2.5F,  Blocks.ICE);
	public static final ColoredBlockMeta SNOW_BLOCK_META = new PTMColoredBlockMetaBase("snow_block",  0.2F, 1.0F,  Blocks.SNOW);
	public static final ColoredBlockMeta CLAY_BLOCK_META = new PTMColoredBlockMetaBase("clay_block",  2.0F, 3.0F,  Blocks.CLAY);
	public static final ColoredBlockMeta NETHERRACK_META = new PTMColoredBlockMetaBase("netherrack",  0.4F, 2.0F,  Blocks.NETHERRACK);
	public static final ColoredBlockMeta SOUL_SAND_META = new PTMColoredBlockMetaSoulSand("soul_sand",  0.5F, 2.5F,  Blocks.SOUL_SAND);
	public static final ColoredBlockMeta GLOWSTONE_META = new PTMColoredBlockMetaBase("glowstone",  0.3F, 1.5F,  Blocks.GLOWSTONE);
	public static final ColoredBlockMeta STONE_BRICK_META = new PTMColoredBlockMetaBase("stone_brick",  1.5F, 30.0F,  Blocks.STONEBRICK,  0);
	public static final ColoredBlockMeta CRACKED_STONE_BRICK_META = new PTMColoredBlockMetaBase("cracked_stone_brick",  1.5F, 30.0F,  Blocks.STONEBRICK,  2);
	public static final ColoredBlockMeta MOSSY_STONE_BRICK_META = new PTMColoredBlockMetaBase("mossy_stone_brick",  1.5F, 30.0F,  Blocks.STONEBRICK,  1);
	public static final ColoredBlockMeta CHISELED_STONE_BRICK_META = new PTMColoredBlockMetaBase("chiseled_stone_brick",  1.5F, 30.0F,  Blocks.STONEBRICK,  3);
	public static final ColoredBlockMeta NETHER_BRICK_META = new PTMColoredBlockMetaBase("nether_brick",  2.0F, 30.0F,  Blocks.NETHER_BRICK);
	public static final ColoredBlockMeta END_STONE_META = new PTMColoredBlockMetaBase("end_stone",  3.0F, 45.0F,  Blocks.END_STONE);
	public static final ColoredBlockMeta EMERALD_BLOCK_META = new PTMColoredBlockMetaBase("emerald_block",  5.0F, 30.0F,  Blocks.EMERALD_BLOCK);
	//	public static final ColoredBlockMeta QUARTZ_BLOCK_META = new PTMColoredBlockMetaBase("quartz_block",  0.8F, 4.0F,  Blocks.QUARTZ_BLOCK, 0);
	public static final ColoredBlockMeta PRISMARINE_META = new PTMColoredBlockMetaBase("prismarine",  1.5F, 30.0F,  Blocks.PRISMARINE,  0);
	public static final ColoredBlockMeta PRISMARINE_BRICK_META = new PTMColoredBlockMetaBase("prismarine_brick",  1.5F, 30.0F,  Blocks.PRISMARINE, 1);
	public static final ColoredBlockMeta DARK_PRISMARINE_META = new PTMColoredBlockMetaBase("dark_prismarine",  1.5F, 30.0F,  Blocks.PRISMARINE,  2);
	public static final ColoredBlockMeta SEA_LANTERN_META = new PTMColoredBlockMetaBase("sea_lantern",  0.3F, 1.5F,  Blocks.SEA_LANTERN);
	public static final ColoredBlockMeta COAL_BLOCK_META = new PTMColoredBlockMetaBase("coal_block",  5.0F, 30.0F,  Blocks.COAL_BLOCK);
	public static final ColoredBlockMeta PACKET_ICE_META = new PTMColoredBlockMetaBase("packet_ice",  0.5F, 2.5F,  Blocks.FROSTED_ICE);
	public static final ColoredBlockMeta PURPUR_BLOCK_META = new PTMColoredBlockMetaBase("purpur_block",  1.5F, 30.0F,  Blocks.PURPUR_BLOCK,  0);
	public static final ColoredBlockMeta END_STONE_BRICK_META = new PTMColoredBlockMetaBase("end_stone_brick",  0.8F, 4.0F,  Blocks.END_BRICKS);
	public static final ColoredBlockMeta MAGMA_BLOCK_META = new PTMColoredBlockMetaBase("magma_block",  0.5F, 2.5F,  Blocks.MAGMA);
	public static final ColoredBlockMeta NETHER_WART_BLOCK_META = new PTMColoredBlockMetaBase("nether_wart_block",  1.0F, 5.0F,  Blocks.NETHER_WART_BLOCK);
	public static final ColoredBlockMeta SPRUCE_LEAVES_META = new PTMColoredBlockMetaBase("spruce_leaves",  0.2F, 1.0F,  Blocks.LEAVES,  1);
	public static final ColoredBlockMeta JUNGLE_LEAVES_META = new PTMColoredBlockMetaBase("jungle_leaves",  0.2F, 1.0F,  Blocks.LEAVES,  3);
	public static final ColoredBlockMetaSlime SLIME_BLOCK_META = new PTMColoredBlockMetaSlime("slime_block",  0.0F, 0.0F,  Blocks.SLIME_BLOCK);
	public static final ColoredBlockMeta OAK_LEAVES_META = new PTMColoredBlockMetaBase("oak_leaves",  0.2F, 1.0F,  Blocks.LEAVES,  0);
	public static final ColoredBlockMeta BIRCH_LEAVES_META = new PTMColoredBlockMetaBase("birch_leaves",  0.2F, 1.0F,  Blocks.LEAVES,  2);
	public static final ColoredBlockMeta ACACIA_LEAVES_META = new PTMColoredBlockMetaBase("acacia_leaves",  0.2F, 1.0F,  Blocks.LEAVES2,  0);
	public static final ColoredBlockMeta DARK_OAK_LEAVES_META = new PTMColoredBlockMetaBase("dark_oak_leaves",  0.2F, 1.0F,  Blocks.LEAVES2,  1);


    public static final ColoredStairs OAK_PLANK_STAIRS = new BaseStairs("oak_plank_stairs", Blocks.OAK_STAIRS);
    public static final ColoredStairs SPRUCE_PLANK_STAIRS = new BaseStairs("spruce_plank_stairs", Blocks.SPRUCE_STAIRS);
    public static final ColoredStairs BIRCH_PLANK_STAIRS = new BaseStairs("birch_plank_stairs", Blocks.BIRCH_STAIRS);
    public static final ColoredStairs JUNGLE_PLANK_STAIRS = new BaseStairs("jungle_plank_stairs", Blocks.JUNGLE_STAIRS);
    public static final ColoredStairs ACACIA_PLANK_STAIRS = new BaseStairs("acacia_plank_stairs", Blocks.ACACIA_STAIRS);
    public static final ColoredStairs DARK_OAK_PLANK_STAIRS = new BaseStairs("dark_oak_plank_stairs", Blocks.DARK_OAK_STAIRS);
    public static final ColoredStairs COBBLESTONE_STAIRS = new BaseStairs("cobblestone_stairs", Blocks.STONE_STAIRS);
    public static final ColoredStairs BRICK_STAIRS = new BaseStairs("brick_stairs", Blocks.BRICK_STAIRS);
    public static final ColoredStairs STONE_BRICK_STAIRS = new BaseStairs("stone_brick_stairs", Blocks.STONE_BRICK_STAIRS);
    public static final ColoredStairs NETHER_BRICK_STAIRS = new BaseStairs("nether_brick_stairs", Blocks.NETHER_BRICK_STAIRS);
//    public static final ColoredStairs SANDSTONE_STAIRS = new BaseStairs("sandstone_stairs", Blocks.SANDSTONE_STAIRS);
//    public static final ColoredStairs QUARTZ_STAIRS = new BaseStairs("quartz_stairs", Blocks.QUARTZ_STAIRS);
    public static final ColoredStairs PURPUR_STAIRS = new BaseStairs("purpur_stairs", Blocks.PURPUR_STAIRS);
//    public static final ColoredStairs RED_SANDSTONE_STAIRS = new BaseStairs("red_sandstone_stairs", Blocks.RED_SANDSTONE_STAIRS);

	public static final ColoredFence OAK_PLANK_FENCE = new BaseFence("oak_plank_fence", Blocks.OAK_FENCE);
	public static final ColoredFence SPRUCE_PLANK_FENCE = new BaseFence("spruce_plank_fence", Blocks.SPRUCE_FENCE);
	public static final ColoredFence BIRCH_PLANK_FENCE = new BaseFence("birch_plank_fence", Blocks.BIRCH_FENCE);
	public static final ColoredFence JUNGLE_PLANK_FENCE = new BaseFence("jungle_plank_fence", Blocks.JUNGLE_FENCE);
	public static final ColoredFence ACACIA_PLANK_FENCE = new BaseFence("acacia_plank_fence", Blocks.ACACIA_FENCE);
	public static final ColoredFence DARK_OAK_PLANK_FENCE = new BaseFence("dark_oak_plank_fence", Blocks.DARK_OAK_FENCE);
	public static final ColoredFence NETHER_BRICK_FENCE = new BaseFence("nether_brick_fence", Blocks.NETHER_BRICK_FENCE);

	public static final ColoredWall COBBLESTONE_WALL = new BaseWall("cobblestone_wall", Blocks.COBBLESTONE_WALL, 0);
	public static final ColoredWall MOSSY_COBBLESTONE_WALL = new BaseWall("mossy_cobblestone_wall", Blocks.COBBLESTONE_WALL, 1);

	public static final ColoredSlab COBBLESTONE_SLAB = new BaseSlab("cobblestone", Blocks.STONE_SLAB, Blocks.DOUBLE_STONE_SLAB);


	public static final ColoredBlock STONE = new BaseMeta("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE, true, 0);
	public static final ColoredBlock GRANITE = new BaseMeta("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1,Blocks.STONE, true, 1);
	public static final ColoredBlock POLISHED_GRANITE = new BaseMeta("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE, true, 2);
	public static final ColoredBlock DIORITE = new BaseMeta("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE, true, 3);
	public static final ColoredBlock POLISHED_DIORITE = new BaseMeta("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE, true, 4);
	public static final ColoredBlock ANDESITE = new BaseMeta("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE, true, 5);
	public static final ColoredBlock POLISHED_ANDESITE = new BaseMeta("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE, true, 6);
	public static final ColoredBlock DIRT = new BaseMeta("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0, Blocks.DIRT, true, 0);
	public static final ColoredBlock COARSE_DIRT = new BaseMeta("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0, Blocks.DIRT, true, 1);
	public static final ColoredBlock COBBLESTONE = new Base("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1, Blocks.COBBLESTONE, false);
	public static final ColoredBlock PLANK = new Base("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0, Blocks.PLANKS, false);
	public static final ColoredBlock SAND = new Base("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0, Blocks.SAND, false);
	public static final ColoredBlock GRAVEL = new Gravel("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0, Blocks.GRAVEL, false);
	public static final ColoredBlock SPONGE = new BaseMeta("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0, Blocks.SPONGE, true, 0);
	public static final ColoredBlock WET_SPONGE = new BaseMeta("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0, Blocks.SPONGE, true, 1);
	public static final ColoredBlock LAPIS_LAZULI_BLOCK = new Base("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2, Blocks.LAPIS_BLOCK, false);
	// public static final ColoredBlock SANDSTONE = new ColoredBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1, Blocks.SANDSTONE, true, 0);
	public static final ColoredBlock GOLD_BLOCK = new Base("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3, Blocks.GOLD_BLOCK, false);
	public static final ColoredBlock IRON_BLOCK = new Base("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2, Blocks.IRON_BLOCK, false);
	public static final ColoredBlock BRICK = new Base("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1, Blocks.BRICK_BLOCK, false);
	public static final ColoredBlock MOSS_STONE = new Base("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1, Blocks.MOSSY_COBBLESTONE, false);
	public static final ColoredBlock OBSIDIAN = new Base("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 3, Blocks.OBSIDIAN, false);
	public static final ColoredBlock DIAMOND_BLOCK = new Base("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3, Blocks.DIAMOND_BLOCK, false);
	public static final ColoredBlock ICE = new Base("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0, Blocks.ICE, false);
	public static final ColoredBlock SNOW_BLOCK = new Base("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1, Blocks.SNOW, false);
	public static final ColoredBlock CLAY_BLOCK = new Base("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 3.0F, "shovel", 0, Blocks.CLAY, false);
	public static final ColoredBlock NETHERRACK = new Base("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1, Blocks.NETHERRACK, false);
	public static final ColoredBlock SOUL_SAND = new SoulSand("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0, Blocks.SOUL_SAND, false);
	public static final ColoredBlock GLOWSTONE = new Base("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0, Blocks.GLOWSTONE, false);
	public static final ColoredBlock STONE_BRICK = new BaseMeta("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONEBRICK, true, 0);
	public static final ColoredBlock CRACKED_STONE_BRICK = new BaseMeta("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONEBRICK, true, 2);
	public static final ColoredBlock MOSSY_STONE_BRICK = new BaseMeta("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONEBRICK, true, 1);
	public static final ColoredBlock CHISELED_STONE_BRICK = new BaseMeta("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONEBRICK, true, 3);
	public static final ColoredBlock NETHER_BRICK = new Base("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1, Blocks.NETHER_BRICK, false);
	public static final ColoredBlock END_STONE = new Base("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1, Blocks.END_STONE, false);
	public static final ColoredBlock EMERALD_BLOCK = new Base("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3, Blocks.EMERALD_BLOCK, false);
//	public static final ColoredBlock QUARTZ_BLOCK= new BaseMeta("quartz_block", Material.ROCK, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1, Blocks.QUARTZ_BLOCK, true, 0);
	public static final ColoredBlock PRISMARINE= new BaseMeta("prismarine", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.PRISMARINE, true, 0);
	public static final ColoredBlock PRISMARINE_BRICK= new BaseMeta("prismarine_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.PRISMARINE, true, 1);
	public static final ColoredBlock DARK_PRISMARINE= new BaseMeta("dark_prismarine", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.PRISMARINE, true, 2);
	public static final ColoredBlock SEA_LANTERN = new Base("sea_lantern", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "null", 0, Blocks.SEA_LANTERN, false);
	public static final ColoredBlock COAL_BLOCK = new Base("coal_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 1, Blocks.COAL_BLOCK, false);
	public static final ColoredBlock PACKET_ICE = new Base("packet_ice", Material.GLASS, SoundType.GLASS, 0.5F, 2.5F, "pickaxe", 1, Blocks.FROSTED_ICE, false);
	public static final ColoredBlock PURPUR_BLOCK = new BaseMeta("purpur_block", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.PURPUR_BLOCK, true, 0);
	public static final ColoredBlock END_STONE_BRICK = new Base("end_stone_brick", Material.ROCK, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1, Blocks.END_BRICKS, false);
	public static final ColoredBlock MAGMA_BLOCK = new Base("magma_block", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "pickaxe", 1, Blocks.MAGMA, false);
	public static final ColoredBlock NETHER_WART_BLOCK = new Base("nether_wart_block", Material.GLASS, SoundType.GLASS, 1.0F, 5.0F, "null", 0, Blocks.NETHER_WART_BLOCK, false);
	public static final ColoredBlock SPRUCE_LEAVES = new BaseMeta("spruce_leaves", Material.LEAVES, SoundType.PLANT, 0.2F, 1.0F, "shears", 0, Blocks.LEAVES, true, 1);
	public static final ColoredBlock JUNGLE_LEAVES = new BaseMeta("jungle_leaves", Material.LEAVES, SoundType.PLANT, 0.2F, 1.0F, "shears", 0, Blocks.LEAVES, true, 3);
	public static final ColoredBlock SLIME_BLOCK = new SlimeBlock("slime_block", Material.SPONGE, SoundType.SLIME, 0.0F, 0.0F, "null", 0, Blocks.SLIME_BLOCK, false);
    public static final ColoredBlock OAK_LEAVES = new BaseMeta("oak_leaves", Material.LEAVES, SoundType.PLANT, 0.2F, 1.0F, "shears", 0, Blocks.LEAVES, true, 0);
    public static final ColoredBlock BIRCH_LEAVES = new BaseMeta("birch_leaves", Material.LEAVES, SoundType.PLANT, 0.2F, 1.0F, "shears", 0, Blocks.LEAVES, true, 2);
    public static final ColoredBlock ACACIA_LEAVES = new BaseMeta("acacia_leaves", Material.LEAVES, SoundType.PLANT, 0.2F, 1.0F, "shears", 0, Blocks.LEAVES2, true, 0);
    public static final ColoredBlock DARK_OAK_LEAVES = new BaseMeta("dark_oak_leaves", Material.LEAVES, SoundType.PLANT, 0.2F, 1.0F, "shears", 0, Blocks.LEAVES2, true, 0);

//	//Chiseled Sandstone
//	public static final Block BLACK_CHISELED_SANDSTONE= new PTMBlackBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block RED_CHISELED_SANDSTONE= new PTMRedBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block GREEN_CHISELED_SANDSTONE= new PTMGreenBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block BROWN_CHISELED_SANDSTONE= new PTMBrownBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block BLUE_CHISELED_SANDSTONE= new PTMBlueBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block PURPLE_CHISELED_SANDSTONE= new PTMPurpleBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block CYAN_CHISELED_SANDSTONE= new PTMCyanBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block LIGHT_GRAY_CHISELED_SANDSTONE= new PTMLightGrayBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block GRAY_CHISELED_SANDSTONE= new PTMGrayBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block PINK_CHISELED_SANDSTONE= new PTMPinkBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block LIME_CHISELED_SANDSTONE= new PTMLimeBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block YELLOW_CHISELED_SANDSTONE= new PTMYellowBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block LIGHT_BLUE_CHISELED_SANDSTONE= new PTMLightBlueBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block MAGENTA_CHISELED_SANDSTONE= new PTMMagentaBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block ORANGE_CHISELED_SANDSTONE= new PTMOrangeBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block WHITE_CHISELED_SANDSTONE= new PTMWhiteBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//
//	//Smooth Sandstone
//	public static final Block BLACK_SMOOTH_SANDSTONE= new PTMBlackBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block RED_SMOOTH_SANDSTONE= new PTMRedBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block GREEN_SMOOTH_SANDSTONE= new PTMGreenBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block BROWN_SMOOTH_SANDSTONE= new PTMBrownBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block BLUE_SMOOTH_SANDSTONE= new PTMBlueBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block PURPLE_SMOOTH_SANDSTONE= new PTMPurpleBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block CYAN_SMOOTH_SANDSTONE= new PTMCyanBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block LIGHT_GRAY_SMOOTH_SANDSTONE= new PTMLightGrayBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block GRAY_SMOOTH_SANDSTONE= new PTMGrayBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block PINK_SMOOTH_SANDSTONE= new PTMPinkBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block LIME_SMOOTH_SANDSTONE= new PTMLimeBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block YELLOW_SMOOTH_SANDSTONE= new PTMYellowBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block LIGHT_BLUE_SMOOTH_SANDSTONE= new PTMLightBlueBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block MAGENTA_SMOOTH_SANDSTONE= new PTMMagentaBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block ORANGE_SMOOTH_SANDSTONE= new PTMOrangeBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block WHITE_SMOOTH_SANDSTONE= new PTMWhiteBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);


}
