package com.tsp.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentRequestDto {
	@NotBlank(message = "Invalid Name: Empty name")
	@NotNull(message = "Invalid Name: Name is NULL")
	@Size(min = 3, max = 30, message = "Invalid Name: Must be of 3 - 30 characters")
	String name;
	@NotBlank(message = "Invalid Name: Empty Address")
	@NotNull(message = "Invalid Name: ADDRESS is NULL")
	@Size(min = 5, max = 130, message = "Invalid ADDRESS: Must be of 5 - 130 characters")
	private String address;

	@Email(message = "Invalid email")
	String email;
	@NotNull(message = "Invalid Phone number: Number is NULL")
	long mobile;

}
