package com.kingofneurons.esport.lol.api.endpoints.dto.stats_game;

public class ParticipantIdentities {

    private int participantId;
    private Player player;

    public int getParticipantId() {
        return participantId;
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public String toString() {
        return "ParticipantIdentities{" +
                "participantId=" + participantId +
                ", player=" + player +
                '}';
    }
}
