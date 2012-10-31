package net.minecraft.src;

public class ModelTheThing extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Leg8;
    ModelRenderer Leg6;
    ModelRenderer Leg4;
    ModelRenderer Leg2;
    ModelRenderer Leg7;
    ModelRenderer Leg5;
    ModelRenderer Leg3;
    ModelRenderer Leg1;
    ModelRenderer Body;
    ModelRenderer arm1;
    ModelRenderer forearm1;
    ModelRenderer arm2;
    ModelRenderer forearm2;
  
  public ModelTheThing()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-3F, -3F, -3F, 8, 8, 8);
      Head.setRotationPoint(-1F, -4F, 0F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Leg8 = new ModelRenderer(this, 18, 0);
      Leg8.addBox(-1F, -1F, -1F, 16, 2, 2);
      Leg8.setRotationPoint(4F, 20F, -1F);
      Leg8.setTextureSize(64, 32);
      Leg8.mirror = true;
      setRotation(Leg8, 0F, 0.5759587F, 0.1919862F);
      Leg6 = new ModelRenderer(this, 18, 0);
      Leg6.addBox(-1F, -1F, -1F, 16, 2, 2);
      Leg6.setRotationPoint(4F, 20F, 0F);
      Leg6.setTextureSize(64, 32);
      Leg6.mirror = true;
      setRotation(Leg6, 0F, 0.2792527F, 0.1919862F);
      Leg4 = new ModelRenderer(this, 18, 0);
      Leg4.addBox(-1F, -1F, -1F, 16, 2, 2);
      Leg4.setRotationPoint(4F, 20F, 1F);
      Leg4.setTextureSize(64, 32);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, -0.2792527F, 0.1919862F);
      Leg2 = new ModelRenderer(this, 18, 0);
      Leg2.addBox(-1F, -1F, -1F, 16, 2, 2);
      Leg2.setRotationPoint(4F, 20F, 2F);
      Leg2.setTextureSize(64, 32);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, -0.5759587F, 0.1919862F);
      Leg7 = new ModelRenderer(this, 18, 0);
      Leg7.addBox(-15F, -1F, -1F, 16, 2, 2);
      Leg7.setRotationPoint(-4F, 20F, -1F);
      Leg7.setTextureSize(64, 32);
      Leg7.mirror = true;
      setRotation(Leg7, 0F, -0.5759587F, -0.1919862F);
      Leg5 = new ModelRenderer(this, 18, 0);
      Leg5.addBox(-15F, -1F, -1F, 16, 2, 2);
      Leg5.setRotationPoint(-4F, 20F, 0F);
      Leg5.setTextureSize(64, 32);
      Leg5.mirror = true;
      setRotation(Leg5, 0F, -0.2792527F, -0.1919862F);
      Leg3 = new ModelRenderer(this, 18, 0);
      Leg3.addBox(-15F, -1F, -1F, 16, 2, 2);
      Leg3.setRotationPoint(-4F, 20F, 1F);
      Leg3.setTextureSize(64, 32);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0.2792527F, -0.1919862F);
      Leg1 = new ModelRenderer(this, 18, 0);
      Leg1.addBox(-15F, -1F, -1F, 16, 2, 2);
      Leg1.setRotationPoint(-4F, 20F, 2F);
      Leg1.setTextureSize(64, 32);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0.5759587F, -0.1919862F);
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 6, 21, 4);
      Body.setRotationPoint(-3F, 0F, -1F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      arm1 = new ModelRenderer(this, 0, 0);
      arm1.addBox(0F, 0F, 0F, 10, 2, 3);
      arm1.setRotationPoint(1F, 5F, -1F);
      arm1.setTextureSize(64, 32);
      arm1.mirror = true;
      setRotation(arm1, 0F, 0F, 0F);
      forearm1 = new ModelRenderer(this, 0, 0);
      forearm1.addBox(0F, 0F, 0F, 3, 2, 9);
      forearm1.setRotationPoint(8F, 5F, -8F);
      forearm1.setTextureSize(64, 32);
      forearm1.mirror = true;
      setRotation(forearm1, 0F, 0F, 0F);
      arm2 = new ModelRenderer(this, 0, 0);
      arm2.addBox(0F, 0F, 0F, 10, 2, 3);
      arm2.setRotationPoint(-11F, 5F, -1F);
      arm2.setTextureSize(64, 32);
      arm2.mirror = true;
      setRotation(arm2, 0F, 0F, 0F);
      forearm2 = new ModelRenderer(this, 0, 0);
      forearm2.addBox(0F, 0F, 0F, 3, 2, 10);
      forearm2.setRotationPoint(-11F, 5F, -8F);
      forearm2.setTextureSize(64, 32);
      forearm2.mirror = true;
      setRotation(forearm2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Head.render(f5);
    Leg8.render(f5);
    Leg6.render(f5);
    Leg4.render(f5);
    Leg2.render(f5);
    Leg7.render(f5);
    Leg5.render(f5);
    Leg3.render(f5);
    Leg1.render(f5);
    Body.render(f5);
    arm1.render(f5);
    forearm1.render(f5);
    arm2.render(f5);
    forearm2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
 

 

  /**
   * Sets the models various rotation angles.
   */
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
  {
      this.Head.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Head.rotateAngleX = par5 / (180F / (float)Math.PI);
      float var7 = ((float)Math.PI / 4F);
      this.Leg1.rotateAngleZ = -var7;
      this.Leg2.rotateAngleZ = var7;
      this.Leg3.rotateAngleZ = -var7 * 0.74F;
      this.Leg4.rotateAngleZ = var7 * 0.74F;
      this.Leg5.rotateAngleZ = -var7 * 0.74F;
      this.Leg6.rotateAngleZ = var7 * 0.74F;
      this.Leg7.rotateAngleZ = -var7;
      this.Leg8.rotateAngleZ = var7;
      float var8 = -0.0F;
      float var9 = 0.3926991F;
      this.Leg1.rotateAngleY = var9 * 2.0F + var8;
      this.Leg2.rotateAngleY = -var9 * 2.0F - var8;
      this.Leg3.rotateAngleY = var9 * 1.0F + var8;
      this.Leg4.rotateAngleY = -var9 * 1.0F - var8;
      this.Leg5.rotateAngleY = -var9 * 1.0F + var8;
      this.Leg6.rotateAngleY = var9 * 1.0F - var8;
      this.Leg7.rotateAngleY = -var9 * 2.0F + var8;
      this.Leg8.rotateAngleY = var9 * 2.0F - var8;
      float var10 = -(MathHelper.cos(par1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * par2;
      float var11 = -(MathHelper.cos(par1 * 0.6662F * 2.0F + (float)Math.PI) * 0.4F) * par2;
      float var12 = -(MathHelper.cos(par1 * 0.6662F * 2.0F + ((float)Math.PI / 2F)) * 0.4F) * par2;
      float var13 = -(MathHelper.cos(par1 * 0.6662F * 2.0F + ((float)Math.PI * 3F / 2F)) * 0.4F) * par2;
      float var14 = Math.abs(MathHelper.sin(par1 * 0.6662F + 0.0F) * 0.4F) * par2;
      float var15 = Math.abs(MathHelper.sin(par1 * 0.6662F + (float)Math.PI) * 0.4F) * par2;
      float var16 = Math.abs(MathHelper.sin(par1 * 0.6662F + ((float)Math.PI / 2F)) * 0.4F) * par2;
      float var17 = Math.abs(MathHelper.sin(par1 * 0.6662F + ((float)Math.PI * 3F / 2F)) * 0.4F) * par2;
      this.Leg1.rotateAngleY += var10;
      this.Leg2.rotateAngleY += -var10;
      this.Leg3.rotateAngleY += var11;
      this.Leg4.rotateAngleY += -var11;
      this.Leg5.rotateAngleY += var12;
      this.Leg6.rotateAngleY += -var12;
      this.Leg7.rotateAngleY += var13;
      this.Leg8.rotateAngleY += -var13;
      this.Leg1.rotateAngleZ += var14;
      this.Leg2.rotateAngleZ += -var14;
      this.Leg3.rotateAngleZ += var15;
      this.Leg4.rotateAngleZ += -var15;
      this.Leg5.rotateAngleZ += var16;
      this.Leg6.rotateAngleZ += -var16;
      this.Leg7.rotateAngleZ += var17;
      this.Leg8.rotateAngleZ += -var17;
  }
  
}

