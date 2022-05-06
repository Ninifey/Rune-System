package de.rinonline.korinskills.blocks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelStoneCoffin extends ModelBase {
	private final ModelRenderer bb_main;
	private final ModelRenderer bb_cube;
	private static int x = 1;

	public ModelStoneCoffin() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 48, 50, -8.0F, -4.0F, -8.0F, 16, 2, 16, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 60, 0, -6.0F, -12.0F, -6.0F, 12, 8, 12, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 46, -8.0F, -16.0F, -8.0F, 16, 4, 16, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -10.0F, -20.0F, -10.0F, 20, 4, 20, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 48, 46, -10.0F, -28.0F, 6.0F, 4, 8, 4, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 46, 6.0F, -28.0F, 6.0F, 4, 8, 4, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 24, 6.0F, -28.0F, -10.0F, 4, 8, 4, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -10.0F, -28.0F, -10.0F, 4, 8, 4, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 56, 58, -10.0F, -22.0F, -6.0F, 2, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 48, 58, -10.0F, -22.0F, 4.0F, 2, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 58, 8.0F, -22.0F, -6.0F, 2, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 8, 40, 8.0F, -22.0F, 4.0F, 2, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 8, 36, -6.0F, -22.0F, -10.0F, 2, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 36, 4.0F, -22.0F, -10.0F, 2, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 24, 4.0F, -22.0F, 8.0F, 2, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 8, 16, -6.0F, -22.0F, 8.0F, 2, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 16, 6.0F, -30.0F, 6.0F, 2, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 8, 12, -8.0F, -30.0F, 6.0F, 2, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 0, -8.0F, -30.0F, -8.0F, 2, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 12, 6.0F, -30.0F, -8.0F, 2, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 24, -10.0F, -2.0F, -10.0F, 20, 2, 20, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 12, 6.0F, -30.0F, -8.0F, 2, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 16, 6.0F, -30.0F, 6.0F, 2, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 8, 12, -8.0F, -30.0F, 6.0F, 2, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 0, -8.0F, -30.0F, -8.0F, 2, 2, 2, 0.0F));


		bb_cube = new ModelRenderer(this, 60, 24);
		bb_cube.addBox(-4F, -4F, -4F, 8, 8, 8);
		bb_cube.setRotationPoint(0F, -5F, 0F);
		bb_cube.setTextureSize(128, 128);
	}

		public void renderModel(float f) {

			bb_main.render(f);
			bb_cube.render(f);
			updateAnimation();
		}

		private void updateAnimation() {
			bb_cube.rotateAngleX += 0.00525F;
			bb_cube.rotateAngleY += 0.00515F;
			bb_cube.rotateAngleZ += 0.00925F;
			++x;
			bb_cube.offsetY = (float) (Math.sin(x*0.012)*0.15);
			
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}	