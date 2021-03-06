package shadowhax.crystalluscraft.block.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelWarpPad extends ModelBase {

    ModelRenderer Shape1;
    ModelRenderer Shape2;

    public ModelWarpPad() {
        textureWidth = 64;
        textureHeight = 33;

        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(0F, 22F, 0F, 16, 2, 16);
        Shape1.setRotationPoint(-8F, 0F, -8F);
        Shape1.setTextureSize(64, 33);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 0, 18);
        Shape2.addBox(0F, 0F, 0F, 14, 1, 14);
        Shape2.setRotationPoint(-7F, 21F, -7F);
        Shape2.setTextureSize(64, 33);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 0F, 0F);
    }

    public void render(float f) {
        Shape1.render(f);
        Shape2.render(f);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
    }
}
