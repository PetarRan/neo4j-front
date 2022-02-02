package com.petarran.application.data;


import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node("Post")
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    @Property(name = "description")
    private String description;
    @Property(name = "likes")
    private Integer likes;
    @Property(name = "userid")
    private String userid;
    @Property(name = "latitude")
    private Double latitude;
    @Property(name = "longitude")
    private Double longitude;
    @Property(name = "location")
    private String location;

    public Post(String description, Integer likes, Double latitude, Double longitude,
                String userid, String location) {
        this.id = null;
        this.description = description;
        this.likes = likes;
        this.latitude = latitude;
        this.longitude = longitude;
        this.location = location;
        this.userid = userid;
    }

    public Post withId(Long id) {
        if (this.id.equals(id)) {
            return this;
        } else {
            return new Post(this.description, this.likes, this.latitude, this.longitude, this.userid, this.location);
        }
    }

    public String getUserid() {
        return userid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
