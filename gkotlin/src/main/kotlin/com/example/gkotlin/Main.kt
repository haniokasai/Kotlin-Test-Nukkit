package com.example.gkotlin

import cn.nukkit.event.Listener
import cn.nukkit.plugin.PluginBase

/**
 * Created by hani on 2017/01/29.
 */
class Main : PluginBase() , Listener {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("Hello Kotlin!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}