package com.gauro.demo.controllers;

import com.gauro.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author Chandra
 */
@Controller
public class I18nController {
    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
