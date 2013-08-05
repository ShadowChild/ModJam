package shadowhax.crystalluscraft.block.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCrystalStage1 extends ModelBase {

    //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
  
    public ModelCrystalStage1() {

        textureWidth = 64;
        textureHeight = 32;
    
        Shape1 = new ModelRenderer(this, 0, 6);
        Shape1.addBox(0F, 0F, 0F, 1, 3, 1);
        Shape1.setRotationPoint(-5F, 23F, 4F);
        Shape1.setTextureSize(64, 32);
        Shape1.mirror = true;
        setRotation(Shape1, -0.4833219F, 0F, -0.6320364F);
        Shape2 = new ModelRenderer(this, 0, 0);
        Shape2.addBox(0F, 0F, 0F, 2, 4, 2);
        Shape2.setRotationPoint(-2F, 21F, -1.5F);
        Shape2.setTextureSize(64, 32);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 0.1487144F, -0.1487144F);
        Shape3 = new ModelRenderer(this, 4, 6);
        Shape3.addBox(0F, 0F, 0F, 1, 3, 1);
        Shape3.setRotationPoint(4F, 22F, 0F);
        Shape3.setTextureSize(64, 32);
        Shape3.mirror = true;
        setRotation(Shape3, -0.5205006F, 0.2602503F, 0.2974289F);
        Shape4 = new ModelRenderer(this, 8, 5);
        Shape4.addBox(0F, 0F, 0F, 1, 2, 1);
        Shape4.setRotationPoint(0F, 24F, -4F);
        Shape4.setTextureSize(64, 32);
        Shape4.mirror = true;
        setRotation(Shape4, 0.5205006F, 0.5576792F, -0.0743572F);
        Shape5 = new ModelRenderer(this, 8, 0);
        Shape5.addBox(0F, 0F, 0F, 2, 3, 2);
        Shape5.setRotationPoint(-1F, 23F, 5F);
        Shape5.setTextureSize(64, 32);
        Shape5.mirror = true;
        setRotation(Shape5, -0.8922867F, 0.6320364F, -0.3346075F);
     }

  public void render(float f)
  {
    Shape1.render(f);
    Shape2.render(f);
    Shape3.render(f);
    Shape4.render(f);
    Shape5.render(f);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

    @Override
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
