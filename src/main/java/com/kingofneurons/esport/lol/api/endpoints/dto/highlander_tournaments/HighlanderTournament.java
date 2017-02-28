package com.kingofneurons.esport.lol.api.endpoints.dto.highlander_tournaments;

import java.util.List;
import java.util.Map;

public class HighlanderTournament {

     private String id;
    private String title;
    private String description;
    private String startDate;
    private String endDate;
    private String league;

    private Map<String, Roster> rosters;
    private Map<String, Bracket> brackets;
    private List<String> liveMatches;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public Map<String, Roster> getRosters() {
        return rosters;
    }

    public Map<String, Bracket> getBrackets() {
        return brackets;
    }

    public List<String> getLiveMatches() {
        return liveMatches;
    }

    public String getLeague() {
        return league;
    }

    @Override
    public String toString() {
        return "HighlanderTournament{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", league='" + league + '\'' +
                ", rosters=" + rosters +
                ", brackets=" + brackets +
                ", liveMatches=" + liveMatches +
                '}';
    }
}
