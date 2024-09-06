package com.iablocova.petcarecenter11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PetCareCenter11Application extends SpringBootServletInitializer{


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PetCareCenter11Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(PetCareCenter11Application.class, args);
    }


}
