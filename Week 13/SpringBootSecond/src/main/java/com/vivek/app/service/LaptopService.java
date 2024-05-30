package com.vivek.app.service;

import java.sql.Savepoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.app.model.Laptop;
import com.vivek.app.repo.LaptopRepository;

@Service
public class LaptopService {

	@Autowired
	private LaptopRepository repo;
//	public void addLaptop(Laptop lap) {
//		repo.save(lap);
//		
//	}

	public boolean isGoodForProg(Laptop lap) {
		return true;
	}

	public void add(Laptop laptop) {
		repo.save(laptop);
		
	}
	
}