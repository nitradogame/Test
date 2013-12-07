package de.timmer.test;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinQuitListener implements Listener {
	@EventHandler
	public void a(PlayerJoinEvent e){
		if(e.getPlayer().getName().equalsIgnoreCase("timmer2002")){
			e.setJoinMessage(e.getPlayer().getName()+" ");
		}else{
			e.setJoinMessage(e.getPlayer().getDisplayName()+" ");
		}
		
	}
	@EventHandler
	public void a(PlayerQuitEvent e){
		e.setQuitMessage(e.getPlayer().getDisplayName()+" ");
	}
}
