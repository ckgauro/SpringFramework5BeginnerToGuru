package com.gauro.demo.controllers;

import com.gauro.demo.services.ConstructorGreetingService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Chandra
 */
@Slf4j
class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller=new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        log.info(controller.getGreeting());
    }
}