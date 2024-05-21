package com.example.Spring1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.example.Spring1.Alien;
import com.example.Spring1.Computer;
import com.example.Spring1.Desktop;
import com.example.Spring1.Laptop;

@Configuration
@ComponentScan("com.example.Spring1")
public class AppConfig {
	
//	
//	@Bean
////	public Alien alien(@Autowired Computer com) {
//	public Alien alien(Computer com) { //@Qualifier("desktop") 
//		Alien obj=new Alien();
//		obj.setAge(21);
//		obj.setCom(com);
//		return obj;
//	}
//	
////	@Bean(name = {"com2","desktop","Beast"})
////	@Scope("prototype")
//
//	@Bean
//	public Desktop desktop() {
//		return new Desktop();
//	};
//	
//	@Bean
//	@Primary
//	public Laptop laptop() {
//		return new Laptop();
//	};
}
