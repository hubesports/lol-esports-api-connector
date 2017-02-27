package com.kingofneurons.esport.lol.api.endpoints.dto.stats_game;

public class StatsPlayer {

    private int participantId;
    private boolean win;
    private int item0;
    private int item1;
    private int item2;
    private int item3;
    private int item4;
    private int item5;
    private int item6;
    private int kills;
    private int deaths;
    private int assists;
    private int largestKillingSpree;
    private int largestMultiKill;
    private int killingSprees;
    private int longestTimeSpentLiving;
    private int doubleKills;
    private int tripleKills;
    private int quadraKills;
    private int pentaKills;
    private int unrealKills;
    private int totalDamageDealt;
    private int magicDamageDealt;
    private int physicalDamageDealt;
    private int trueDamageDealt;
    private int largestCriticalStrike;
    private int totalDamageDealtToChampions;
    private int magicDamageDealtToChampions;
    private int physicalDamageDealtToChampions;
    private int trueDamageDealtToChampions;
    private int totalHeal;
    private int totalUnitsHealed;
    private int totalDamageTaken;
    private int magicalDamageTaken;
    private int physicalDamageTaken;
    private int trueDamageTaken;
    private int goldEarned;
    private int goldSpent;
    private int turretKills;
    private int inhibitorKills;
    private int totalMinionsKilled;
    private int neutralMinionsKilled;
    private int neutralMinionsKilledTeamJungle;
    private int neutralMinionsKilledEnemyJungle;
    private int totalTimeCrowdControlDealt;
    private int champLevel;
    private int visionWardsBoughtInGame;
    private int sightWardsBoughtInGame;
    private int wardsPlaced;
    private int wardsKilled;
    private boolean firstBloodKill;
    private boolean firstBloodAssist;
    private boolean firstTowerKill;
    private boolean firstTowerAssist;
    private boolean firstInhibitorKill;
    private boolean firstInhibitorAssist;
    private int combatPlayerScore;
    private int objectivePlayerScore;
    private int totalPlayerScore;
    private int totalScoreRank;

    public int getParticipantId() {
        return participantId;
    }

    public boolean isWin() {
        return win;
    }

    public int getItem0() {
        return item0;
    }

    public int getItem1() {
        return item1;
    }

    public int getItem2() {
        return item2;
    }

    public int getItem3() {
        return item3;
    }

    public int getItem4() {
        return item4;
    }

    public int getItem5() {
        return item5;
    }

    public int getItem6() {
        return item6;
    }

    public int getKills() {
        return kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getAssists() {
        return assists;
    }

    public int getLargestKillingSpree() {
        return largestKillingSpree;
    }

    public int getLargestMultiKill() {
        return largestMultiKill;
    }

    public int getKillingSprees() {
        return killingSprees;
    }

    public int getLongestTimeSpentLiving() {
        return longestTimeSpentLiving;
    }

    public int getDoubleKills() {
        return doubleKills;
    }

    public int getTripleKills() {
        return tripleKills;
    }

    public int getQuadraKills() {
        return quadraKills;
    }

    @Override
    public String toString() {
        return "StatsPlayer{" +
                "participantId=" + participantId +
                ", win=" + win +
                ", item0=" + item0 +
                ", item1=" + item1 +
                ", item2=" + item2 +
                ", item3=" + item3 +
                ", item4=" + item4 +
                ", item5=" + item5 +
                ", item6=" + item6 +
                ", kills=" + kills +
                ", deaths=" + deaths +
                ", assists=" + assists +
                ", largestKillingSpree=" + largestKillingSpree +
                ", largestMultiKill=" + largestMultiKill +
                ", killingSprees=" + killingSprees +
                ", longestTimeSpentLiving=" + longestTimeSpentLiving +
                ", doubleKills=" + doubleKills +
                ", tripleKills=" + tripleKills +
                ", quadraKills=" + quadraKills +
                ", pentaKills=" + pentaKills +
                ", unrealKills=" + unrealKills +
                ", totalDamageDealt=" + totalDamageDealt +
                ", magicDamageDealt=" + magicDamageDealt +
                ", physicalDamageDealt=" + physicalDamageDealt +
                ", trueDamageDealt=" + trueDamageDealt +
                ", largestCriticalStrike=" + largestCriticalStrike +
                ", totalDamageDealtToChampions=" + totalDamageDealtToChampions +
                ", magicDamageDealtToChampions=" + magicDamageDealtToChampions +
                ", physicalDamageDealtToChampions=" + physicalDamageDealtToChampions +
                ", trueDamageDealtToChampions=" + trueDamageDealtToChampions +
                ", totalHeal=" + totalHeal +
                ", totalUnitsHealed=" + totalUnitsHealed +
                ", totalDamageTaken=" + totalDamageTaken +
                ", magicalDamageTaken=" + magicalDamageTaken +
                ", physicalDamageTaken=" + physicalDamageTaken +
                ", trueDamageTaken=" + trueDamageTaken +
                ", goldEarned=" + goldEarned +
                ", goldSpent=" + goldSpent +
                ", turretKills=" + turretKills +
                ", inhibitorKills=" + inhibitorKills +
                ", totalMinionsKilled=" + totalMinionsKilled +
                ", neutralMinionsKilled=" + neutralMinionsKilled +
                ", neutralMinionsKilledTeamJungle=" + neutralMinionsKilledTeamJungle +
                ", neutralMinionsKilledEnemyJungle=" + neutralMinionsKilledEnemyJungle +
                ", totalTimeCrowdControlDealt=" + totalTimeCrowdControlDealt +
                ", champLevel=" + champLevel +
                ", visionWardsBoughtInGame=" + visionWardsBoughtInGame +
                ", sightWardsBoughtInGame=" + sightWardsBoughtInGame +
                ", wardsPlaced=" + wardsPlaced +
                ", wardsKilled=" + wardsKilled +
                ", firstBloodKill=" + firstBloodKill +
                ", firstBloodAssist=" + firstBloodAssist +
                ", firstTowerKill=" + firstTowerKill +
                ", firstTowerAssist=" + firstTowerAssist +
                ", firstInhibitorKill=" + firstInhibitorKill +
                ", firstInhibitorAssist=" + firstInhibitorAssist +
                ", combatPlayerScore=" + combatPlayerScore +
                ", objectivePlayerScore=" + objectivePlayerScore +
                ", totalPlayerScore=" + totalPlayerScore +
                ", totalScoreRank=" + totalScoreRank +
                '}';
    }
}
