package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Laboratory;

public interface LaboratoryService {
	List<Laboratory> getAllLaboratorys();
	
	Laboratory saveLaboratory(Laboratory laboratory);
	
	Laboratory getLaboratoryById(Long id);
	
	Laboratory updateLaboratory(Laboratory laboratory);
	
	void deleteLaboratoryById(Long id);
}
