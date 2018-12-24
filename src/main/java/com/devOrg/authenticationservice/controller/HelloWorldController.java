package com.devOrg.authenticationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1.0")
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String sayHelloworld() {
        return "HelloWorld";
    }
}
