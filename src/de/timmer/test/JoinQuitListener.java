package de.timmer.test;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinQuitListener implements Listener {
	@EventHandler
	public void a(PlayerJoinEvent e){
		if(e.getPlayer().getName().equalsIgnoreCase("timmer2002")){
			e.setJoinMessage("§4"+e.getPlayer().getName()+" ist dem Spiel beigetreten ");
		}else{
			e.setJoinMessage(e.getPlayer().getDisplayName()+" ist dem Spiel beigetreten ");
		}
		
	}
	@EventHandler
	public void a(PlayerQuitEvent e){
		e.setQuitMessage("§6"+e.getPlayer().getDisplayName()+" hat das Spiel verlassen ");
	}
}
