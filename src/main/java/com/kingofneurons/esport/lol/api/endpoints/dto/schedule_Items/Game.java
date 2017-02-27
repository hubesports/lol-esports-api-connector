package com.kingofneurons.esport.lol.api.endpoints.dto.schedule_Items;

public class Game {

    private String id;
    private String name;
    private String generatedName;
    private String gameId;
    private String gameRealm;

    private Standings standings;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGeneratedName() {
        return generatedName;
    }

    public String getGameId() {
        return gameId;
    }

    public String getGameRealm() {
        return gameRealm;
    }

    public Standings getStandings() {
        return standings;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", generatedName='" + generatedName + '\'' +
                ", gameId='" + gameId + '\'' +
                ", gameRealm='" + gameRealm + '\'' +
                ", standings=" + standings +
                '}';
    }
}
