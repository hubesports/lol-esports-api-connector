package com.kingofneurons.esport.lol.api.endpoints.dto.time_line_stats_game;

public class ParticipantFrame {

    private int participantId;
    private int currentGold;
    private int totalGold;
    private int level;
    private int xp;
    private int minionsKilled;
    private int jungleMinionsKilled;
    private int dominionScore;
    private int teamScore;
    private Position position;

    public int getParticipantId() {
        return participantId;
    }

    public int getCurrentGold() {
        return currentGold;
    }

    public int getTotalGold() {
        return totalGold;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public int getMinionsKilled() {
        return minionsKilled;
    }

    public int getJungleMinionsKilled() {
        return jungleMinionsKilled;
    }

    public int getDominionScore() {
        return dominionScore;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "ParticipantFrame{" +
                "participantId=" + participantId +
                ", currentGold=" + currentGold +
                ", totalGold=" + totalGold +
                ", level=" + level +
                ", xp=" + xp +
                ", minionsKilled=" + minionsKilled +
                ", jungleMinionsKilled=" + jungleMinionsKilled +
                ", dominionScore=" + dominionScore +
                ", teamScore=" + teamScore +
                ", position=" + position +
                '}';
    }
}
