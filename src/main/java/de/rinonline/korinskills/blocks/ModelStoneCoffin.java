package de.rinonline.korinskills.blocks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelStoneCoffin extends ModelBase {
		private final ModelRenderer corpse;
		private final ModelRenderer coffin_lid;
		private final ModelRenderer bb_main;

		public ModelStoneCoffin() {
			textureWidth = 256;
			textureHeight = 256;

			corpse = new ModelRenderer(this);
			corpse.setRotationPoint(0.0F, 15.0F, 0.0F);
			corpse.cubeList.add(new ModelBox(corpse, 92, 50, -4.0F, -1.0F, -7.8333F, 8, 8, 8, 0.0F));
			corpse.cubeList.add(new ModelBox(corpse, 92, 16, -4.0F, 1.0F, 12.1667F, 4, 4, 12, 0.0F));
			corpse.cubeList.add(new ModelBox(corpse, 92, 0, -8.0F, 1.0F, 0.1667F, 4, 4, 12, 0.0F));
			corpse.cubeList.add(new ModelBox(corpse, 0, 64, 4.0F, 1.0F, 0.1667F, 4, 4, 12, 0.0F));
			corpse.cubeList.add(new ModelBox(corpse, 0, 0, -4.0F, 1.0F, 0.1667F, 8, 4, 12, 0.0F));
			corpse.cubeList.add(new ModelBox(corpse, 0, 48, 0.0F, 1.0F, 12.1667F, 4, 4, 12, 0.0F));

			coffin_lid = new ModelRenderer(this);
			coffin_lid.setRotationPoint(0.0F, 24.0F, 0.0F);
			coffin_lid.cubeList.add(new ModelBox(coffin_lid, 0, 0, -12.0F, -16.0F, -14.0F, 24, 4, 44, 0.0F));
			coffin_lid.cubeList.add(new ModelBox(coffin_lid, 92, 4, -10.0F, -18.0F, -14.0F, 20, 2, 44, 0.0F));

			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 48, -12.0F, -4.0F, -14.0F, 24, 4, 44, 0.0F));
			bb_main.cubeList.add(new ModelBox(bb_main, 76, 98, -10.0F, -12.0F, -10.0F, 2, 8, 36, 0.0F));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 96, 8.0F, -12.0F, -10.0F, 2, 8, 36, 0.0F));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 26, -10.0F, -12.0F, -12.0F, 20, 8, 2, 0.0F));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 16, -10.0F, -12.0F, 26.0F, 20, 8, 2, 0.0F));
		}

		public void renderModel(float f) {

			corpse.render(f);
			coffin_lid.render(f);
			bb_main.render(f);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}	