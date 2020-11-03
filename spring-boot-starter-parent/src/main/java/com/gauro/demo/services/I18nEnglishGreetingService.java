package com.gauro.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Chandra
 */

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
