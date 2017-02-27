package com.kingofneurons.esport.lol.api.endpoints.dto.stats_game;

public class Player {

    private String summonerName;
    private int profileIcon;

    public String getSummonerName() {
        return summonerName;
    }

    public int getProfileIcon() {
        return profileIcon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "summonerName='" + summonerName + '\'' +
                ", profileIcon=" + profileIcon +
                '}';
    }
}
