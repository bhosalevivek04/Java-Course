package com.vivek.app.repo;

import org.springframework.stereotype.Repository;

import com.vivek.app.model.Laptop;
@Repository
public class LaptopRepository {
	public void save(Laptop lap) {
		System.out.println("Saved in Database");
	}
}
