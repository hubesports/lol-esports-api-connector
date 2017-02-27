package com.kingofneurons.esport.lol.api.endpoints.dto.teams;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection="lol_team")
public class Team {

    @Id private int id;
    private String slug;
    @TextIndexed private String name;
    private String teamPhotoUrl;
    private String logoUrl;
    @TextIndexed private String acronym;
    private List<Integer> players;
    private List<Integer> starters;
    private List<Integer> subs;

    public int getId() {
        return id;
    }

    public String getSlug() {
        return slug;
    }

    public String getName() {
        return name;
    }

    public String getTeamPhotoUrl() {
        return teamPhotoUrl;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public String getAcronym() {
        return acronym;
    }

    public List<Integer> getPlayers() {
        return players;
    }

    public List<Integer> getStarters() {
        return starters;
    }

    public List<Integer> getSubs() {
        return subs;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", slug='" + slug + '\'' +
                ", name='" + name + '\'' +
                ", teamPhotoUrl='" + teamPhotoUrl + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", acronym='" + acronym + '\'' +
                ", players=" + players +
                ", starters=" + starters +
                ", subs=" + subs +
                '}';
    }
}
