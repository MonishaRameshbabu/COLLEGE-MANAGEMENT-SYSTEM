package com.placement.campus.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.placement.campus.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}

