package com.kingofneurons.esport.lol.api.endpoints.dto.highlander_match_details;

import java.util.List;

public class HighlanderMatchDetails {

    private transient String idMatch;
    private transient String idTournament;
    private List<GameMapping> gameIdMappings;
    private List<Video> videos;

    public String getIdMatch() {
        return idMatch;
    }

    public String getIdTournament() {
        return idTournament;
    }

    public List<GameMapping> getGameIdMappings() {
        return gameIdMappings;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setIdMatch(String idMatch) {
        this.idMatch = idMatch;
    }

    public void setIdTournament(String idTournament) {
        this.idTournament = idTournament;
    }

    @Override
    public String toString() {
        return "HighlanderMatchDetails{" +
                "idMatch='" + idMatch + '\'' +
                ", idTournament='" + idTournament + '\'' +
                ", gameIdMappings=" + gameIdMappings +
                ", videos=" + videos +
                '}';
    }
}
