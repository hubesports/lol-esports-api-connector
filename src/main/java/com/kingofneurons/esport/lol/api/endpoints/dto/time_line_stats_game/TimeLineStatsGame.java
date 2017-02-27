package com.kingofneurons.esport.lol.api.endpoints.dto.time_line_stats_game;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection="lol_timeLineStatsGame")
public class TimeLineStatsGame {

    @Id private transient String gameHashId;
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
