package de.rinonline.korinskills.blocks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelStatue extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone2;

	public ModelStatue() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, -1.0F);
		bone.cubeList.add(new ModelBox(bone, 48, 36, -5.0F, -41.0F, -2.0F, 10, 25, 6, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -34.9708F, -3.1016F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.5236F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 18, -8.0F, -6.25F, -0.25F, 4, 6, 4, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 0, -8.0F, -0.25F, -0.25F, 16, 4, 4, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 60, 4.0F, -6.25F, -0.25F, 4, 6, 4, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -43.9369F, 6.5423F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -2.0F, -3.0F, -1.5F, 4, 6, 4, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -44.1459F, 3.0396F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 60, -3.0F, -4.0F, -1.0F, 6, 7, 4, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -44.0F, 0.0F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 18, -4.0F, -4.0F, -4.0F, 8, 8, 8, 0.0F));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 18, -8.0F, -2.0F, -8.0F, 16, 2, 16, 0.0F));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -8.0F, -16.0F, -8.0F, 16, 2, 16, 0.0F));
		bone2.cubeList.add(new ModelBox(bone2, 0, 36, -6.0F, -14.0F, -6.0F, 12, 12, 12, 0.0F));


	}
	public void renderModel(float f, boolean b) {

		if(b) {
			bone.render(f);
		}else {
			bone2.render(f);
		}
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
		bone2.render(f5);

	}


	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}