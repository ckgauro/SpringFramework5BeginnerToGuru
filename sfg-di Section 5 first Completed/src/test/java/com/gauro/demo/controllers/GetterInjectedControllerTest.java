package com.gauro.demo.controllers;

import com.gauro.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Chandra
 */
class GetterInjectedControllerTest {
    private GetterInjectedController  getterInjectedController;

    @BeforeEach
    void setUp() throws Exception{
        this.getterInjectedController=new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
    }
}