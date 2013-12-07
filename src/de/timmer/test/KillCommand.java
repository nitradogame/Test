package de.timmer.test;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KillCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String lable, String[] args) {
		if(cs instanceof Player){
			
			Player player = (Player) cs;
			
			if(args.length == 0) {
				player.setHealth(0.0);
				player.sendMessage("§4du warst so doff und hast dich selbst gekillt");
			}else if(args.length == 1){
				Player xd = Bukkit.getPlayer(args[0]); 
				xd.setHealth(0.0);
				player.sendMessage("§6Du hast "+xd.getName()+" getkillt.");
			}
		}
		return false;
	}

}
