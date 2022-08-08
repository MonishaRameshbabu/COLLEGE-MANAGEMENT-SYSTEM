package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.entity.Faculty;
import net.javaguides.sms.service.FacultyService;

@Controller
public class FacultyController {
	
	private FacultyService facultyService;

	public FacultyController(FacultyService facultyService) {
		super();
		this.facultyService = facultyService;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/facultys")
	public String listFacultys(Model model) {
		model.addAttribute("facultys", facultyService.getAllFacultys());
		return "facultys";
	}
	
	@GetMapping("/facultys/new")
	public String createFacultyForm(Model model) {
		
		// create student object to hold student form data
		Faculty faculty = new Faculty();
		model.addAttribute("faculty", faculty);
		return "create_faculty";
		
	}
	
	@PostMapping("/facultys")
	public String saveFaculty(@ModelAttribute("faculty") Faculty faculty) {
		facultyService.saveFaculty(faculty);
		return "redirect:/facultys";
	}
	
	@GetMapping("/facultys/edit/{id}")
	public String editFacultyForm(@PathVariable Long id, Model model) {
		model.addAttribute("faculty", facultyService.getFacultyById(id));
		return "edit_faculty";
	}

	@PostMapping("/facultys/{id}")
	public String updateFaculty(@PathVariable Long id,
			@ModelAttribute("faculty") Faculty faculty,
			Model model) {
		
		// get student from database by id
		Faculty existingFaculty = facultyService.getFacultyById(id);
		existingFaculty.setId(id);
		existingFaculty.setFirstName(faculty.getFirstName());
		existingFaculty.setLastName(faculty.getLastName());
		existingFaculty.setEmail(faculty.getEmail());
		
		// save updated student object
		facultyService.updateFaculty(existingFaculty);
		return "redirect:/facultys";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/facultys/{id}")
	public String deleteFaculty(@PathVariable Long id) {
		facultyService.deleteFacultyById(id);
		return "redirect:/facultys";
	}
	
}
