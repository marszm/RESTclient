package com.example.restclient;

import feign.Feign;
import feign.gson.GsonDecoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class RestclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestclientApplication.class, args);

        GitHUB gitHUB = Feign.builder().decoder(new GsonDecoder()).target(GitHUB.class, "https://api.github.com");
        List<Contributor> contributorList = gitHUB.contributors("OpenFeign","feign");
        for(Contributor contributor: contributorList) {
            System.out.println(contributor.login+""+contributor.contributions);
        }
    }
}
