package com.vivek.SpringJDBC;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vivek.SpringJDBC.model.Student;
import com.vivek.SpringJDBC.service.StudentService;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJdbcApplication.class, args);
		Student s=context.getBean(Student.class);
		s.setRollNo(101);
		s.setName("Vishal");
		s.setMarks(75);
		
		StudentService service=context.getBean(StudentService.class);
		service.addStudent(s);
		
		List<Student> students= service.getStudents();
		System.out.println(students);
	}

}
