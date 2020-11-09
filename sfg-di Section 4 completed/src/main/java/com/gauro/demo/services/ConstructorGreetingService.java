package com.gauro.demo.services;

import org.springframework.stereotype.Service;

/**
 * @author Chandra
 */

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
