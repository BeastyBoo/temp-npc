package com.github.beastyboo.npcquest.plugin.quest.objective;

import com.github.beastyboo.npcquest.plugin.quest.Stage;
import org.bukkit.entity.Player;

public interface Objective {

    Stage parentStage();

    void startObjective(Player player);

    void executeOnComplete(Player player);

}
