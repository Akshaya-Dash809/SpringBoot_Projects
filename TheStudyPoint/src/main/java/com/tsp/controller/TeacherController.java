package com.tsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tsp.entity.Teacher;
import com.tsp.services.TeacherService;

@RestController
public class TeacherController {
	@Autowired
	private TeacherService sd;

	@GetMapping("/teachers")
	public List<Teacher> getTeachers() {
		return this.sd.getTeachers();
	}

	@GetMapping("/teachers/{tid}")
	public Teacher singleTeacher(@PathVariable String tid) {
		return this.sd.singleTeacher(Long.parseLong(tid));
	}

	@PostMapping("/teachers") // add
	public Teacher addTeacher(@RequestBody Teacher obj) {
		return this.sd.addTeacher(obj);
	}

	@PutMapping("/teachers") // update
	public Teacher updateTeacher(@RequestBody Teacher obj) {
		return this.sd.updateTeacher(obj);
	}

	@DeleteMapping("/teachers/{tid}") // delete
	public ResponseEntity<HttpStatus> deleteTeacher(@PathVariable String tid) {
		try {
			this.sd.deleteTeacher(Long.parseLong(tid));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
