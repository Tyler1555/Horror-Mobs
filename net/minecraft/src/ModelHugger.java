package net.minecraft.src;

public class ModelHugger extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer rightarm1;
    ModelRenderer rightforearm1;
    ModelRenderer leftarm1;
    ModelRenderer leftforearm1;
    ModelRenderer rightarm2;
    ModelRenderer rightforearm2;
    ModelRenderer leftarm2;
    ModelRenderer leftforearm2;
  
  public ModelHugger()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 6F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 6F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 16);
      leg3.addBox(-2F, 0F, -2F, 4, 6, 4);
      leg3.setRotationPoint(-2F, 18F, -4F);
      leg3.setTextureSize(64, 32);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
      leg4 = new ModelRenderer(this, 0, 16);
      leg4.addBox(-2F, 0F, -2F, 4, 6, 4);
      leg4.setRotationPoint(2F, 18F, -4F);
      leg4.setTextureSize(64, 32);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 16);
      leg1.addBox(0F, 0F, -2F, 4, 6, 4);
      leg1.setRotationPoint(-4F, 18F, 4F);
      leg1.setTextureSize(64, 32);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 16);
      leg2.addBox(-2F, 0F, -2F, 4, 6, 4);
      leg2.setRotationPoint(2F, 18F, 4F);
      leg2.setTextureSize(64, 32);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      rightarm1 = new ModelRenderer(this, 0, 0);
      rightarm1.addBox(0F, 0F, 0F, 4, 3, 3);
      rightarm1.setRotationPoint(4F, 8F, -1F);
      rightarm1.setTextureSize(64, 32);
      rightarm1.mirror = true;
      setRotation(rightarm1, 0F, 0F, 0F);
      rightforearm1 = new ModelRenderer(this, 0, 0);
      rightforearm1.addBox(0F, 0F, 0F, 3, 3, 7);
      rightforearm1.setRotationPoint(5F, 8F, -7F);
      rightforearm1.setTextureSize(64, 32);
      rightforearm1.mirror = true;
      setRotation(rightforearm1, 0F, 0F, 0F);
      leftarm1 = new ModelRenderer(this, 0, 0);
      leftarm1.addBox(0F, 0F, 0F, 4, 3, 4);
      leftarm1.setRotationPoint(-8F, 8F, -2F);
      leftarm1.setTextureSize(64, 32);
      leftarm1.mirror = true;
      setRotation(leftarm1, 0F, 0F, 0F);
      leftforearm1 = new ModelRenderer(this, 0, 0);
      leftforearm1.addBox(0F, 0F, 0F, 3, 3, 8);
      leftforearm1.setRotationPoint(-8F, 8F, -7F);
      leftforearm1.setTextureSize(64, 32);
      leftforearm1.mirror = true;
      setRotation(leftforearm1, 0F, 0F, 0F);
      rightarm2 = new ModelRenderer(this, 0, 0);
      rightarm2.addBox(0F, 0F, 0F, 4, 3, 3);
      rightarm2.setRotationPoint(4F, 12F, -2F);
      rightarm2.setTextureSize(64, 32);
      rightarm2.mirror = true;
      setRotation(rightarm2, 0F, 0F, 0F);
      rightforearm2 = new ModelRenderer(this, 0, 0);
      rightforearm2.addBox(0F, 0F, 0F, 3, 3, 7);
      rightforearm2.setRotationPoint(5F, 12F, -7F);
      rightforearm2.setTextureSize(64, 32);
      rightforearm2.mirror = true;
      setRotation(rightforearm2, 0F, 0F, 0F);
      leftarm2 = new ModelRenderer(this, 0, 0);
      leftarm2.addBox(0F, 0F, 0F, 4, 3, 3);
      leftarm2.setRotationPoint(-8F, 12F, -2F);
      leftarm2.setTextureSize(64, 32);
      leftarm2.mirror = true;
      setRotation(leftarm2, 0F, 0F, 0F);
      leftforearm2 = new ModelRenderer(this, 0, 0);
      leftforearm2.addBox(0F, 0F, 0F, 3, 3, 7);
      leftforearm2.setRotationPoint(-8F, 12F, -7F);
      leftforearm2.setTextureSize(64, 32);
      leftforearm2.mirror = true;
      setRotation(leftforearm2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    head.render(f5);
    body.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    rightarm1.render(f5);
    rightforearm1.render(f5);
    leftarm1.render(f5);
    leftforearm1.render(f5);
    rightarm2.render(f5);
    rightforearm2.render(f5);
    leftarm2.render(f5);
    leftforearm2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
	  this.head.rotateAngleY = f4 / (180F / (float)Math.PI);
      this.head.rotateAngleX = f5 / (180F / (float)Math.PI);
      this.leg1.rotateAngleX = MathHelper.cos(f1 * 0.6662F) * 1.4F * f2;
      this.leg2.rotateAngleX = MathHelper.cos(f1 * 0.6662F + (float)Math.PI) * 1.4F * f2;
      this.leg3.rotateAngleX = MathHelper.cos(f1 * 0.6662F + (float)Math.PI) * 1.4F * f2;
      this.leg4.rotateAngleX = MathHelper.cos(f1 * 0.6662F) * 1.4F * f2;
  }

}

