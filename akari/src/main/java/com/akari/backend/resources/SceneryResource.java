package com.akari.backend.resources;

import com.akari.backend.models.CatScenery;
import com.akari.backend.services.SceneryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class SceneryResource {

    @Autowired
    SceneryService sceneryService;
    @GetMapping(value = "/scenery/{id}")
    public ResponseEntity<CatScenery> getById(@PathVariable long id){
        return new ResponseEntity<>(sceneryService.getSceneryById(id),HttpStatus.OK) ;
    }

    @GetMapping(value = "/sceneries/")
    public ResponseEntity<List<CatScenery>>getAll(){
        return new ResponseEntity<>(sceneryService.getAllSceneries(),HttpStatus.OK);
    }

    @GetMapping(value = "/say-hi/{name}")
    public ResponseEntity<String>hello(@PathVariable String name){
        return new ResponseEntity<>(sceneryService.sayHi(name), HttpStatus.OK);
    }
}
