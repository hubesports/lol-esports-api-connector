package com.kingofneurons.esport.lol.api.endpoints.dto.time_line_stats_game;

public class Events {

    private String type;
    private long timestamp;
    private int participantId;
    private int itemId;

    public String getType() {
        return type;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public int getParticipantId() {
        return participantId;
    }

    public int getItemId() {
        return itemId;
    }

    @Override
    public String toString() {
        return "Events{" +
                "type='" + type + '\'' +
                ", timestamp=" + timestamp +
                ", participantId=" + participantId +
                ", itemId=" + itemId +
                '}';
    }
}
