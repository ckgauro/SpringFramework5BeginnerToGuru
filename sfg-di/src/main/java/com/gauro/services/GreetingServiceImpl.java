package com.gauro.services;

import org.springframework.stereotype.Service;

/**
 * @author Chandra
 */
@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO_GURUS = "Hello Gurus!!!! - Original";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
