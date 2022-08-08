package com.placement.campus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.placement.campus.entity.Student;
import com.placement.campus.repository.StudentRepository;

@SpringBootApplication
public class CampusApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CampusApplication.class, args);
	}
 @Autowired
 private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
		/*Student student1 = new Student("Dharani","S","dhara13@gmail.com","9876543232","EEE","80");
		studentRepository.save(student1);
		Student student2 = new Student("Priya","S","priya10@gmail.com","9876543932","EEE","88");
		studentRepository.save(student2);*/
	}
	

}
