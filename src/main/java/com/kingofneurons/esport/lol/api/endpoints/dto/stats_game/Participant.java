package com.kingofneurons.esport.lol.api.endpoints.dto.stats_game;

import java.util.List;

public class Participant {

    private int participantId;
    private int teamId;
    private int championId;
    private int spell1Id;
    private int spell2Id;
    private String highestAchievedSeasonTier;
    private List<Masterie> masteries;
    private List<Rune> runes;
    private StatsPlayer stats;
    private TimeLine timeline;

    public int getParticipantId() {
        return participantId;
    }

    public int getTeamId() {
        return teamId;
    }

    public int getChampionId() {
        return championId;
    }

    public int getSpell1Id() {
        return spell1Id;
    }

    public int getSpell2Id() {
        return spell2Id;
    }

    public String getHighestAchievedSeasonTier() {
        return highestAchievedSeasonTier;
    }

    public List<Masterie> getMasteries() {
        return masteries;
    }

    public List<Rune> getRunes() {
        return runes;
    }

    public StatsPlayer getStats() {
        return stats;
    }

    public TimeLine getTimeLine() {
        return timeline;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "participantId=" + participantId +
                ", teamId=" + teamId +
                ", championId=" + championId +
                ", spell1Id=" + spell1Id +
                ", spell2Id=" + spell2Id +
                ", highestAchievedSeasonTier='" + highestAchievedSeasonTier + '\'' +
                ", masteries=" + masteries +
                ", runes=" + runes +
                ", stats=" + stats +
                ", timeLine=" + timeline +
                '}';
    }
}
