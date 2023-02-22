package com.sarac.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.sarac") This type preferable
@ComponentScan(basePackages = {"com.sarac.proxy","com.sarac.service","com.sarac.repository"})
public class CommentConfig {

}
