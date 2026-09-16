package com.Brach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BrachApplication {
int x = 10;
	int y = 20;
System.out.println("bug-fix");
	public static void main(String[] args) {
		SpringApplication.run(BrachApplication.class, args);
	}

}
