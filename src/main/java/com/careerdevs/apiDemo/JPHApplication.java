package com.careerdevs.apiDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class JPHApplication {

    @PostMapping("/ping")
    public String pong() {
        return "pong";
    }

    @GetMapping("/jsonplaceholder")
    public Object jphUser(RestTemplate restTemplate) {
        Object requestData = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/", Object.class);
        return requestData;
    }

    @GetMapping("/jsonplaceholder/{id}")
    public Object jphUser(RestTemplate restTemplate, @PathVariable("id") String userId ) {
        Object requestData = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/" +  userId,
                Object.class) ;
        return requestData;
    }

//    @DeleteMapping("jsonplaceholder/{id}")
//        public Object jphUser(RestTemplate restTemplate, @PathVariable("id") String userId ) {
//            Object requestData = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/" +  userId,
//                    Object.class) ;
//            return requestData;
//        }


    public static void main(String[] args) {
        SpringApplication.run(JPHApplication.class, args);
    }

}
