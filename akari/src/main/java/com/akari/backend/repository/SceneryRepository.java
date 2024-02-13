package com.akari.backend.repository;

import com.akari.backend.models.CatScenery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SceneryRepository extends JpaRepository<CatScenery,Long> {

}
