package com.tsp.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsp.entity.Teacher;
import com.tsp.repository.TeacherRepository;
import com.tsp.services.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherRepository rep;

	@Override
	public List<Teacher> getTeachers() {
		return rep.findAll();
	}

	@Override
	public Teacher singleTeacher(long tid) {

		return rep.getOne(tid);
	}

	public Teacher addTeacher(Teacher obj) {

		rep.save(obj);
		return obj;
	}

	public Teacher updateTeacher(Teacher obj) {

		rep.save(obj);
		return obj;
	}

	public void deleteTeacher(long tid) {

		Teacher del = rep.getOne(tid);
		rep.delete(del);
	}

}
