package com.example.consulmemberclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsulMemberClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulMemberClientApplication.class, args);
    }

}
