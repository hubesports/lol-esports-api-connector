package com.kingofneurons.esport.lol.api.endpoints.dto.stats_game;

import java.util.Map;

public class TimeLine {
    private int participantId;
    private String role;
    private String lane;

    /*Can:
    * 30-end
    * 10-20
    * 20-30
    * 0-10 */
    private Map<String, Double> creepsPerMinDeltas;
    private Map<String, Double> xpPerMinDeltas;
    private Map<String, Double> goldPerMinDeltas;
    private Map<String, Double> csDiffPerMinDeltas;
    private Map<String, Double> xpDiffPerMinDeltas;
    private Map<String, Double> damageTakenPerMinDeltas;
    private Map<String, Double> damageTakenDiffPerMinDeltas;

    public int getParticipantId() {
        return participantId;
    }

    public String getRole() {
        return role;
    }

    public String getLane() {
        return lane;
    }

    public Map<String, Double> getCreepsPerMinDeltas() {
        return creepsPerMinDeltas;
    }

    public Map<String, Double> getXpPerMinDeltas() {
        return xpPerMinDeltas;
    }

    public Map<String, Double> getGoldPerMinDeltas() {
        return goldPerMinDeltas;
    }

    public Map<String, Double> getCsDiffPerMinDeltas() {
        return csDiffPerMinDeltas;
    }

    public Map<String, Double> getXpDiffPerMinDeltas() {
        return xpDiffPerMinDeltas;
    }

    public Map<String, Double> getDamageTakenPerMinDeltas() {
        return damageTakenPerMinDeltas;
    }

    public Map<String, Double> getDamageTakenDiffPerMinDeltas() {
        return damageTakenDiffPerMinDeltas;
    }

    @Override
    public String toString() {
        return "TimeLine{" +
                "participantId=" + participantId +
                ", role='" + role + '\'' +
                ", lane='" + lane + '\'' +
                ", creepsPerMinDeltas=" + creepsPerMinDeltas +
                ", xpPerMinDeltas=" + xpPerMinDeltas +
                ", goldPerMinDeltas=" + goldPerMinDeltas +
                ", csDiffPerMinDeltas=" + csDiffPerMinDeltas +
                ", xpDiffPerMinDeltas=" + xpDiffPerMinDeltas +
                ", damageTakenPerMinDeltas=" + damageTakenPerMinDeltas +
                ", damageTakenDiffPerMinDeltas=" + damageTakenDiffPerMinDeltas +
                '}';
    }
}
