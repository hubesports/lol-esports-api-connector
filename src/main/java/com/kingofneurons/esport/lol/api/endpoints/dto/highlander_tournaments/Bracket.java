package com.kingofneurons.esport.lol.api.endpoints.dto.highlander_tournaments;

import com.kingofneurons.esport.lol.api.endpoints.dto.schedule_Items.GameMod;
import com.kingofneurons.esport.lol.api.endpoints.dto.schedule_Items.Match;

import java.util.Map;

public class Bracket {

    private String id;
    private String name;
    private int position;
    private int groupPosition;
    private String groupName;
    private boolean canManufacture;
    private String state;
    private Map<String, Integer> matchScores;

    private GameMod gameMode;
    private Map<String, Match> matches;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int getGroupPosition() {
        return groupPosition;
    }

    public String getGroupName() {
        return groupName;
    }

    public boolean isCanManufacture() {
        return canManufacture;
    }

    public String getState() {
        return state;
    }

    public GameMod getGameMode() {
        return gameMode;
    }

    public Map<String, Match> getMatches() {
        return matches;
    }

    @Override
    public String toString() {
        return "Bracket{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", position=" + position +
                ", groupPosition=" + groupPosition +
                ", groupName='" + groupName + '\'' +
                ", canManufacture=" + canManufacture +
                ", state='" + state + '\'' +
                ", gameMode=" + gameMode +
                ", matches=" + matches +
                '}';
    }
}
