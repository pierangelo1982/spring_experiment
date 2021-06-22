package com.example.demo.Student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public List<Student> getStudents() {
		return List.of(
				new Student(
				1L,
				"Pierangelo",
				"pierangelo1982@gmail.com",
				LocalDate.of(2000, 1, 9),
				39
				));
	}

}
