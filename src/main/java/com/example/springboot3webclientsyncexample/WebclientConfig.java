package com.example.springboot3webclientsyncexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebclientConfig {

    @Bean
    WebClient webClient() {
        return WebClient.builder().build();
    }
}
