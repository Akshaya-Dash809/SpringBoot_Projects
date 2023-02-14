package com.tsp.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tsp.dto.StudentRequestDto;
import com.tsp.entity.Student;

@Component
public interface StudentService {

	Student postAStudent(StudentRequestDto studentRequest);

	List<Student> getAllStudents();

	Student getAStudent(long id);

	Student updateAStudent(Student params, long id);

	String delete(long id);

	Student getStudentByAddress(String ad);

}
