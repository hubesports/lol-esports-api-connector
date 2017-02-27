package com.kingofneurons.esport.lol.api.endpoints.dto.stats_game;

import java.util.List;

public class Team {

    private long teamId;
    private String win;
    private boolean firstBlood;
    private boolean firstTower;
    private boolean firstInhibitor;
    private boolean firstBaron;
    private boolean firstDragon;
    private boolean firstRiftHerald;
    private int towerKills;
    private int inhibitorKills;
    private int baronKills;
    private int dragonKills;
    private int vilemawKills;
    private int riftHeraldKills;
    private int dominionVictoryScore;
    private List<Ban> bans;

    public long getTeamId() {
        return teamId;
    }

    public String getWin() {
        return win;
    }

    public boolean isFirstBlood() {
        return firstBlood;
    }

    public boolean isFirstTower() {
        return firstTower;
    }

    public boolean isFirstInhibitor() {
        return firstInhibitor;
    }

    public boolean isFirstBaron() {
        return firstBaron;
    }

    public boolean isFirstDragon() {
        return firstDragon;
    }

    public boolean isFirstRiftHerald() {
        return firstRiftHerald;
    }

    public int getTowerKills() {
        return towerKills;
    }

    public int getInhibitorKills() {
        return inhibitorKills;
    }

    public int getBaronKills() {
        return baronKills;
    }

    public int getDragonKills() {
        return dragonKills;
    }

    public int getVilemawKills() {
        return vilemawKills;
    }

    public int getRiftHeraldKills() {
        return riftHeraldKills;
    }

    public int getDominionVictoryScore() {
        return dominionVictoryScore;
    }

    public List<Ban> getBans() {
        return bans;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", win='" + win + '\'' +
                ", firstBlood=" + firstBlood +
                ", firstTower=" + firstTower +
                ", firstInhibitor=" + firstInhibitor +
                ", firstBaron=" + firstBaron +
                ", firstDragon=" + firstDragon +
                ", firstRiftHerald=" + firstRiftHerald +
                ", towerKills=" + towerKills +
                ", inhibitorKills=" + inhibitorKills +
                ", baronKills=" + baronKills +
                ", dragonKills=" + dragonKills +
                ", vilemawKills=" + vilemawKills +
                ", riftHeraldKills=" + riftHeraldKills +
                ", dominionVictoryScore=" + dominionVictoryScore +
                ", bans=" + bans +
                '}';
    }
}
