package com.akari.backend.services;

import com.akari.backend.models.CatScenery;
import com.akari.backend.repository.SceneryRepository;
import com.akari.backend.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class SceneryService {

    @Autowired
    SceneryRepository sceneryRepository;
    public CatScenery getSceneryById(Long id){
        CatScenery scenery=new CatScenery();
        Optional<CatScenery>sceneryOpt=sceneryRepository.findById(id);
        if (sceneryOpt.isPresent()) {
            scenery.setSceneryId(sceneryOpt.get().getSceneryId());
            scenery.setSceneryName(sceneryOpt.get().getSceneryName());
        }
        return scenery;
    }
    public List<CatScenery> getAllSceneries(){
        List<CatScenery>sceneries=sceneryRepository.findAll();
        return sceneries;
    }

    public String sayHi(String name){
        if(name.isBlank()){
            return Constants.GREETING_NO_NAME;
        }
        return Constants.GREETING_NAME.replace("_NAME_",name);
    }
}
