package tyler15555.HMProxies;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.src.EntityBurnedZombie;
import net.minecraft.src.EntityGhoul;
import net.minecraft.src.EntityReaper;
import net.minecraft.src.EntitySeaDweller;
import net.minecraft.src.EntityShadowLurker;
import net.minecraft.src.EntityTheThing;
import net.minecraft.src.EntityTwin;
import net.minecraft.src.ModelBiped;
import net.minecraft.src.ModelReaper;
import net.minecraft.src.ModelShadowLurker;
import net.minecraft.src.ModelTheThing;
import net.minecraft.src.ModelTwin;
import net.minecraft.src.ModelZombie;
import net.minecraft.src.RenderBiped;
import net.minecraft.src.RenderReaper;
import net.minecraft.src.RenderShadowLurker;
import net.minecraft.src.RenderTheThing;
import net.minecraft.src.RenderTwin;
import net.minecraft.src.World;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

	public static void registerRenderers() {
		MinecraftForgeClient.preloadTexture(BLOCK_TEXTURE);
		MinecraftForgeClient.preloadTexture(ITEMS_TEXTURE);
		RenderingRegistry.registerEntityRenderingHandler(EntityTheThing.class, new RenderTheThing(new ModelTheThing(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGhoul.class, new RenderBiped(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySeaDweller.class, new RenderBiped(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityShadowLurker.class, new RenderShadowLurker(new ModelShadowLurker(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBurnedZombie.class, new RenderBiped(new ModelZombie(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTwin.class, new RenderTwin(new ModelTwin(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityReaper.class, new RenderReaper(new ModelReaper(), 0.5F));
	}
	
	
	public static World getClientWorld() {
		return FMLClientHandler.instance().getClient().theWorld;
	}
	
}
