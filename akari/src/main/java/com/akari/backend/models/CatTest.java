package com.akari.backend.models;

import javax.persistence.*;

@Entity
@Table(name="cat_tests")
public class CatTest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "test_id")
    private Long sceneryId;

    @Column(name = "test_name")
    private String sceneryName;

    public Long getSceneryId() {
        return sceneryId;
    }

    public void setSceneryId(Long sceneryId) {
        this.sceneryId = sceneryId;
    }
}
