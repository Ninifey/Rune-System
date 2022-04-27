package de.rinonline.korinskills;

import cpw.mods.fml.common.registry.GameRegistry;
import de.rinonline.korinskills.crafting.ItemCrystalShard;
import de.rinonline.korinskills.crafting.Runebench;
import de.rinonline.korinskills.crafting.TileEntityRunebench;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModRegistry {

	public static void mainRegistry() {
		
		initialiseBlocks();
		registerBlocks();
		
		initialiseItems();
		registerItems();
		
		registerTitleEntitys();
	}

	//------------- Blocks --------------------------------------------------------------------------------------------------
	public static Block runebench,runebenchActive;

	public static void initialiseBlocks() {
		runebench = new Runebench(false).setBlockName("runebench").setCreativeTab(CreativeTabs.tabBlock);
		runebenchActive = new Runebench(true).setBlockName("runebenchActive");
	}

	public static void registerBlocks() {
		GameRegistry.registerBlock(runebench, runebench.getUnlocalizedName());
		GameRegistry.registerBlock(runebenchActive, runebenchActive.getUnlocalizedName());
	}

	//------------- Items --------------------------------------------------------------------------------------------------
	public static Item crystalShard;

	public static void initialiseItems() {
		crystalShard = new ItemCrystalShard("crystal_shard");
	}

	public static void registerItems() {
		GameRegistry.registerItem(crystalShard, crystalShard.getUnlocalizedName());
	}

	//------------- TitleEntitys --------------------------------------------------------------------------------------------------

	public static void registerTitleEntitys() {
		GameRegistry.registerTileEntity(TileEntityRunebench.class, "TileEntityRunebench");
	}
}
