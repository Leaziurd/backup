package net.leaziurd.leaziurdsBucket.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class leaziurdsBucketEvents implements Listener
{
	@EventHandler
	public static void onPlayerJoin(PlayerJoinEvent event) 
	{
		Player player = event.getPlayer();

		if(!(player.hasPlayedBefore()))
		{
			player.sendMessage(ChatColor.GREEN + "BIENVENUE A TOI SUR [HYRIA UHC]");
			Bukkit.broadcastMessage(ChatColor.GREEN + "SOUHAITEZ LUI LA BIENVENUE SUR [HYRIA UHC] (/bv)");
		}
	}
}
