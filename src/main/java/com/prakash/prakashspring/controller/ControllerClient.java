package com.prakash.prakashspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClient {

    @RequestMapping("/hello")
    String helloMethod() {
        return "Hello Nice to meet you";
    }

}
