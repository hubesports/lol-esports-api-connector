package com.kingofneurons.esport.lol.api.endpoints.dto.stats_game;

public class Masterie {

    private int masteryId;
    private int rank;

    public int getMasteryId() {
        return masteryId;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Masterie{" +
                "masteryId=" + masteryId +
                ", rank=" + rank +
                '}';
    }
}
