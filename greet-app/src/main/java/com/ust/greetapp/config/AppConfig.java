package com.ust.greetapp.config;

import com.ust.greetapp.repository.TaskRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class AppConfig {


    @Bean
    public Scanner getScannerBean(){
        return new Scanner(System.in);
    }

}
