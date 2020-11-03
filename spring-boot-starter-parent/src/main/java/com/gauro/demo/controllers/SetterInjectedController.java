package com.gauro.demo.controllers;

import com.gauro.demo.services.GreetingService;

/**
 * @author Chandra
 */
public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
