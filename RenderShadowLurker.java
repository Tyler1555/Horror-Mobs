package net.minecraft.src;

import org.lwjgl.opengl.GL11;

public class RenderShadowLurker extends RenderLiving {

	protected ModelShadowLurker field_40295_c;
	
	public RenderShadowLurker(ModelShadowLurker modelshadowlurker, float f) {
		super(modelshadowlurker,f);
		field_40295_c = (ModelShadowLurker)mainModel;
	}
	
	public void renderShadowLurkerA(EntityShadowLurker entity, double d, double d1, double d2, float f, float f1) {
		super.doRenderLiving(entity, d, d1, d2, f, f1);
	}
	
	public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, float f, float f1) {
		super.doRenderLiving((EntityShadowLurker)entityliving, d, d1, d2, f, f1);
	}
	
	public void renderShadowLurker(EntityShadowLurker shadowlurker, double par2, double par4, double par6, float par8, float par9) {
		super.doRenderLiving(shadowlurker, par2, par4, par6, par8, par9);
	}
	
	protected void func_40291_a(EntityShadowLurker par1entityshadowlurker, float par2) {
		super.renderEquippedItems(par1entityshadowlurker, par2);
	}
	
	protected void func_40290_a(EntityShadowLurker entityshadowlurker, double d, double d1, double d2) {
		
	}
	
	protected void renderEquippedItems(EntityLiving entityliving, float par2) {
		func_40291_a((EntityShadowLurker)entityliving, par2);
	}
	
	protected void preRenderScale(EntityShadowLurker entity, float f) {
		GL11.glScalef(1.0F, 1.0F, 1.0F);
	}
	
	protected void function_40292_b(EntityShadowLurker par1entityshadowlurker, float par2) {
		float f = 0.9375F;
		shadowSize = 0.5F;
		GL11.glScalef(f, f, f);
	}
	
	protected void hasSpecialRender(EntityLiving entityliving, double par2, double par4, double par6) {
		func_40290_a((EntityShadowLurker)entityliving, par2, par4, par6);
	}
	
	protected void preRenderCallBack(EntityLiving entityliving, float par2) {
		function_40292_b((EntityShadowLurker)entityliving, par2);
	}
	
}
