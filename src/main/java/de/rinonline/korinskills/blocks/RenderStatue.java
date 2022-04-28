package de.rinonline.korinskills.blocks;

import org.lwjgl.opengl.GL11;

import de.rinonline.korinskills.SPELLMAIN;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderStatue extends TileEntitySpecialRenderer {

	private static final ResourceLocation texture = new ResourceLocation(SPELLMAIN.MODID+":textures/blocks/statue.png");

	private ModelStatue model;

	 

	public RenderStatue(){

	this.model = new ModelStatue();

	}

	 

	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float f)

	{

    	int meta = te.getWorldObj().getBlockMetadata(te.xCoord,te.yCoord,te.zCoord);

    	GL11.glPushMatrix(); //rotations and translates
		GL11.glTranslatef((float)x +0.5F, (float)y+1.5F, (float)z +0.5F);
		GL11.glRotatef(180, 0.0F, 0.0F, 1.0F);
		
		GL11.glRotatef(meta*90, 0.0F, 1.0F, 0.0F);
			
			this.bindTexture(texture);

		GL11.glPushMatrix(); 
		
			this.model.renderModel(0.0625F);
			
		GL11.glPopMatrix();
		GL11.glPopMatrix();

	}

}

	 