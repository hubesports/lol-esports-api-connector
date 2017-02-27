package com.kingofneurons.esport.lol.api.endpoints.dto.stats_game;

public class Ban {

    private int championId;
    private int pickTurn;

    public int getChampionId() {
        return championId;
    }

    public int getPickTurn() {
        return pickTurn;
    }

    @Override
    public String toString() {
        return "Ban{" +
                "championId=" + championId +
                ", pickTurn=" + pickTurn +
                '}';
    }
}
