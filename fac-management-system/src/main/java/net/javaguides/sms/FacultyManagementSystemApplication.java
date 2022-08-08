package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Faculty;
import net.javaguides.sms.repository.FacultyRepository;

@SpringBootApplication
public class FacultyManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FacultyManagementSystemApplication.class, args);
	}

	@Autowired
	private FacultyRepository facultyRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		  Faculty faculty1 = new Faculty("Ramesh", "Fadatare", "ramesh@gmail.com");
		  facultyRepository.save(faculty1);
		  
		  Faculty faculty2 = new Faculty("Sanjay", "Jadhav", "sanjay@gmail.com");
		  facultyRepository.save(faculty2);
		  
		  Faculty faculty3 = new Faculty("tony", "stark", "tony@gmail.com");
		  facultyRepository.save(faculty3);
		 
		
	}

}
