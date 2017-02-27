package com.kingofneurons.esport.lol.api.endpoints.dto.time_line_stats_game;

import java.util.List;
import java.util.Map;

public class Frames {

    private long timestamp;
    private Map<Integer, ParticipantFrame> participantFrames;
    private List<Events> events;

    public long getTimestamp() {
        return timestamp;
    }

    public Map<Integer, ParticipantFrame> getParticipantFrames() {
        return participantFrames;
    }

    public List<Events> getEvents() {
        return events;
    }

    @Override
    public String toString() {
        return "Frames{" +
                "timestamp=" + timestamp +
                ", participantFrames=" + participantFrames +
                ", events=" + events +
                '}';
    }
}
