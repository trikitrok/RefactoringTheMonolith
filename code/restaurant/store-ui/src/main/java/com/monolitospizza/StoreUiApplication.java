package com.monolitospizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Matt Stine
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StoreUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreUiApplication.class, args);
    }
}
