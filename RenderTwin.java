package net.minecraft.src;

import org.lwjgl.opengl.GL11;

public class RenderTwin extends RenderLiving {

	protected ModelTwin field_40295_c;
	
	public RenderTwin(ModelTwin modeltwin, float f) {
		super(modeltwin, f);
		field_40295_c = (ModelTwin)mainModel;
	}
	
	public void renderTwinA(EntityTwin entity, double d, double d1, double d2, float f, float f1) {
		super.doRenderLiving(entity, d, d1, d2, f, f1);
	}
	
	public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, float f, float f1) {
		super.doRenderLiving((EntityTwin)entityliving, d, d1, d2, f, f1);
	}
	
	public void renderTwin(EntityTwin par1entitytwin, double par2, double par4, double par6, float par8, float par9) {
		super.doRenderLiving(par1entitytwin, par2, par4, par6, par8, par9);
	}
	
	protected void func_40291_a(EntityTwin par1entitytwin, float par2) {
		super.renderEquippedItems(par1entitytwin, par2);
	}
	
	protected void func_40290_a(EntityTwin entitytwin, double d, double d1, double d2) {
		
	}
	
	protected void renderEquippedItems(EntityLiving par1entityliving, float par2) {
		func_40291_a((EntityTwin)par1entityliving, par2);
	}
	
	protected void preRenderScale(EntityTwin entity, float f) {
		GL11.glScalef(1.0F, 1.0F, 1.0F);
	}
	
	protected void func_40292_b(EntityTwin par1entitytwin, float par2) {
		float f = 0.9375F;
		shadowSize = 0.45F;
		GL11.glScalef(f, f, f);
	}
	
	protected void hasSpecialRender(EntityLiving par1entityliving, double par2, double par4, double par6) {
		func_40290_a((EntityTwin)par1entityliving, par2, par4, par6);
	}
	
	protected void preRenderCallback(EntityLiving par1entityliving, float par2) {
		func_40292_b((EntityTwin)par1entityliving, par2);
	}
	
}
