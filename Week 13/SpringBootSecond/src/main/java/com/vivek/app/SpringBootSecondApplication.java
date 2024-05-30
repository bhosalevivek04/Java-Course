package com.vivek.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vivek.app.model.Laptop;
import com.vivek.app.service.LaptopService;

@SpringBootApplication
public class SpringBootSecondApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootSecondApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);
		Laptop laptop = context.getBean(Laptop.class);
		service.add(laptop);

//		Alien obj=context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.code();
	}

}