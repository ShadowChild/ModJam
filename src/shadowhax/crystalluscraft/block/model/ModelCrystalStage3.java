package shadowhax.crystalluscraft.block.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCrystalStage3 extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
  
  public ModelCrystalStage3()
  {
    textureWidth = 30;
    textureHeight = 29;
    
      Shape1 = new ModelRenderer(this, 0, 11);
      Shape1.addBox(0F, 0F, 0F, 1, 5, 1);
      Shape1.setRotationPoint(-1F, 20F, 4F);
      Shape1.setTextureSize(30, 29);
      Shape1.mirror = true;
      setRotation(Shape1, -0.5948578F, -0.0743572F, -0.0371786F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 3, 8, 3);
      Shape2.setRotationPoint(-2F, 17F, -1.5F);
      Shape2.setTextureSize(30, 29);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0.1487144F, -0.1487144F);
      Shape3 = new ModelRenderer(this, 4, 11);
      Shape3.addBox(0F, 0F, 0F, 2, 5, 2);
      Shape3.setRotationPoint(4F, 20F, -1F);
      Shape3.setTextureSize(30, 29);
      Shape3.mirror = true;
      setRotation(Shape3, -0.0371786F, 0F, 0.5948578F);
      Shape4 = new ModelRenderer(this, 4, 18);
      Shape4.addBox(0F, 0F, 0F, 1, 3, 1);
      Shape4.setRotationPoint(0F, 24F, -4F);
      Shape4.setTextureSize(30, 29);
      Shape4.mirror = true;
      setRotation(Shape4, 1.003822F, 0.0743572F, -0.4089647F);
      Shape5 = new ModelRenderer(this, 12, 11);
      Shape5.addBox(0F, 0F, 0F, 2, 4, 2);
      Shape5.setRotationPoint(1F, 21F, 2.533333F);
      Shape5.setTextureSize(30, 29);
      Shape5.mirror = true;
      setRotation(Shape5, -0.4461433F, 0.5948578F, 0.0371786F);
      Shape6 = new ModelRenderer(this, 12, 6);
      Shape6.addBox(-1F, 0F, -1F, 2, 3, 2);
      Shape6.setRotationPoint(3F, 22F, -3F);
      Shape6.setTextureSize(30, 29);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0.9294653F, 0.8179294F);
      Shape7 = new ModelRenderer(this, 0, 17);
      Shape7.addBox(0F, 0F, 0F, 1, 5, 1);
      Shape7.setRotationPoint(-2F, 21F, -3.533333F);
      Shape7.setTextureSize(30, 29);
      Shape7.mirror = true;
      setRotation(Shape7, 0.5205006F, 0.5576792F, -0.0743572F);
      Shape8 = new ModelRenderer(this, 4, 22);
      Shape8.addBox(0F, 0F, 0F, 1, 3, 1);
      Shape8.setRotationPoint(-2F, 19F, 2F);
      Shape8.setTextureSize(30, 29);
      Shape8.mirror = true;
      setRotation(Shape8, 0.5205006F, 1.561502F, -0.7435722F);
      Shape9 = new ModelRenderer(this, 0, 23);
      Shape9.addBox(0F, 0F, 0F, 1, 5, 1);
      Shape9.setRotationPoint(-4F, 22F, 3F);
      Shape9.setTextureSize(30, 29);
      Shape9.mirror = true;
      setRotation(Shape9, -0.5948578F, -0.0743572F, -0.8179294F);
      Shape10 = new ModelRenderer(this, 8, 18);
      Shape10.addBox(0F, 0F, 0F, 2, 3, 2);
      Shape10.setRotationPoint(-4F, 23F, -1F);
      Shape10.setTextureSize(30, 29);
      Shape10.mirror = true;
      setRotation(Shape10, 0.5205006F, 0.5576792F, -0.669215F);
      Shape11 = new ModelRenderer(this, 12, 0);
      Shape11.addBox(0F, 0F, 0F, 4, 1, 5);
      Shape11.setRotationPoint(-2F, 23F, -3F);
      Shape11.setTextureSize(30, 29);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
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
    Shape4.render(f);
    Shape1.render(f);
    Shape4.render(f);
    Shape7.render(f);
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
