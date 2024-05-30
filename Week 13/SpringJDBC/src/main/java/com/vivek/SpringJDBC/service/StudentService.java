package com.vivek.SpringJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.SpringJDBC.model.Student;
import com.vivek.SpringJDBC.repo.StudentRepo;

@Service
public class StudentService {
	private StudentRepo repo;

	public StudentRepo getRepo() {
		return repo;
	}

	@Autowired
	public void setRepo(StudentRepo repo) {
		this.repo = repo;
	}

	public void addStudent(Student s) {
		repo.save(s);

	}

	public List<Student> getStudents() {
		return repo.findAll();
	}

}
