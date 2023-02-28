package com.sarac;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FullTimeEmployee fullTimeEmployee(){
        return new FullTimeEmployee();
    }
    @Bean
    public PartTimeEmployee PartTimeEmployee(){
        return new PartTimeEmployee();
    }
}
