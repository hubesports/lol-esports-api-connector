package com.kingofneurons.esport.lol.api.endpoints.dto.highlander_match_details;

public class GameMapping {

    private String id;
    private String gameHash;

    public String getId() {
        return id;
    }

    public String getGameHash() {
        return gameHash;
    }

    @Override
    public String toString() {
        return "GameMapping{" +
                "id='" + id + '\'' +
                ", gameHash='" + gameHash + '\'' +
                '}';
    }
}
