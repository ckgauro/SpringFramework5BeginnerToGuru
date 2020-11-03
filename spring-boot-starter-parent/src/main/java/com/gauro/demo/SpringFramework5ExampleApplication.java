package com.gauro.demo;

import com.gauro.demo.controllers.MyController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class SpringFramework5ExampleApplication {

	public static void main(String[] args) {

	 ApplicationContext ctx=SpringApplication.run(SpringFramework5ExampleApplication.class, args);
		MyController myController=(MyController) ctx.getBean("myController");
		String greeting=myController.sayHello();
		log.info(greeting);

	}

}
