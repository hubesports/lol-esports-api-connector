package com.kingofneurons.esport.lol.api.endpoints.dto.schedule_Items;

import java.util.List;
import java.util.Map;

public class Match {

    private String id;
    private String name;
    private int position;
    private String state;
    private int groupPosition;

    private List<Input> input;
    private MatchType matchType;
    private Map<String, Game> games;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public String getState() {
        return state;
    }

    public int getGroupPosition() {
        return groupPosition;
    }

    public List<Input> getInput() {
        return input;
    }

    public MatchType getMatchType() {
        return matchType;
    }

    public Map<String, Game> getGames() {
        return games;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", position=" + position +
                ", state='" + state + '\'' +
                ", groupPosition=" + groupPosition +
                ", input=" + input +
                ", matchType=" + matchType +
                ", games=" + games +
                '}';
    }
}
