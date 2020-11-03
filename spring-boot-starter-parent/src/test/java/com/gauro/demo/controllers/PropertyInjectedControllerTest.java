package com.gauro.demo.controllers;

import com.gauro.demo.services.GreetingServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Chandra
 */
@Slf4j
class PropertyInjectedControllerTest {
    PropertyInjectedController controller;
    @BeforeEach
    void setUp() {

        controller=new PropertyInjectedController();
        controller.greetingService=new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        log.info(controller.getGreeting());
    }
}