package com.gauro.demo.controllers;

import com.gauro.services.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

/**
 * @author Chandra
 */
@Slf4j
@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        log.info("Hello!!!");

        return greetingService.sayGreeting();
    }
}
