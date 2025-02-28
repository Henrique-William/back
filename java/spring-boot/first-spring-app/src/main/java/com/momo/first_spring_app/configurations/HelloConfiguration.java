package com.momo.first_spring_app.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {
    //injection of class HelloWorldService (this injection is used to refeer an class in another class, like libraries, or in implementations)
    @Bean
    public String helloWorld() {
        return "Hello World!";
    }
}
