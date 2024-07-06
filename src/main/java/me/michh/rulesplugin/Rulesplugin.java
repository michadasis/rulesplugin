package me.michh.rulesplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class Rulesplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Rules plugin enabled successfully.");
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (command.getName().equalsIgnoreCase("rules")){
            if (sender instanceof Player){
                Player p = (Player) sender;
                p.sendMessage(ChatColor.RED + "Kanones:" +
                        ChatColor.YELLOW + "1." + ChatColor.WHITE + "Mhn xrisimopoieite hacked clients\n" +
                        ChatColor.YELLOW + "2." + ChatColor.WHITE + "Mhn xrhsimopoieite xray\n" +
                        ChatColor.YELLOW + "3." + ChatColor.WHITE + "Mhn kanete underground bases\n" +
                        ChatColor.YELLOW + "4." + ChatColor.WHITE + "Mhn kanete exploit to heart system\n" +
                        ChatColor.YELLOW + "5." + ChatColor.WHITE + "To fullbright kai ta autoclickers epitreponte\n");
            }
        }


        return true;
    }
}
