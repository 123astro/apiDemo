package com.careerdevs.apidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class JPHApplication {


    public static void main(String[] args) {
        SpringApplication.run(JPHApplication.class, args);
    }

}
