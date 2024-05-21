package com.example.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Spring1.config.AppConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//		Desktop dt = context.getBean("desktop", Desktop.class);
//		dt.compile();
//		Desktop dt1 = context.getBean("desktop", Desktop.class);
//		dt.compile();

		Alien obj1=context.getBean(Alien.class);
		System.out.println(obj1.getAge());
		obj1.code();
		
		/*
		 * // xml based config ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring.xml"); // create a container Alien
		 * obj1 = context.getBean("alien1",Alien.class); // obj1.setAge(21);
		 * System.out.println(obj1.getAge()); obj1.code();
		 */

//    	
//    	Alien obj2 = (Alien) context.getBean("alien1");
//    	System.out.println(obj2.age);
////    	obj2.code();

//		Computer com=context.getBean(Computer.class);
//		
//		Desktop obj = context.getBean(Desktop.class);
//		Desktop obj = context.getBean("com2",Desktop.class);
	}
}
