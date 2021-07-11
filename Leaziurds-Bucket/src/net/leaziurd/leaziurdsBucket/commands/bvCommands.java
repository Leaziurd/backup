package net.leaziurd.leaziurdsBucket.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class bvCommands implements CommandExecutor
{
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + sender.getName() + "BIENVENUE" );
		return true;
	}
}