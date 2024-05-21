package com.example.Spring1;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	@Value("21")
	private int age;
	
	@Autowired
	@Qualifier("laptop")
	
	private Computer com;

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
//		System.out.println("Setter called");
		this.age = age;
	}

	public Alien() {
		System.out.println("Alien Object Created");
	}

//	@ConstructorProperties({"age","lap"})
//	public Alien(int age, Computer com) {
//		System.out.println("Para Constructor Called");
//		this.age = age;
//		this.com = com;
//	}

	public void code() {
		System.out.println("Coding");
		com.compile();
	}
}
