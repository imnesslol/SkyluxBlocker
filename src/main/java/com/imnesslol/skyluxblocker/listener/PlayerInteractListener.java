package com.imnesslol.skyluxblocker.listener;

import com.imnesslol.skyluxblocker.SkyluxBlocker;
import com.imnesslol.skyluxblocker.manager.ConfigManager;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.List;

public class PlayerInteractListener implements Listener {

    private SkyluxBlocker sb;

    public PlayerInteractListener (SkyluxBlocker sb) {
        this.sb = sb;
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            Block clickedBlock = e.getClickedBlock();
            Material clickedBlockType = clickedBlock.getType();

            List<String> blockedBlocks = ConfigManager.getBlockedBlocks();
            if (blockedBlocks.contains(clickedBlockType.name())) {
                e.setCancelled(true);
            }
        }
    }

}
