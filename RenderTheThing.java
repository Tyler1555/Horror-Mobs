package net.minecraft.src;

import org.lwjgl.opengl.GL11;

public class RenderTheThing extends RenderLiving {

	protected ModelTheThing field_40295_c;
	
	public RenderTheThing(ModelTheThing modelthething, float f) {
		super(modelthething,f);
		field_40295_c = (ModelTheThing)mainModel;
	}
	
	public void renderTheThingA(EntityTheThing entity, double d, double d1, double d2, float f, float f1) {
		super.doRenderLiving(entity, d, d1, d2, f, f1);
	}
	
	public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, float f, float f1) {
		super.doRenderLiving((EntityTheThing)entityliving, d, d1, d2, f, f1);
	}
	
	public void renderTheThing(EntityTheThing par1entitythething, double par2, double par4, double par6, float par8, float par9) {
		super.doRenderLiving(par1entitythething, par2, par4, par6, par8, par9);
	}
	
	protected void function_40291_a(EntityTheThing entitythething, float par2) {
		super.renderEquippedItems(entitythething, par2);
	}
	
	protected void function_40290_a(EntityTheThing entitythething, double d, double d1, double d2) {
		
	}
	
	protected void renderEquippedItems(EntityLiving entityliving, float par2) {
		function_40291_a((EntityTheThing)entityliving, par2);
	}
	
	protected void preRenderScale(EntityTheThing entity, float f) {
		GL11.glScalef(1.0F, 1.0F, 1.0F);
	}
	
	protected void function_40292_b(EntityTheThing par1entitythething, float par2) {
		float f = 0.9375F;
		shadowSize = 0.5F;
		GL11.glScalef(f, f, f);
	}
	
	
	protected void hasSpecialRender(EntityLiving entityliving, double par2, double par4, double par6) {
		function_40290_a((EntityTheThing)entityliving, par2, par4, par6);
	}
	
	protected void preRenderCallBack(EntityLiving entityliving, float par2) {
		function_40292_b((EntityTheThing)entityliving, par2);
	}
}
