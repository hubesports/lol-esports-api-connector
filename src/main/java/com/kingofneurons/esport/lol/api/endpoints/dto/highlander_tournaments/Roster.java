package com.kingofneurons.esport.lol.api.endpoints.dto.highlander_tournaments;

public class Roster {

    private String id;
    private String name;
    private int team;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "Roster{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
