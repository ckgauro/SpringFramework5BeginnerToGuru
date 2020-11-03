package com.gauro.demo.controllers;

import com.gauro.demo.services.GreetingService;

/**
 * @author Chandra
 */
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return this.greetingService.sayGreeting();
    }
}
