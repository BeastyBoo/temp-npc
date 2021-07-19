package com.github.beastyboo.npcquest.plugin;

import com.github.beastyboo.npcquest.api.QuestAPI;
import com.github.beastyboo.npcquest.api.QuestPlugin;
import org.bukkit.plugin.java.JavaPlugin;

public class NPCQuestPlugin extends JavaPlugin implements QuestPlugin {

    private NPCQuest core;

    @Override
    public void onEnable() {
        core = new NPCQuest(this);
        core.load();
    }

    @Override
    public void onDisable() {
        core.close();
        core = null;
    }

    @Override
    public QuestAPI getQuestAPI() {
        return core;
    }
}
