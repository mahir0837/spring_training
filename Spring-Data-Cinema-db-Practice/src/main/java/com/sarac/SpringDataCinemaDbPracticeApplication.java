package com.sarac;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.output.MigrateResult;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringDataCinemaDbPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataCinemaDbPracticeApplication.class, args);
    }

//    @Bean
//    public MigrateResult migrateResult(DataSource dataSource){
//
//        return Flyway.configure().baselineOnMigrate(true).dataSource(dataSource).load().migrate();
//    }

}
