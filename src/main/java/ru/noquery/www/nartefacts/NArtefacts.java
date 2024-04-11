package ru.noquery.www.nartefacts;

import org.bukkit.plugin.java.JavaPlugin;
import ru.noquery.www.nartefacts.NCommands.NCommandAS;

public final class NArtefacts extends JavaPlugin {

    @Override
    public void onEnable() {
        instance = this;
        getCommand("arthassword").setExecutor(new NCommandAS());

    }

    @Override
    public void onDisable() {

    }

    public static NArtefacts instance;

}

