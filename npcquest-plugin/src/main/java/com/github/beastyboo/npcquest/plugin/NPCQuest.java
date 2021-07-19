package com.github.beastyboo.npcquest.plugin;

import com.github.beastyboo.npcquest.api.QuestAPI;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class NPCQuest implements QuestAPI {

    private final JavaPlugin plugin;
    private final Logger logger;

    public NPCQuest(JavaPlugin plugin) {
        this.plugin = plugin;
        this.logger = plugin.getLogger();
    }

    void load() {

    }

    void close() {

    }

    public JavaPlugin getPlugin() {
        return plugin;
    }

    public Logger getLogger() {
        return logger;
    }
}
