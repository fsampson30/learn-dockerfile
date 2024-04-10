package com.sampson.learndockerfile.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class HelloWorldService {

    public String getHelloWorld(){
        return "Hello World Flavio";
    }

    public List<Integer> getNumbers(){
        return List.of(13,26,39,52);
    }

    public List<String> getNames(){
        return List.of("A","B","C");
    }

    public List<Boolean> getStates(){
        return List.of(false,true,false);
    }

    public Integer getRandomNumber(){
        Random numbers = new Random();
        return numbers.nextInt();
    }
}
