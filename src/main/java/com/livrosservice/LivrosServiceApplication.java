package com.livrosservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LivrosServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivrosServiceApplication.class, args);
        System.out.println("Livros Service Is Running!");
    }

}
