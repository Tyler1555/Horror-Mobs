package net.minecraft.src;

public class ModelTwin extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer head2;
    ModelRenderer rightarm2;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    
    public boolean isSneak;
  
  public ModelTwin()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(64, 32);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(64, 32);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      head2 = new ModelRenderer(this, 0, 0);
      head2.addBox(0F, 0F, 0F, 8, 8, 8);
      head2.setRotationPoint(-4F, 2F, -10F);
      head2.setTextureSize(64, 32);
      head2.mirror = true;
      setRotation(head2, 0F, 0F, 0F);
      rightarm2 = new ModelRenderer(this, 0, 0);
      rightarm2.addBox(0F, 0F, 0F, 1, 1, 1);
      rightarm2.setRotationPoint(0F, 0F, 0F);
      rightarm2.setTextureSize(64, 32);
      rightarm2.mirror = true;
      setRotation(rightarm2, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 3, 3, 10);
      Shape1.setRotationPoint(4F, 6F, -16F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 3, 3, 10);
      Shape2.setRotationPoint(-7F, 6F, -16F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    head.render(f5);
    body.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
    head2.render(f5);
    rightarm2.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
  {
  
  this.rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
  this.leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
  this.rightleg.rotateAngleY = 0.0F;
  this.leftleg.rotateAngleY = 0.0F;

  if (this.isRiding)
  {
      this.rightleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
      this.leftleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
      this.rightleg.rotateAngleY = ((float)Math.PI / 10F);
      this.leftleg.rotateAngleY = -((float)Math.PI / 10F);
  }

  

  


  float var7;
  float var8;

  if (this.onGround > -9990.0F)
  {
      var7 = this.onGround;
      var7 = 1.0F - this.onGround;
      var7 *= var7;
      var7 *= var7;
      var7 = 1.0F - var7;
      var8 = MathHelper.sin(var7 * (float)Math.PI);
      
      
  }

  if (this.isSneak)
  {
      
      this.rightleg.rotationPointZ = 4.0F;
      this.leftleg.rotationPointZ = 4.0F;
      this.rightleg.rotationPointY = 9.0F;
      this.leftleg.rotationPointY = 9.0F;
      
  }
  else
  {
      
      this.rightleg.rotationPointZ = 0.0F;
      this.leftleg.rotationPointZ = 0.0F;
      this.rightleg.rotationPointY = 12.0F;
      this.leftleg.rotationPointY = 12.0F;
      
  }

  

  
}

}
