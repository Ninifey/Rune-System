package de.rinonline.korinskills.blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.rinonline.korinskills.ModRegistry;
import de.rinonline.korinskills.SPELLMAIN;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockStatue extends BlockContainer {

	public static final String[] StatueStates = new String[] {"north", "east", "south", "west"};
	private String b;
    @SideOnly(Side.CLIENT)
    private IIcon[] StatueIIcons;
	
	public BlockStatue(Material p_i45386_1_,String TextureName) {
		super(p_i45386_1_);
		b = TextureName;
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockBounds(0.1F,0,0.1F, 0.9F,1.0F,0.9F);
    }
	    @SideOnly(Side.CLIENT)
	    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	    {
	        if (p_149691_2_ < 0 || p_149691_2_ >= this.StatueIIcons.length)
	        {
	            p_149691_2_ = 0;
	        }

	        return this.StatueIIcons[p_149691_2_];
	    }
	    
	    @SideOnly(Side.CLIENT)
	    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
	    {
	    	 for (int i = 0; i < this.StatueStates.length; ++i)
		        {
	 	    	p_149666_3_.add(new ItemStack(p_149666_1_, 1, i));
		        }
	    }

	    @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister p_149651_1_)
	    {
	        this.StatueIIcons = new IIcon[StatueStates.length];

	        for (int i = 0; i < this.StatueIIcons.length; ++i)
	        {
	        	this.StatueIIcons[i] = p_149651_1_.registerIcon(SPELLMAIN.MODID+":"+b);  	
	        }
	    }
	    
	    
	    public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_)
	    {
	        if(p_149749_1_.getBlock(p_149749_2_, p_149749_3_ - 1, p_149749_4_)instanceof BlockStatue) {
	    	p_149749_1_.setBlock(p_149749_2_, p_149749_3_+1, p_149749_4_, Blocks.air);
	        }
	    }

	    public void onBlockPlacedBy(World p_149689_1_, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_)
	    {
	    	int i = p_149689_1_.getBlockMetadata(p_149689_2_, p_149689_3_, p_149689_4_);
	    	if(i >= 4&& !(i >= 8)) {i = 4; }else if (i >= 8){i = 8;}
	        int l = MathHelper.floor_double((double)(p_149689_5_.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
	        int l2 = MathHelper.floor_double((double)(p_149689_5_.rotationPitch * 4.0F / 180.0F) + 0.5D) & 2;
	        int i1 = p_149689_1_.getBlockMetadata(p_149689_2_, p_149689_3_, p_149689_4_) & 4;
	        if (l == 0)
	        {
	            p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 1+i | i1, 2);
	        }

	        if (l == 1)
	        {
	            p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 2+i | i1, 2);
	        }

	        if (l == 2)
	        {
	            p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 3+i | i1, 2);
	        }

	        if (l == 3)
	        {
	            p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 0+i | i1, 2);
	        }
	        if(p_149689_1_.getBlock(p_149689_2_, p_149689_3_ - 1, p_149689_4_)instanceof BlockStatue) {
	        	p_149689_1_.setBlock(p_149689_2_, p_149689_3_ + 1, p_149689_4_, ModRegistry.emptyBlock,0,3);
	        }
	    }
	    
	    @Override
	    @SideOnly(Side.CLIENT)
	    public int getRenderBlockPass()
	    {
	        return 4;
	    }


	    @Override
	    public boolean isOpaqueCube()
	    {
	        return false;
	    }

	    @Override
	    public boolean renderAsNormalBlock()
	    {
	        return false;
	    }
	    
	    @Override
	    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
	    try
	    {
	        return new TitleStatue();
	    }
	    catch (Exception var3)
	    {
	        throw new RuntimeException(var3);
	    }
	}
}