package ru.noquery.www.nartefacts;

import org.bukkit.plugin.java.JavaPlugin;

public final class NArtefacts extends JavaPlugin {

    @Override
    public void onEnable() {
        instance = this;

    }

    @Override
    public void onDisable() {

    }

    public static NArtefacts instance;

}

