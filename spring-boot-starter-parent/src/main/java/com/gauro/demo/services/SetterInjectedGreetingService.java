package com.gauro.demo.services;

import org.springframework.stereotype.Service;

/**
 * @author Chandra
 */
@Service
public class SetterInjectedGreetingService  implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
