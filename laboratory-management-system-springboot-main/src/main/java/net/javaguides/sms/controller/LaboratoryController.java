package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.entity.Laboratory;
import net.javaguides.sms.service.LaboratoryService;

@Controller
public class LaboratoryController {
	
	private LaboratoryService laboratoryService;

	public LaboratoryController(LaboratoryService laboratoryService) {
		super();
		this.laboratoryService = laboratoryService;
	}
	
	
	@GetMapping("/laboratorys")
	public String listLaboratorys(Model model) {
		model.addAttribute("laboratorys", laboratoryService.getAllLaboratorys());
		return "laboratorys";
	}
	
	@GetMapping("/laboratorys/new")
	public String createLaboratoryForm(Model model) {
		
		
		Laboratory laboratory = new Laboratory();
		model.addAttribute("laboratory", laboratory);
		return "create_laboratory";
		
	}
	
	@PostMapping("/laboratorys")
	public String saveLaboratory(@ModelAttribute("laboratory") Laboratory laboratory) {
		laboratoryService.saveLaboratory(laboratory);
		return "redirect:/laboratorys";
	}
	
	@GetMapping("/laboratorys/edit/{id}")
	public String editLaboratoryForm(@PathVariable Long id, Model model) {
		model.addAttribute("laboratory", laboratoryService.getLaboratoryById(id));
		return "edit_laboratory";
	}

	@PostMapping("/laboratorys/{id}")
	public String updateLaboratory(@PathVariable Long id,
			@ModelAttribute("laboratory") Laboratory laboratory,
			Model model) {
		
		// get student from database by id
		Laboratory existingLaboratory = laboratoryService.getLaboratoryById(id);
		existingLaboratory.setId(id);
		existingLaboratory.setLabName(laboratory.getLabName());
		existingLaboratory.setDepartment(laboratory.getDepartment());
		existingLaboratory.setIncharge(laboratory.getIncharge());
		
		// save updated student object
		laboratoryService.updateLaboratory(existingLaboratory);
		return "redirect:/laboratorys";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/laboratorys/{id}")
	public String deleteLaboratory(@PathVariable Long id) {
		laboratoryService.deleteLaboratoryById(id);
		return "redirect:/laboratorys";
	}
	
}
