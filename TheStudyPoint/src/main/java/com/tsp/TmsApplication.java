package com.tsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tsp.entity.Student;
import com.tsp.repository.StudentRepository;

@SpringBootApplication
public class TmsApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepositoty;

	public static void main(String[] args) {
		SpringApplication.run(TmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student s1 = new Student("Abhishek", "Odisha", "ab@gmail.com", 9345678678l);
		Student s2 = new Student("Rajesh", "Bangalore", "ra@gmail.com", 9796346409l);
		Student s3 = new Student("Gopal", "Ranchi", "go@gmail.com", 2356890785l);
		Student s4 = new Student("Amit", "Kolkata", "am@gmail.com", 8765324567l);

		studentRepositoty.save(s1);
		studentRepositoty.save(s2);
		studentRepositoty.save(s3);
		studentRepositoty.save(s4);
		System.out.println("----------------all saved--------------");
		// System.out.println("the address is " +
		// (studentRepositoty.findByAddress("BBSr")).getAddress());

	}

}
