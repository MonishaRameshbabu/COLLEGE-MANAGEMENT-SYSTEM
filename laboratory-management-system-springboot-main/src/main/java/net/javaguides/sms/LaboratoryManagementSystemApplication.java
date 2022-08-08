package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Laboratory;
import net.javaguides.sms.repository.LaboratoryRepository;

@SpringBootApplication
public class LaboratoryManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LaboratoryManagementSystemApplication.class, args);
	}

	@Autowired
	private LaboratoryRepository laboratoryRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		/*Laboratory laboratory1 = new Laboratory("Lab1", "CSC", "Dharani");
		 laboratoryRepository.save(laboratory1);
		 
		 Laboratory laboratory2 = new Laboratory("Lab2", "CSC", "Priya");
		 laboratoryRepository.save(laboratory2);
		 
		 Laboratory laboratory3 = new Laboratory("Lab3", "ECE", "Ramya");
		  laboratoryRepository.save(laboratory3);*/
		 
		
	}

}
