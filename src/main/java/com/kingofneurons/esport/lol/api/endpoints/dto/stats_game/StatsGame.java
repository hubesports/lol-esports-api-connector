package com.kingofneurons.esport.lol.api.endpoints.dto.stats_game;

import java.util.List;

public class StatsGame {

    private transient String gameHashId;
    private long gameId;
    private String platformId;
    private long gameCreation;
    private long gameDuration;
    private long queueId;
    private int mapId;
    private int seasonId;
    private String gameVersion;
    private String gameMode;
    private String gameType;

    private List<Team> teams;
    private List<Participant> participants;
    private List<ParticipantIdentities> participantIdentities;

    public long getGameId() {
        return gameId;
    }

    public String getPlatformId() {
        return platformId;
    }

    public long getGameCreation() {
        return gameCreation;
    }

    public long getGameDuration() {
        return gameDuration;
    }

    public long getQueueId() {
        return queueId;
    }

    public int getMapId() {
        return mapId;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public String getGameMode() {
        return gameMode;
    }

    public String getGameType() {
        return gameType;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public List<Participant> getParticipant() {
        return participants;
    }

    public List<ParticipantIdentities> getParticipantIdentities() {
        return participantIdentities;
    }

    public String getGameHashId() {
        return gameHashId;
    }

    public void setGameHashId(String gameHashId) {
        this.gameHashId = gameHashId;
    }

    @Override
    public String toString() {
        return "StatsGame{" +
                "gameHashId='" + gameHashId + '\'' +
                ", gameId=" + gameId +
                ", platformId='" + platformId + '\'' +
                ", gameCreation=" + gameCreation +
                ", gameDuration=" + gameDuration +
                ", queueId=" + queueId +
                ", mapId=" + mapId +
                ", seasonId=" + seasonId +
                ", gameVersion='" + gameVersion + '\'' +
                ", gameMode='" + gameMode + '\'' +
                ", gameType='" + gameType + '\'' +
                ", teams=" + teams +
                ", participants=" + participants +
                ", participantIdentities=" + participantIdentities +
                '}';
    }
}
