package com.gauro.demo.controllers;

import com.gauro.demo.services.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author Chandra
 */
@Slf4j
@Controller
public class MyController {
    private GreetingService greetingService;

//    public MyController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        log.info("Hello!!!");

        return greetingService.sayGreeting();
    }
}
