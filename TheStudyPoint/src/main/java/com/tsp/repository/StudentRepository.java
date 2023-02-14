package com.tsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	public Student findByAddress(String address);

}
