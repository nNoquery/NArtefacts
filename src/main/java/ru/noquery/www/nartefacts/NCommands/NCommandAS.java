package ru.noquery.www.nartefacts.NCommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import ru.noquery.www.nartefacts.Weapons.ArthasSword;

public class NCommandAS implements CommandExecutor {
    @Override
    public boolean onCommand
            (
            @NotNull CommandSender sender, 
            @NotNull Command command, 
            @NotNull String label, 
            @NotNull String[] args) 
    {
        if (sender instanceof Player player){
            player.getInventory().addItem(new ArthasSword().getItem());
        }
        return true;
    }
}
