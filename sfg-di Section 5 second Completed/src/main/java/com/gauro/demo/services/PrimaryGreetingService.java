package com.gauro.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Chandra
 */


//@Primary
//@Service
//@Profile({"en","default"})


public class PrimaryGreetingService implements GreetingService{
    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {

        return  greetingRepository.getEnglishGreeting();
    }
}
