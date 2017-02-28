package com.kingofneurons.esport.lol.api.endpoints.dto.time_line_stats_game;

import java.util.List;

public class TimeLineStatsGame {

    private transient String gameHashId;
    private long frameInterval;
    private List<Frames> frames;

    public List<Frames> getFrames() {
        return frames;
    }

    public long getFrameInterval() {
        return frameInterval;
    }

    public String getGameHashId() {
        return gameHashId;
    }

    public void setGameHashId(String gameHashId) {
        this.gameHashId = gameHashId;
    }

    @Override
    public String toString() {
        return "TimeLineStatsGame{" +
                "gameHashId='" + gameHashId + '\'' +
                ", frameInterval=" + frameInterval +
                ", frames=" + frames +
                '}';
    }
}
