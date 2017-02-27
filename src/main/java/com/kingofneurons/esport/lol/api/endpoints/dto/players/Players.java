package com.kingofneurons.esport.lol.api.endpoints.dto.players;

import java.util.List;

public class Players {

    private List<Player> players;

    public List<Player> getPlayers() {
        return players;
    }

    @Override
    public String toString() {
        return "Players{" +
                "players=" + players +
                '}';
    }
}
