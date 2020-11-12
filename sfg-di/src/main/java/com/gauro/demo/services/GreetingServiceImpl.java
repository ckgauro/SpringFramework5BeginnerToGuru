package com.gauro.demo.services;

import org.springframework.context.annotation.Primary;
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
