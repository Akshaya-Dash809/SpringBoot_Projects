package com.courier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.courier.entity.Product;
import com.courier.repository.ProductRepository;

@SpringBootApplication
//Main class
public class CargoCourierManagementApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;

	// Main method
	public static void main(String[] args) {
		SpringApplication.run(CargoCourierManagementApplication.class, args);
	}

	@Override
	// creating new objects
	public void run(String... args) throws Exception {
		Product p1 = Product.builder().pname("Letters").pweight("150 gm").pdescription("College letter")
				.pshippingprice(150.00).pquantity(25).build();
		Product p2 = Product.builder().pname("Clothes").pweight("1.2 kg").pdescription("Male Kurta set")
				.pshippingprice(1200.00).pquantity(5).build();
		Product p3 = Product.builder().pname("Shoes").pweight("600 gm").pdescription("Formal type leather shoes")
				.pshippingprice(600.00).pquantity(3).build();
		Product p4 = Product.builder().pname("Mobile").pweight("180 gm").pdescription("Moto g5 mobile")
				.pshippingprice(300.00).pquantity(1).build();
		Product p5 = Product.builder().pname("Keybord").pweight("220 gm").pdescription("Zebronics ZEB-K04 Mini keybord")
				.pshippingprice(230.00).pquantity(1).build();
		// saving the datas into database
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
		productRepository.save(p5);

		System.out.println("--------------Data Entered Successsfully------------");
	}

}
