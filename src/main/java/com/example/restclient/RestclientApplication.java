package com.example.restclient;

import feign.Feign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestclientApplication.class, args);
    }

    GitHUB gitHUB = Feign.builder().decoder(new Gson).target(GitHUB.class, "https://api.github.com");

}
