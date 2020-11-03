package com.gauro.demo.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

/**
 * @author Chandra
 */
@Slf4j
@Controller
public class MyController {
    public String sayHello(){
        log.info("Hello World!!!");
        return "Hi Folks";
    }
}
