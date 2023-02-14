package com.tsp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tsp.dto.StudentRequestDto;
import com.tsp.entity.Student;
import com.tsp.services.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	// create a student
	@PostMapping(path = "/students")
	public ResponseEntity<Student> postAStudent(@RequestBody @Valid StudentRequestDto studentRequest) {
		return new ResponseEntity<>(studentService.postAStudent(studentRequest), HttpStatus.CREATED);
	}

	// Get all students
	@GetMapping(value = "/students")
	public List<Student> getAll() {
		return studentService.getAllStudents();
	}

	@RequestMapping(value = "/studentsById/{id}", method = RequestMethod.GET)
	@GetMapping(value = "/studentsById/{id}")
	public Student getOnlyOneStudent(@PathVariable long id) {

		return studentService.getAStudent(id);
	}

	@GetMapping(value = "/studentsByAddress/{address}")
	public Student getKolkata(@PathVariable String address) {

		return studentService.getStudentByAddress(address);
	}

	@PutMapping(value = "/students/{id}")
	public Student update(@PathVariable long id, @RequestBody Student student) {

		return studentService.updateAStudent(student, id);
	}

	@DeleteMapping(value = "/students/{id}")
	public String delete(@PathVariable long id) {

		return studentService.delete(id);
	}

}
