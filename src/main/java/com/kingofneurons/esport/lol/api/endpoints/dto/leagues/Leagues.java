package com.kingofneurons.esport.lol.api.endpoints.dto.leagues;

import java.util.List;

public class Leagues {

    private List<League> leagues;

    public void setLeagues(List<League> leagues) {
        this.leagues = leagues;
    }

    public List<League> getLeagues() {
        return leagues;
    }

    @Override
    public String toString() {
        return "Leagues{" +
                "leagues=" + leagues +
                '}';
    }
}
