package com.example.SpringBootFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component	//if Component is not available on top of the class then spring boot not create their object
public class Alien {
	@Autowired
	Laptop laptop;
	public void code() {
		laptop.compile();
//		System.out.println("Coding");
	}

}
