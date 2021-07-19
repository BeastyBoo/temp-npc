package com.github.beastyboo.npcquest.plugin.quest.objective;

import com.github.beastyboo.npcquest.plugin.quest.Stage;
import org.bukkit.entity.Player;

public class HealObjective implements Objective {

    private final int amount;
    private final int secondsUntilExecuted;
    private final Stage stage;

    public HealObjective(int amount, int secondsUntilExecuted, Stage stage) {
        this.amount = amount;
        this.secondsUntilExecuted = secondsUntilExecuted;
        this.stage = stage;
    }

    @Override
    public Stage parentStage() {
        return stage;
    }

    @Override
    public void startObjective(Player player) {
        //TODO: Start OnTimer, run
    }

    @Override
    public void executeOnComplete(Player player) {
        player.setHealth(player.getHealth() + amount);
        //TODO: next stage
    }
}
