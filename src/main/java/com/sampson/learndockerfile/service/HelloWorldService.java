package com.sampson.learndockerfile.service;

import org.springframework.stereotype.Service;

import java.util.List;

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
}
