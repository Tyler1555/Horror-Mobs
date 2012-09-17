package net.minecraft.src;

import org.lwjgl.opengl.GL11;

public class RenderHugger extends RenderLiving {

	protected ModelHugger field_40295_c;
	
	public RenderHugger(ModelHugger modelHugger, float f) {
		super(modelHugger,f);
		field_40295_c = (ModelHugger)mainModel;
	}
	
	public void RenderHuggerA(EntityHugger entity, double d, double d1, double d2, float f, float f1) {
		super.doRenderLiving(entity, d, d1, d2, f, f1);
	}
	
	public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, float f, float f1) {
		super.doRenderLiving((EntityHugger)entityliving, d, d1, d2, f, f1);
	}
	
	public void renderHugger(EntityHugger par1EntityHugger, double par2, double par4, double par6, float par8, float par9) {
		super.doRenderLiving(par1EntityHugger, par2, par4, par6, par8, par9);
	}
	
	protected void function_40291_a(EntityHugger EntityHugger, float par2) {
		super.renderEquippedItems(EntityHugger, par2);
	}
	
	protected void function_40290_a(EntityHugger EntityHugger, double d, double d1, double d2) {
		
	}
	
	protected void renderEquippedItems(EntityLiving entityliving, float par2) {
		function_40291_a((EntityHugger)entityliving, par2);
	}
	
	protected void preRenderScale(EntityHugger entity, float f) {
		GL11.glScalef(1.0F, 1.0F, 1.0F);
	}
	
	protected void function_40292_b(EntityHugger par1EntityHugger, float par2) {
		float f = 0.9375F;
		shadowSize = 0.5F;
		GL11.glScalef(f, f, f);
	}
	
	
	protected void hasSpecialRender(EntityLiving entityliving, double par2, double par4, double par6) {
		function_40290_a((EntityHugger)entityliving, par2, par4, par6);
	}
	
	protected void preRenderCallBack(EntityLiving entityliving, float par2) {
		function_40292_b((EntityHugger)entityliving, par2);
	}
}

