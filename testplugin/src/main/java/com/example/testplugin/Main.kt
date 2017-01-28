package com.example.testplugin

import cn.nukkit.Player;
import cn.nukkit.block.Block;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerInteractEvent;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
/**
 * Created by hani on 2017/01/29.
 */
class Main : PluginBase() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("Hello Kotlin!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}