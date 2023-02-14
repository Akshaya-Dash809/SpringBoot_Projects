package com.tsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsp.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
