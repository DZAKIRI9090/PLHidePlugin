package me.dz;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class PLHidePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("PLHidePlugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("PLHidePlugin disabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String cmd = label.toLowerCase();

        if (cmd.equals("pl") || cmd.equals("plugins") || cmd.equals("plugin")) {
            if (sender instanceof Player player) {
                if (!player.hasPermission("plhide.bypass")) {
                    player.sendMessage("§cYou do not have permission to use this command.");
                    return true;
                }
            }
        }

        return false;
    }
}
