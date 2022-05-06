package de.rinonline.korinskills.blocks;

import org.lwjgl.opengl.GL11;

import de.rinonline.korinskills.SPELLMAIN;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderBlockDeco extends TileEntitySpecialRenderer {

	private static final ResourceLocation texture_statue = new ResourceLocation(SPELLMAIN.MODID+":textures/blocks/statue.png");
	private static final ResourceLocation texture_coffin = new ResourceLocation(SPELLMAIN.MODID+":textures/blocks/coffin.png");

	private ModelStatue model_statue;
	private ModelStoneCoffin model_coffin;

	 

	public RenderBlockDeco(){

		this.model_statue = new ModelStatue();
		this.model_coffin = new ModelStoneCoffin();

	}

	 

	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float f)

	{
		
    	int meta = te.getWorldObj().getBlockMetadata(te.xCoord,te.yCoord,te.zCoord);
   
    	if(meta <=3) {
    		boolean b = te.getWorldObj().getBlock(te.xCoord,te.yCoord-1,te.zCoord) instanceof BlockDeco;
    		GL11.glPushMatrix();
			if(b)
			GL11.glTranslatef((float)x +0.5F, (float)y+0.5F, (float)z +0.5F);
			if(!b)
			GL11.glTranslatef((float)x +0.5F, (float)y+1.5F, (float)z +0.5F);
			GL11.glRotatef(180, 0.0F, 0.0F, 1.0F);
		
			GL11.glRotatef((meta*90)-00, 0.0F, 1.0F, 0.0F);	
				this.bindTexture(texture_statue);
			GL11.glPushMatrix(); 
				this.model_statue.renderModel(0.0625F,b);
			GL11.glPopMatrix();
			GL11.glPopMatrix();
    	}else {

        	GL11.glPushMatrix();
    		GL11.glTranslatef((float)x +0.5F, (float)y+1.5F, (float)z +0.5F);
    		GL11.glRotatef(180, 0.0F, 0.0F, 1.0F);
    			this.bindTexture(texture_coffin);
    		GL11.glPushMatrix(); 
    			this.model_coffin.renderModel(0.0625F);
    		GL11.glPopMatrix();
    		GL11.glPopMatrix();
    	}
	}

}

	 