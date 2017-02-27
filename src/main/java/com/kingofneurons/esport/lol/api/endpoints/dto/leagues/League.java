package com.kingofneurons.esport.lol.api.endpoints.dto.leagues;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Document(collection="lol_league")
public class League {

    @Id private int id;
    private String slug;
    @TextIndexed private String name;
    private String region;
    private String logoUrl;
    private String createdAt;
    private String updatedAt;
    private List<String> tournaments;
    private Map<String, String> names;

    public int getId() {
        return id;
    }

    public String getSlug() {
        return slug;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public List<String> getTournaments() {
        return tournaments;
    }

    public Map<String, String> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "League{" +
                "id=" + id +
                ", slug='" + slug + '\'' +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", tournaments=" + tournaments +
                ", names=" + names +
                '}';
    }
}
