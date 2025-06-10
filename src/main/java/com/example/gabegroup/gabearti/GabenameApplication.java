package com.example.gabegroup.gabearti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GabenameApplication {

	public static void main(String[] args) {
		System.out.println("현재 JDK 버전: " + System.getProperty("java.version"));
		SpringApplication.run(GabenameApplication.class, args);
	}

}
