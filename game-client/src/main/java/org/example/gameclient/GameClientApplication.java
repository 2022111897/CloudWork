package org.example.gameclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"org.example.gameclient.controller","org.example.gameclient.client"})
@EnableEurekaClient
@EnableFeignClients("org.example.gameclient.client")
public class GameClientApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(GameClientApplication.class, args);
    }
}





