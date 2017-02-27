package com.kingofneurons.esport.lol.api.endpoints.dto.highlander_match_details;

public class Video {

    private int id;
    private String slug;
    private String label;
    private String locale;
    private String source;
    private String createdAt;
    private String updatedAt;
    private String game;

    public int getId() {
        return id;
    }

    public String getSlug() {
        return slug;
    }

    public String getLabel() {
        return label;
    }

    public String getLocale() {
        return locale;
    }

    public String getSource() {
        return source;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getGame() {
        return game;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", slug='" + slug + '\'' +
                ", label='" + label + '\'' +
                ", locale='" + locale + '\'' +
                ", source='" + source + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", game='" + game + '\'' +
                '}';
    }
}
