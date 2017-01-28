package my.test.plugin.tutorialplugin

import cn.nukkit.plugin.PluginBase

/**
 * Created by hani on 2017/01/28.
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