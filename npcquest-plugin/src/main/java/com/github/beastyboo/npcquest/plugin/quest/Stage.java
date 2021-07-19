package com.github.beastyboo.npcquest.plugin.quest;

import com.github.beastyboo.npcquest.plugin.quest.objective.Objective;

import java.util.Objects;

public class Stage {

    private final String name;
    private final Objective objective;
    private final Stage nextStage;

    public Stage(String name, Objective objective, Stage nextStage) {
        this.name = name;
        this.objective = objective;
        this.nextStage = nextStage;
    }

    public Stage(String name) {
        this(name, null, null);
    }

    public String getName() {
        return name;
    }

    public Objective getObjective() {
        return objective;
    }

    public Stage setObjective(Objective objective) {
        return new Stage(name, objective, nextStage);
    }

    public Stage getNextStage() {
        return nextStage;
    }

    public Stage setNextStage(Stage stage) {
        return new Stage(name, objective, stage);
    }

    @Override
    public String toString() {
        return "Stage{" +
                "name='" + name + '\'' +
                ", objective=" + objective +
                ", nextStage=" + nextStage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stage stage = (Stage) o;
        return name.equals(stage.name) && Objects.equals(objective, stage.objective) && Objects.equals(nextStage, stage.nextStage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, objective, nextStage);
    }

}
