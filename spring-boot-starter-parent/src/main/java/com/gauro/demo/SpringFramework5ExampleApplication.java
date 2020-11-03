package com.gauro.demo;

import com.gauro.demo.controllers.ConstructorInjectedController;
import com.gauro.demo.controllers.MyController;
import com.gauro.demo.controllers.PropertyInjectedController;
import com.gauro.demo.controllers.SetterInjectedController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class SpringFramework5ExampleApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringFramework5ExampleApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        String greeting = myController.sayHello();
        log.info("From Mygreetings===>");
        log.info(greeting);

        log.info("--------Primary Bean");
        log.info(myController.sayHello());

        log.info("========From Property");
		PropertyInjectedController propertyInjectedController=(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		log.info(propertyInjectedController.getGreeting());

		log.info("========From Setter");
		SetterInjectedController setterInjectedController=(SetterInjectedController) ctx.getBean("setterInjectedController");
		log.info(setterInjectedController.getGreeting());

		log.info("=======From Constructor");
		ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		log.info(constructorInjectedController.getGreeting());
    }

}
