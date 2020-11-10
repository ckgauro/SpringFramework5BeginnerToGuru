package com.gauro.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Chandra
 */
@Service
@Primary
public class GetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
