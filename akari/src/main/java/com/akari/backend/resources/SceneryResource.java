package com.akari.backend.resources;

import com.akari.backend.models.CatScenery;
import com.akari.backend.services.SceneryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class SceneryResource {

    @Autowired
    SceneryService sceneryService;
    @GetMapping(value = "/scenery/{id}")
    public CatScenery getById(@PathVariable long id){
        return sceneryService.getSceneryById(id);
    }

    @GetMapping(value = "/sceneries/")
    public List<CatScenery>getAll(){
        return sceneryService.getAllSceneries();
    }
}
