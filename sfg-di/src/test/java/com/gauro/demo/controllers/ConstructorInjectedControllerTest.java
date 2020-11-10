package com.gauro.demo.controllers;

import com.gauro.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Chandra
 */
class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() throws Exception {
        this.constructorInjectedController=new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS,constructorInjectedController.sayHello());
    }
}