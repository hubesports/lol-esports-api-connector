package com.kingofneurons.esport.lol.api.endpoints.dto.schedule_Items;

public class    GameMod {

    private String identifier;
    private int requiredPlayers;
    private String mapName;
    private int requiredTeams;

    public String getIdentifier() {
        return identifier;
    }

    public int getRequiredPlayers() {
        return requiredPlayers;
    }

    public String getMapName() {
        return mapName;
    }

    public int getRequiredTeams() {
        return requiredTeams;
    }

    @Override
    public String toString() {
        return "GameMod{" +
                "identifier='" + identifier + '\'' +
                ", requiredPlayers=" + requiredPlayers +
                ", mapName='" + mapName + '\'' +
                ", requiredTeams=" + requiredTeams +
                '}';
    }
}
