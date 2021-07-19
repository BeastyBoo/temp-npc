package com.github.beastyboo.npcquest.plugin.user;
import com.github.beastyboo.npcquest.plugin.NPCQuest;
import com.github.beastyboo.npcquest.plugin.quest.Quest;
import org.bukkit.entity.Player;

import java.util.UUID;

public class UserQuest extends Quest {

    private final UUID uuid;
    private final NPCQuest core;

    public UserQuest(UUID uuid, NPCQuest core, Quest quest) {
        super(quest.getName(), quest.getStages(), quest.getFirstStage());
        this.uuid = uuid;
        this.core = core;
    }

    public UUID getUuid() {
        return uuid;
    }

    public NPCQuest getCore() {
        return core;
    }

    public void startQuest(Player player) {
        getFirstStage().startStage(player);
    }
}
