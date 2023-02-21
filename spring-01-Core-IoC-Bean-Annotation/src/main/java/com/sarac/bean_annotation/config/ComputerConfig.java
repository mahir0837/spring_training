package com.sarac.bean_annotation.config;

import com.sarac.bean_annotation.caseFactory.Case;
import com.sarac.bean_annotation.caseFactory.DellCase;
import com.sarac.bean_annotation.monitorfactory.AcerMonitor;
import com.sarac.bean_annotation.monitorfactory.Monitor;
import com.sarac.bean_annotation.monitorfactory.SonyMonitor;
import com.sarac.bean_annotation.motherboardfactory.AsusMotherboard;
import com.sarac.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ComputerConfig {

    @Bean(name="sony")
    public Monitor monitorSony() {
        return new SonyMonitor("25 inches Beast", "Sony", 25);  //Monitor abc=new SonyMonitor();
    }

    @Bean
    @Primary
    public Monitor monitorAcer() {
        return new AcerMonitor("23 inches Beast", "Acer", 23);  //Monitor abc=new SonyMonitor();
    }

    @Bean
    public Case caseDell() {

        return new DellCase("220B", "Dell", "240");
    }
    @Bean
    public Motherboard motherboardAssus(){
        return  new AsusMotherboard("BJ-200","Assus",4,6,"v2.44");
    }
}
