package com.placement.campus.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.placement.campus.entity.Studentt;
import com.placement.campus.repository.StudenttRepository;
import com.placement.campus.service.StudentsService;
@Service
public class StudentServicesImpl implements StudentsService{

	private StudenttRepository studentRepository;
	
	public StudentServicesImpl(StudenttRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Studentt> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Studentt saveStudent(Studentt student) {
		return studentRepository.save(student);
	}

	@Override
	public Studentt getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	public Studentt updateStudent(Studentt student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}


		
	



	

