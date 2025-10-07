package com.ust.greetapp.api;

import com.ust.greetapp.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping
    public String sayHello(){
        return "Hello from Spring Boot";
    }

    @GetMapping("/task")
    public Task getTask(){
        return new Task("Learn Spring Boot","Learn the Spring Framework",false);
    }

    // Create a list of tasks and return all

}
