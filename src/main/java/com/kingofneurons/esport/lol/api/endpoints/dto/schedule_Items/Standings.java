package com.kingofneurons.esport.lol.api.endpoints.dto.schedule_Items;

import java.util.List;

public class Standings {

    private float timestamp;
    private List<List<Result>> result;

    public float getTimestamp() {
        return timestamp;
    }

    public List<List<Result>> getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "Standings{" +
                "timestamp=" + timestamp +
                ", result=" + result +
                '}';
    }
}
