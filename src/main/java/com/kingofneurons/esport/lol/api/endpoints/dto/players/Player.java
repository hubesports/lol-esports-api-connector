package com.kingofneurons.esport.lol.api.endpoints.dto.players;

public class Player {

    private int id;
    private String slug;
    private String name;
    private String firstName;
    private String lastName;
    private String roleSlug;
    private String photoUrl;
    private String hometown;
    private String region;

    public int getId() {
        return id;
    }

    public String getSlug() {
        return slug;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRoleSlug() {
        return roleSlug;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getHometown() {
        return hometown;
    }

    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return "Players{" +
                "id=" + id +
                ", slug='" + slug + '\'' +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", roleSlug='" + roleSlug + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", hometown='" + hometown + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
