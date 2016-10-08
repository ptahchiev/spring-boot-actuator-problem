package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ActuatorErrorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorErrorApplication.class, args);
    }

    @Bean
    public PlatformUserDetailsService defaultPlatformUserDetailsService() {
        return new PlatformUserDetailsService();
    }
}
