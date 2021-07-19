package com.github.beastyboo.npcquest.plugin.quest.objective;

import com.github.beastyboo.npcquest.plugin.quest.Stage;
import org.bukkit.entity.Player;

public interface Objective {

    //Completer execute();

    Stage parentStage();

    void executeOnComplete(Player player);

}
