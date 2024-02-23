package com.akari.backend.resources;

import com.akari.backend.repository.SceneryRepository;
import com.akari.backend.services.SceneryService;
import com.akari.backend.utils.Constants;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SceneryTest {

    @Mock
    private SceneryRepository sceneryRepository;
    @Mock
    private SceneryService sceneryService;

    @InjectMocks
    @Resource
    private SceneryResource sceneryResource;
    String name ="Andres";
    @Before("")
    public void setup()throws Exception{
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testGreetingWithName(){
        String greeting = Constants.GREETING_NAME.replace("_NAME_",name);
        when(sceneryService.sayHi(name)).thenReturn(greeting);
        ResponseEntity<String> response=sceneryResource.hello(name);
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertEquals(response.getBody(),greeting);
    }

    @Test
    public void testGreetingWithoutName(){
        String greeting = Constants.GREETING_NO_NAME;
        when(sceneryService.sayHi("")).thenReturn(greeting);
        ResponseEntity<String> response=sceneryResource.hello("");
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertEquals(response.getBody(),greeting);

    }
}
