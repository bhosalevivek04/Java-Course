package com.example.SpringBootFirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootFirstApplication.class, args);
//		System.out.println("Hello World");
//		IoC means Inversion of Control
//		Di means Dependency Injection
		Alien obj=context.getBean(Alien.class);
		obj.code();
//		Alien obj1=context.getBean(Alien.class);
//		obj1.code();
	}

}
