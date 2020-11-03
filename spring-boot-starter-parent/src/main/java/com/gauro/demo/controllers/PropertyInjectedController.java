package com.gauro.demo.controllers;

import com.gauro.demo.services.GreetingService;

/**
 * @author Chandra
 */
public class PropertyInjectedController {
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
