package com.momo.first_spring_app.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    //method helloWorld
    public String helloWorld(String name){
        return "Hello " + name + "!";
    } 
}
