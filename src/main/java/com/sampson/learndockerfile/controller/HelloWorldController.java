package com.sampson.learndockerfile.controller;

import com.sampson.learndockerfile.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/")
    public String getHelloWorld(){
        return helloWorldService.getHelloWorld();
    }

    @GetMapping("/numbers")
    public List<Integer> getValues(){
        return helloWorldService.getNumbers();
    }

    @GetMapping("/names")
    public List<String> getNames(){
        return helloWorldService.getNames();
    }

    @GetMapping("/states")
    public List<Boolean> getStates(){
        return helloWorldService.getStates();
    }

}
