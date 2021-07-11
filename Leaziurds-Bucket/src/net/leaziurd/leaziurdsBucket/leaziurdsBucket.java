package net.leaziurd.leaziurdsBucket;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import net.leaziurd.leaziurdsBucket.events.leaziurdsBucketEvents;
import net.leaziurd.leaziurdsBucket.commands.bvCommands;

public class leaziurdsBucket extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(new leaziurdsBucketEvents(), this);
		getCommand("bv").setExecutor(new bvCommands());
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Leaziurd's Bucket]: I'M WORKING");
	}
	
	@Override
	public void onDisable()
	{
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Leaziurd's Bucket]: I'M NOT WORKING");
	}
}