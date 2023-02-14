package com.tsp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity

public class Teacher {
	@Id
	private long id;
	private String name;
	private String subject;
	private String time;

	public Teacher() {
		super();
	}

	public Teacher(long id, String name, String subject, String time) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", subject=" + subject + ", time= " + "]";
	}

}
