package de.rinonline.korinskills.items.maps;


import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.item.ItemCloth;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

@SideOnly(Side.CLIENT)
public class MapItemRenderer {
    public static void renderItemAsMapInFirstPerson(ItemRenderer itemRenderer, float partialRenderTick) {

    	Minecraft mc = Minecraft.getMinecraft();
        float f1 = itemRenderer.prevEquippedProgress + (itemRenderer.equippedProgress - itemRenderer.prevEquippedProgress) * partialRenderTick;
        EntityClientPlayerMP entityclientplayermp = mc.thePlayer;
        float f2 = entityclientplayermp.prevRotationPitch + (entityclientplayermp.rotationPitch - entityclientplayermp.prevRotationPitch) * partialRenderTick;
        GL11.glPushMatrix();
        GL11.glRotatef(f2, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(entityclientplayermp.prevRotationYaw + (entityclientplayermp.rotationYaw - entityclientplayermp.prevRotationYaw) * partialRenderTick, 0.0F, 1.0F, 0.0F);
        RenderHelper.enableStandardItemLighting();
        GL11.glPopMatrix();
        EntityPlayerSP entityplayersp = (EntityPlayerSP)entityclientplayermp;
        float f3 = entityplayersp.prevRenderArmPitch + (entityplayersp.renderArmPitch - entityplayersp.prevRenderArmPitch) * partialRenderTick;
        float f4 = entityplayersp.prevRenderArmYaw + (entityplayersp.renderArmYaw - entityplayersp.prevRenderArmYaw) * partialRenderTick;
        GL11.glRotatef((entityclientplayermp.rotationPitch - f3) * 0.1F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef((entityclientplayermp.rotationYaw - f4) * 0.1F, 0.0F, 1.0F, 0.0F);
        ItemStack itemstack = itemRenderer.itemToRender;

        if (itemstack != null && itemstack.getItem() instanceof ItemCloth)
        {
            GL11.glEnable(GL11.GL_BLEND);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        }

        int i = mc.theWorld.getLightBrightnessForSkyBlocks(MathHelper.floor_double(entityclientplayermp.posX), MathHelper.floor_double(entityclientplayermp.posY), MathHelper.floor_double(entityclientplayermp.posZ), 0);
        int j = i % 65536;
        int k = i / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j / 1.0F, (float)k / 1.0F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float f5;
        float f6;
        float f7;

        if (itemstack != null)
        {
            int l = itemstack.getItem().getColorFromItemStack(itemstack, 0);
            f5 = (float)(l >> 16 & 255) / 255.0F;
            f6 = (float)(l >> 8 & 255) / 255.0F;
            f7 = (float)(l & 255) / 255.0F;
            GL11.glColor4f(f5, f6, f7, 1.0F);
        }
        else
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        }

        float f8;
        float f9;
        float f10;
        float f13;
        Render render;
        RenderPlayer renderplayer;

        if (itemstack != null/* && itemstack.getItem() == TEST_ITEM*/)
        {
            GL11.glPushMatrix();
            f13 = 0.8F;
            f5 = entityclientplayermp.getSwingProgress(partialRenderTick);
            f6 = MathHelper.sin(f5 * (float)Math.PI);
            f7 = MathHelper.sin(MathHelper.sqrt_float(f5) * (float)Math.PI);
            GL11.glTranslatef(-f7 * 0.4F, MathHelper.sin(MathHelper.sqrt_float(f5) * (float)Math.PI * 2.0F) * 0.2F, -f6 * 0.2F);
            f5 = 1.0F - f2 / 45.0F + 0.1F;

            if (f5 < 0.0F)
            {
                f5 = 0.0F;
            }

            if (f5 > 1.0F)
            {
                f5 = 1.0F;
            }

            f5 = -MathHelper.cos(f5 * (float)Math.PI) * 0.5F + 0.5F;
            GL11.glTranslatef(0.0F, 0.0F * f13 - (1.0F - f1) * 1.2F - f5 * 0.5F + 0.04F, -0.9F * f13);
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(f5 * -85.0F, 0.0F, 0.0F, 1.0F);
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            mc.getTextureManager().bindTexture(entityclientplayermp.getLocationSkin());

            for (int i1 = 0; i1 < 2; ++i1)
            {
                int j1 = i1 * 2 - 1;
                GL11.glPushMatrix();
                GL11.glTranslatef(-0.0F, -0.6F, 1.1F * (float)j1);
                GL11.glRotatef((float)(-45 * j1), 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(59.0F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef((float)(-65 * j1), 0.0F, 1.0F, 0.0F);
                render = RenderManager.instance.getEntityRenderObject(mc.thePlayer);
                renderplayer = (RenderPlayer)render;
                f10 = 1.0F;
                GL11.glScalef(f10, f10, f10);
                renderplayer.renderFirstPersonArm(mc.thePlayer);
                GL11.glPopMatrix();
            }

            f6 = entityclientplayermp.getSwingProgress(partialRenderTick);
            f7 = MathHelper.sin(f6 * f6 * (float)Math.PI);
            f8 = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI);
            GL11.glRotatef(-f7 * 20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-f8 * 20.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-f8 * 80.0F, 1.0F, 0.0F, 0.0F);
            f9 = 0.38F;
            GL11.glScalef(f9, f9, f9);
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(-1.0F, -1.0F, 0.0F);
            f10 = 0.015625F;
            GL11.glScalef(f10, f10, f10);

            mc.getTextureManager().bindTexture(mc.getTextureManager().getResourceLocation(itemRenderer.itemToRender.getItemSpriteNumber()));
            IIcon icon = entityplayersp.getItemIcon(itemstack, 0);

            Tessellator tessellator = Tessellator.instance;
            GL11.glNormal3f(0.0F, 0.0F, -1.0F);
            tessellator.startDrawingQuads();
            byte b0 = 7;
            tessellator.addVertexWithUV((double)(0 - b0), (double)(128 + b0), 0.0D, icon.getMaxU(), icon.getMaxV());
            tessellator.addVertexWithUV((double)(128 + b0), (double)(128 + b0), 0.0D, icon.getMinU(), icon.getMaxV());
            tessellator.addVertexWithUV((double)(128 + b0), (double)(0 - b0), 0.0D, icon.getMinU(), icon.getMinV());
            tessellator.addVertexWithUV((double)(0 - b0), (double)(0 - b0), 0.0D, icon.getMaxU(), icon.getMinV());
            tessellator.draw();

//                IItemRenderer custom = MinecraftForgeClient.getItemRenderer(itemstack, FIRST_PERSON_MAP);
//                MapData mapdata = ((ItemMap)itemstack.getItem()).getMapData(itemstack, mc.theWorld);
//
//                if (custom == null)
//                {
//                    if (mapdata != null)
//                    {
//                        mc.entityRenderer.getMapItemRenderer().func_148250_a(mapdata, false);
//                    }
//                }
//                else
//                {
//                    custom.renderItem(FIRST_PERSON_MAP, itemstack,mc.thePlayer,mc.getTextureManager(), mapdata);
//                }

            GL11.glPopMatrix();
        }

        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        RenderHelper.disableStandardItemLighting();
    }
}