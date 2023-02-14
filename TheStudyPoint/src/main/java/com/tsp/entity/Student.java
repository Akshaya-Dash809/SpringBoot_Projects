package com.tsp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Tstudents")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sid", length = 10)
	private long id;
	@Column(name = "sname", length = 20)
	private String name;
	@Column(name = "saddress", length = 100)
	private String address;
	@Column(name = "semail", length = 20)
	private String email;
	@Column(name = "smobile", length = 15)
	private long mobile;

	public Student(String name, String address, String email, long mobile) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.mobile = mobile;

	}

}
