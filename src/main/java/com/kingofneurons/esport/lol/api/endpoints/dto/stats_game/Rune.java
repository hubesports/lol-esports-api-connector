package com.kingofneurons.esport.lol.api.endpoints.dto.stats_game;

public class Rune {

    private int runeId;
    private int rank;

    public int getRuneId() {
        return runeId;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Rune{" +
                "runeId=" + runeId +
                ", rank=" + rank +
                '}';
    }
}
