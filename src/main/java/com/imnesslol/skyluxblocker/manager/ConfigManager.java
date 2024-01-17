package com.imnesslol.skyluxblocker.manager;

import com.imnesslol.skyluxblocker.SkyluxBlocker;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

public class ConfigManager {

    private static FileConfiguration config;
    private static List<String> blockedBlocks;

    public static void setupConfig (SkyluxBlocker sb) {
        ConfigManager.config = sb.getConfig();
        blockedBlocks = config.getStringList("blocked-blocks");
        sb.saveDefaultConfig();
    }

    public static List<String> getBlockedBlocks() { return blockedBlocks; }

}
