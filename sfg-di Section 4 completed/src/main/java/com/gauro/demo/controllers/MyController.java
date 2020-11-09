package com.gauro.demo.controllers;

import com.gauro.demo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author Chandra
 */
@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
