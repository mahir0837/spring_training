package com.sarac;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NewAppConfig {

    @Bean(name = "welcome")
    public String str1(){
        return "Welcome to CydeoApp";
    }

    @Bean
    public String str2(){
        return "Spring Core Practice";
    }

}