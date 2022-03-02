package com.careerdevs.apidemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

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
}
