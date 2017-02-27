package com.kingofneurons.esport.lol.api.endpoints.dto.schedule_Items;

public class Result {

    private String roster;
    private String breakpoint;
    private int standing;

    public String getRoster() {
        return roster;
    }

    public String getBreakpoint() {
        return breakpoint;
    }

    public int getStanding() {
        return standing;
    }

    @Override
    public String toString() {
        return "Result{" +
                "roster='" + roster + '\'' +
                ", breakpoint='" + breakpoint + '\'' +
                ", standing=" + standing +
                '}';
    }
}
