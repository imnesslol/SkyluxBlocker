package com.imnesslol.skyluxblocker;

import com.imnesslol.skyluxblocker.listener.PlayerInteractListener;
import com.imnesslol.skyluxblocker.manager.ConfigManager;

import org.bukkit.plugin.java.JavaPlugin;

public final class SkyluxBlocker extends JavaPlugin {

    @Override
    public void onEnable() {
        ConfigManager.setupConfig(this);

        getServer().getPluginManager().registerEvents(new PlayerInteractListener(this), this);
        getServer().getLogger().info("Thank you for choosing SkyluxBlocker");
        getServer().getLogger().info("Skylux Network is a Minecraft 1.8 minigame server!");
    }
}
