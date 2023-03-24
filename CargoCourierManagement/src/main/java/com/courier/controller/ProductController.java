package com.courier.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.courier.dto.ProductDto;
import com.courier.entity.Product;
import com.courier.service.ProductService;

@RestController
@RequestMapping(value = "/courier")
public class ProductController { // Controller class

	@Autowired
	private ProductService productService;

//Adding a new product for courier
	@PostMapping("/product")
	public ResponseEntity<Product> addACProduct(@RequestBody @Valid ProductDto productdto) {
		return new ResponseEntity<>(productService.addProduct(productdto), HttpStatus.CREATED);
	}

//Getting all Product details
	@GetMapping("/product")
	public List<Product> getAllCProduct() {
		return productService.getAllProduct();
	}

//getting one product detail
	@GetMapping("/product/{pid}")

	public Product getACProduct(@PathVariable Integer pid) {
		return productService.getAProduct(pid);
	}

//update Product details
	@PutMapping("/product/{pid}")
	public Product updateCProduct(@PathVariable Integer pid, @RequestBody Product product) {
		return productService.updateProduct(product, pid);
	}

//delete the product
	@DeleteMapping("/product/{pid}")
	public String removeProduct(@PathVariable Integer pid) {
		return productService.removeProduct(pid);

	}

//Getting products by shippingprice
	@GetMapping("/productbysp")
	public List<Product> getCProductByShippingPrice(@RequestParam Double pshippingprice) {
		return productService.getProductByShippingPrice(pshippingprice);

	}

//Getting all Product details using JPQL
	@GetMapping("/productbyjpql")
	public List<Product> getAllCProductUsingJPQL() {
		return productService.getAllProduct_byJPQL();
	}
}