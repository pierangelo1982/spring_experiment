package com.example.demo.Student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student pierangelo = new Student(
					1L,
					"Pierangelo",
					"pierangelo1982@gmail.com",
					LocalDate.of(2000, 1, 9)
					);
			
			Student napoleon = new Student(
					2L,
					"Napoleone",
					"pierangelo1982@libero.it",
					LocalDate.of(1982, 1, 9)
					);
			
			repository.saveAll(
					List.of(pierangelo, napoleon)
					);
		};
	}
}
