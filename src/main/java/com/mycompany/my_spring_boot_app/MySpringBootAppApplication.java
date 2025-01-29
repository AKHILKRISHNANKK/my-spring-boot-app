package com.mycompany.my_spring_boot_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootAppApplication {

	public static void main(String[] args) {
		System.out.println("Starting app");
		SpringApplication.run(MySpringBootAppApplication.class, args);
		System.out.println("Stopping the app");
	}

}
