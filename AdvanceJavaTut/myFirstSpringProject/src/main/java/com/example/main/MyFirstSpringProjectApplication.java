package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.demo;

@SpringBootApplication
public class MyFirstSpringProjectApplication extends Demo {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringProjectApplication.class, args);
		
		Demo d1 = new MyFirstSpringProjectApplication();
		d1.piza();
		System.out.println("Project started");
	}

}
