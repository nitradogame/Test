package de.timmer.test;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Timmer extends JavaPlugin {
	
	@Override
	public void onEnable(){
		this.getCommand("kill").setExecutor(new KillCommand());
		Bukkit.getPluginManager().registerEvents(new JoinQuitListener(), this);
	}

}
