package com.kingofneurons.esport.lol.api.endpoints.dto.schedule_Items;

import com.kingofneurons.esport.lol.api.endpoints.dto.highlander_tournaments.HighlanderTournament;
import com.kingofneurons.esport.lol.api.endpoints.dto.teams.Team;

import java.util.List;

public class ScheduleItems {

    private List<Team> teams;
    private List<ScheduleItem> scheduleItems;
    private List<HighlanderTournament> highlanderTournaments;

    public List<Team> getTeams() {
        return teams;
    }

    public List<ScheduleItem> getScheduleItems() {
        return scheduleItems;
    }

    public List<HighlanderTournament> getHighlanderTournaments() {
        return highlanderTournaments;
    }

    @Override
    public String toString() {
        return "ScheduleItems{" +
                "teams=" + teams +
                ", schedule_Items=" + scheduleItems +
                ", highlanderTournaments=" + highlanderTournaments +
                '}';
    }
}
