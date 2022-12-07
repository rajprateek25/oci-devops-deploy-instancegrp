package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller
public class HelloController {
    @Get 
    @Produces(MediaType.TEXT_PLAIN) 
    public String index() {
        return "Hi! You have succesfully deployed a sample application to instance group - Powered by Graal Enterprise!";
    }

    @Get ("/{name}")
    @Produces(MediaType.TEXT_PLAIN) 
    public String index(String name) {
        return "Hello " + name; 
    }
}
