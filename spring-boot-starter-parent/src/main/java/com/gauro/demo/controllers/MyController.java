package com.gauro.demo.controllers;

import com.gauro.demo.services.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

/**
 * @author Chandra
 */
@Slf4j
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        return this.greetingService.sayGreeting();
    }




}
