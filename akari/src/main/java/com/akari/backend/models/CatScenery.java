package com.akari.backend.models;

import javax.persistence.*;

@Entity
@Table(name="cat_scenery")
public class CatScenery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "scenery_id")
    private Long sceneryId;

    @Column(name = "scenery_name")
    private String sceneryName;

    public Long getSceneryId() {
        return sceneryId;
    }

    public void setSceneryId(Long sceneryId) {
        this.sceneryId = sceneryId;
    }

    public String getSceneryName() {
        return sceneryName;
    }

    public void setSceneryName(String sceneryName) {
        this.sceneryName = sceneryName;
    }
}
