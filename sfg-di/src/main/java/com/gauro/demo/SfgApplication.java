package com.gauro.demo;

import com.gauro.demo.controllers.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class SfgApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgApplication.class, args);
        PetController petController = (PetController) ctx.getBean("petController");
        log.info("-------The Best Pet Is-------");
        log.info(petController.whichPetIsTheBest());

        log.info("------>i18nController ");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        log.info(i18nController.sayHello());

        log.info("--------------MyController-from Primary Bean--");
        MyController myController=  (MyController) ctx.getBean("myController");
        log.info(myController.sayHello());

        log.info("--------------Property");
        PropertyInjectedController propertyInjectedController=(PropertyInjectedController) ctx.getBean("propertyInjectedController");
        log.info(propertyInjectedController.getGreeting());

        log.info("--------Setter");
        SetterInjectedController setterInjectedController=(SetterInjectedController) ctx.getBean("setterInjectedController") ;
        log.info(setterInjectedController.getGreeting());

        log.info("From Constructor====>");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        log.info(constructorInjectedController.getGreeting());



    }

}
