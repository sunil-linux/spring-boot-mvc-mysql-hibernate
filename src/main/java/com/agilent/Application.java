package com.agilent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@EnableAutoConfiguration
@ComponentScan(basePackages="com.agilent.earray8.springboot")
public class Application 
{
    public static void main( String[] args )
    {
    		ApplicationContext appContext = SpringApplication.run(Application.class, args);  		
    }
}
