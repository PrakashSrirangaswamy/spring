package com.prakash.prakashspring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClient {

    @RequestMapping("/hello")
    String helloMethod() {
        return "Hello Nice to meet you";
    }

    @RequestMapping("/name")
    List nameList() {

        List a = new ArrayList<>();

        a.add("Prakash");
        a.add("Srirangaswamy");

        return a;
    }

}
