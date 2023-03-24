package com.courier.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.courier.dto.ProductDto;
import com.courier.entity.Product;

@Component
public interface ProductService { // Service class
	// 1 Adding product for courier
	Product addProduct(ProductDto productdto);

	// 2 getting all product list
	List<Product> getAllProduct();

	// 3 Update product detail
	Product updateProduct(Product product, Integer pid);

	// 4 Delete the Product
	String removeProduct(Integer pid);

	// 5 getting Single Product detail
	Product getAProduct(Integer pid);

	// Get All the Products With the same Price
	List<Product> getProductByShippingPrice(Double pshippingprice);

	// GettingAllProduct using JPQL
	List<Product> getAllProduct_byJPQL();

}
