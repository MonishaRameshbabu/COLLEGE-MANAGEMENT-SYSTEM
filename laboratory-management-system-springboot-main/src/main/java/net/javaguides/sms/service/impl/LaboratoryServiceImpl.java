package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Laboratory;
import net.javaguides.sms.repository.LaboratoryRepository;
import net.javaguides.sms.service.LaboratoryService;

@Service
public class LaboratoryServiceImpl implements LaboratoryService{

	private LaboratoryRepository laboratoryRepository;
	
	public LaboratoryServiceImpl(LaboratoryRepository laboratoryRepository) {
		super();
		this.laboratoryRepository = laboratoryRepository;
	}

	@Override
	public List<Laboratory> getAllLaboratorys() {
		return laboratoryRepository.findAll();
	}

	@Override
	public Laboratory saveLaboratory(Laboratory laboratory) {
		return laboratoryRepository.save(laboratory);
	}

	@Override
	public Laboratory getLaboratoryById(Long id) {
		return laboratoryRepository.findById(id).get();
	}

	@Override
	public Laboratory updateLaboratory(Laboratory laboratory) {
		return laboratoryRepository.save(laboratory);
	}

	@Override
	public void deleteLaboratoryById(Long id) {
		laboratoryRepository.deleteById(id);	
	}

}
