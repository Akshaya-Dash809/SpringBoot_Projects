package com.tsp.services;

import java.util.List;

import com.tsp.entity.Teacher;

public interface TeacherService {
	public List<Teacher> getTeachers();

	public Teacher singleTeacher(long tid);

	public Teacher addTeacher(Teacher obj);

	public Teacher updateTeacher(Teacher obj);

	public void deleteTeacher(long tid);
}
