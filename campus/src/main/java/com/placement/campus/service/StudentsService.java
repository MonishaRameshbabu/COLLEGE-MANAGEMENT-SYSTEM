package com.placement.campus.service;

import java.util.List;

import com.placement.campus.entity.Studentt;

public interface StudentsService {
	List<Studentt> getAllStudents();
	
	Studentt saveStudent(Studentt student);
	
	Studentt getStudentById(Long id);
	
	Studentt updateStudent(Studentt student);
	
	void deleteStudentById(Long id);
}
