package net.minecraft.src;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class HMEventHandler {

	@ForgeSubscribe
	public void onLivingDeathEvent(LivingDeathEvent event) {
		
	}
	
	@ForgeSubscribe
	public void onSound(SoundLoadEvent event) {
		try {
			event.manager.soundPoolSounds.addSound("living/thething.mp3", mod_HorrorMobs.class.getResource("/horrormod/thethinglive.mp3"));
		} catch(Exception e) {
			System.err.println("Error - Horror Mobs could not register one or more sounds!");
			e.printStackTrace();
		}
	}
	
	
}
