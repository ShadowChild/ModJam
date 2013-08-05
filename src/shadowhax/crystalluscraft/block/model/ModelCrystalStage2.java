package shadowhax.crystalluscraft.block.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCrystalStage2 extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
  
  public ModelCrystalStage2()
  {
    textureWidth = 20;
    textureHeight = 18;
    
      Shape1 = new ModelRenderer(this, 0, 8);
      Shape1.addBox(0F, 0F, 0F, 1, 5, 1);
      Shape1.setRotationPoint(-5F, 22F, 4F);
      Shape1.setTextureSize(20, 18);
      Shape1.mirror = true;
      setRotation(Shape1, -0.5948578F, -0.0743572F, -0.8179294F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 2, 6, 2);
      Shape2.setRotationPoint(-2F, 19F, -1.5F);
      Shape2.setTextureSize(20, 18);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0.1487144F, -0.1487144F);
      Shape3 = new ModelRenderer(this, 4, 8);
      Shape3.addBox(0F, 0F, 0F, 2, 3, 2);
      Shape3.setRotationPoint(3F, 22F, -1F);
      Shape3.setTextureSize(20, 18);
      Shape3.mirror = true;
      setRotation(Shape3, -0.0371786F, 0.1115358F, 0.7435722F);
      Shape4 = new ModelRenderer(this, 4, 14);
      Shape4.addBox(0F, 0F, 0F, 1, 3, 1);
      Shape4.setRotationPoint(-4F, 24F, -1F);
      Shape4.setTextureSize(20, 18);
      Shape4.mirror = true;
      setRotation(Shape4, 0.5205006F, 0.5576792F, -0.669215F);
      Shape5 = new ModelRenderer(this, 8, 0);
      Shape5.addBox(0F, 0F, 0F, 2, 4, 2);
      Shape5.setRotationPoint(0F, 22F, 4F);
      Shape5.setTextureSize(20, 18);
      Shape5.mirror = true;
      setRotation(Shape5, -0.4461433F, 0.5948578F, -0.2230717F);
      Shape6 = new ModelRenderer(this, 12, 8);
      Shape6.addBox(-1F, 0F, -1F, 2, 2, 2);
      Shape6.setRotationPoint(2F, 23F, -4F);
      Shape6.setTextureSize(20, 18);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 1.003822F, 0.4461433F);
      Shape7 = new ModelRenderer(this, 0, 14);
      Shape7.addBox(0F, 0F, 0F, 1, 3, 1);
      Shape7.setRotationPoint(-4F, 23F, -4F);
      Shape7.setTextureSize(20, 18);
      Shape7.mirror = true;
      setRotation(Shape7, 0.5205006F, 0.5576792F, -0.0743572F);
  }
  
  public void render(float f)
  {
    Shape1.render(f);
    Shape2.render(f);
    Shape3.render(f);
    Shape4.render(f);
    Shape5.render(f);
    Shape6.render(f);
    Shape4.render(f);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
