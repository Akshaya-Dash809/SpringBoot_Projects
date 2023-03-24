package com.courier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDto { // Dto class

	// Adding validations
	@NotBlank(message = "Invalid Name: Empty name")
	@NotNull(message = "Invalid Name: Name is NULL")
	@Size(min = 3, max = 30, message = "Invalid Name: Must be of 3 - 30 characters")
	String pname;

	@NotBlank(message = "Invalid Description: Empty Description")
	@NotNull(message = "Invalid Description: Description is NULL")
	@Size(min = 4, max = 50, message = "Invalid Description: Must be of 3 - 30 characters")
	String pdescription;

	@Min(value = 50, message = "Price should be greater than or equal to 50")
	@Max(value = 1000, message = "Price should be less than or equal to 1000")
	@NotNull(message = "It can not be null. Please provide no. in b/w 50 to 1000")
	Double pshippingprice;

	@NotNull(message = "Invalid Weight: Weight is NULL")
	String pweight;

	@Min(value = 1, message = "Quantity should be greater than or equal to 1")
	int pquantity;
}
