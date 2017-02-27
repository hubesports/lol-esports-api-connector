package com.kingofneurons.esport.lol.api.endpoints.dto.schedule_Items;

public class Input {

    private String roster;

    public String getRoster() {
        return roster;
    }

    @Override
    public String toString() {
        return "Input{" +
                "roster='" + roster + '\'' +
                '}';
    }
}
