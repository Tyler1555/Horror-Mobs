package net.minecraft.src;

import org.lwjgl.opengl.GL11;

public class RenderReaper extends RenderLiving {

	protected ModelReaper field_40295_c;
	
	public RenderReaper(ModelReaper modelreaper, float f) {
		super(modelreaper,f);
		field_40295_c = (ModelReaper)mainModel;
	}
	
	public void renderReaperA(EntityReaper reaper, double d, double d1, double d2, float f, float f1) {
		super.doRenderLiving(reaper, d, d1, d2, f, f1);
	}
	
	public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, float f, float f1) {
		super.doRenderLiving((EntityReaper)entityliving, d, d1, d2, f, f1);
	}
	
	public void renderReaper(EntityReaper reaper, double par2, double par4, double par6, float par8, float par9) {
		super.doRenderLiving(reaper, par2, par4, par6, par8, par9);
	}
	
	protected void function_40291_a(EntityReaper reaper, float par2) {
		super.renderEquippedItems(reaper, par2);
	}
	
	protected void function_40290_a(EntityReaper entityliving, double d, double d1, double d2) {
		
	}
	
	protected void renderEquippedItems(EntityLiving entityliving, float par2) {
		function_40291_a((EntityReaper)entityliving, par2);
	}
	
	public void preRenderScale(EntityReaper reaper, int par2) {
		GL11.glScalef(1.0F, 1.0F, 1.0F);
	}
	
	protected void function_40292_b(EntityReaper par1entityreaper, float par2) {
		float f = 0.9375F;
		shadowSize = 0.5F;
		GL11.glScalef(f, f, f);
	}
	
	protected void hasSpecialRender(EntityLiving entityliving, double par2, double par4, double par6) {
		function_40290_a((EntityReaper)entityliving, par2, par4, par6);
	}
	
	protected void preRenderCallBack(EntityLiving entityliving, float par2) {
		function_40292_b((EntityReaper)entityliving, par2);
	}
	
}
