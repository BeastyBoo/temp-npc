package com.github.beastyboo.npcquest.plugin.quest.completion;

import com.github.beastyboo.npcquest.plugin.NPCQuest;
import com.github.beastyboo.npcquest.plugin.quest.objective.Objective;
import org.bukkit.entity.Player;

public class OnTimer implements Completer {

    private final int secondsUntilExecuted;
    private final NPCQuest core;
    private final Objective objective;

    public OnTimer(int secondsUntilExecuted, NPCQuest core, Objective objective) {
        this.secondsUntilExecuted = secondsUntilExecuted;
        this.core = core;
        this.objective = objective;
    }

    public void execute(Player player) {
        new Countdown(secondsUntilExecuted, core.getPlugin()) {
            @Override
            public void count(int current) {
                if(current == 0) {
                    objective.executeOnComplete(player);
                }
            }
        }.start();
    }

    @Override
    public Objective parentObjective() {
        return objective;
    }
}
