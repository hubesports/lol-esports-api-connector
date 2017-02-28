package com.kingofneurons.esport.lol.api.endpoints.dto.schedule_Items;

import java.util.Date;

public class ScheduleItem {

    private String id;
    private Date scheduledTime;
    private String match;
    private String bracket;
    private String tournament;
    private String league;
    private Tags tags;
    transient private int teamIdOne;
    transient private int teamIdTwo;

    public String getId() {
        return id;
    }

    public Date getScheduledTime() {
        return scheduledTime;
    }

    public String getMatch() {
        return match;
    }

    public String getBracket() {
        return bracket;
    }

    public Tags getTags() {
        return tags;
    }

    public String getTournament() {
        return tournament;
    }

    public String getLeague() {
        return league;
    }

    public int getTeamIdOne() {
        return teamIdOne;
    }

    public void setTeamIdOne(int teamIdOne) {
        this.teamIdOne = teamIdOne;
    }

    public int getTeamIdTwo() {
        return teamIdTwo;
    }

    public void setTeamIdTwo(int teamIdTwo) {
        this.teamIdTwo = teamIdTwo;
    }

    @Override
    public String toString() {
        return "ScheduleItem{" +
                "id='" + id + '\'' +
                ", scheduledTime=" + scheduledTime +
                ", match='" + match + '\'' +
                ", bracket='" + bracket + '\'' +
                ", tournament='" + tournament + '\'' +
                ", league='" + league + '\'' +
                ", tags=" + tags +
                ", teamIdOne=" + teamIdOne +
                ", teamIdTwo=" + teamIdTwo +
                '}';
    }
}
