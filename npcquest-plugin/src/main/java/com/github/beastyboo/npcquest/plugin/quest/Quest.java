package com.github.beastyboo.npcquest.plugin.quest;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Quest {

    private final String name;
    private final Map<String, Stage> stages;
    private final Stage firstStage;

    public Quest(String name, Map<String, Stage> stages, Stage firstStage) {
        this.name = name;
        this.stages = stages;
        this.firstStage = firstStage;
    }

    public Quest(String name) {
        this(name, new HashMap<>(), null);
    }

    public String getName() {
        return name;
    }

    public Map<String, Stage> getStages() {
        return Map.copyOf(stages);
    }

    public Stage getFirstStage() {
        return firstStage;
    }

    public void addStage(Stage stage) {
        if(getStage(stage.getName()) != null) {
            return;
        }

        stages.put(stage.getName().toLowerCase(), stage);
    }

    public void removeStage(String stageName) {
        if(getStage(stageName) == null) {
            return;
        }
        stages.remove(stageName.toLowerCase());
    }

    public Quest setFirstStage(String stageName) {
        Stage stage = getStage(stageName);

        if(stage == null) {
            return null;
        }

        return new Quest(name, stages, stage);
    }

    public Stage getStage(String stageName) {
        return stages.get(stageName.toLowerCase());
    }

    @Override
    public String toString() {
        return "Quest{" +
                "name='" + name + '\'' +
                ", stages=" + stages +
                ", firstStage=" + firstStage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quest quest = (Quest) o;
        return name.equals(quest.name) && stages.equals(quest.stages) && Objects.equals(firstStage, quest.firstStage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stages, firstStage);
    }
}
