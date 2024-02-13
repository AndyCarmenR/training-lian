package com.akari.backend.repository;

import com.akari.backend.models.CatTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<CatTest,Long> {

}
