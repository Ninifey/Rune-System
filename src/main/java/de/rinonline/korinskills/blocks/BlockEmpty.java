package de.rinonline.korinskills.blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.rinonline.korinskills.SPELLMAIN;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockEmpty extends Block {
	
	public BlockEmpty() {
		super(Material.rock);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockBounds(0.2F,0,0.2F, 0.8F,1.0F,0.8F);
		setBlockUnbreakable();
	}

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(SPELLMAIN.MODID+":block_empty");
    }
}
