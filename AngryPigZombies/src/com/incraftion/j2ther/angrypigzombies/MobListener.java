package com.incraftion.j2ther.angrypigzombies;

import org.bukkit.entity.Entity;
import org.bukkit.entity.PigZombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class MobListener implements Listener {
	public static Main plugin;
	public void Moblistener(Main plugin) {
		MobListener.plugin = plugin;
	}
	
	@EventHandler
	public void onCreatureSpawn(CreatureSpawnEvent event){
		if(event.isCancelled()){
			return;
		}
		
		Entity ent = event.getEntity();
		if (ent == null){
			return;
		}
		
		if (!(ent instanceof PigZombie)){
			return;
		}
		
		else if (ent instanceof PigZombie) {
			PigZombie p = (PigZombie)event.getEntity();
			p.setAngry(true);
		}
		
	}
}	