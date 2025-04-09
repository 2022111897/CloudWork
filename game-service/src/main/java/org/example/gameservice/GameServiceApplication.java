package org.example.gameservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.example.gameservice.controller"})
@MapperScan(basePackages = "org.example.gameservice.mapper")
public class GameServiceApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(GameServiceApplication.class, args);
    }
}
