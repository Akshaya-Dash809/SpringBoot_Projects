package com.tsp.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsp.dto.StudentRequestDto;
import com.tsp.entity.Student;
import com.tsp.repository.StudentRepository;
import com.tsp.services.StudentService;

@Service

public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student postAStudent(StudentRequestDto studentRequest) {

		Student student = Student.builder().name(studentRequest.getName()).address(studentRequest.getAddress())
				.email(studentRequest.getEmail()).mobile(studentRequest.getMobile()).build();
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {

		return studentRepository.findAll();
	}

	@Override
	public Student getAStudent(long id) {

		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateAStudent(Student params, long id) {
		Student ss = studentRepository.findById(id).get();
		ss.setName(params.getName());
		ss.setAddress(params.getAddress());
		ss.setEmail(params.getEmail());
		ss.setMobile(params.getMobile());
		return studentRepository.save(ss);
	}

	@Override
	public String delete(long id) {
		studentRepository.deleteById(id);
		return "The student with id " + id + " has been deleted!!!";
	}

	@Override
	public Student getStudentByAddress(String ad) {
		// TODO Auto-generated method stub
		return studentRepository.findByAddress(ad);
	}

}