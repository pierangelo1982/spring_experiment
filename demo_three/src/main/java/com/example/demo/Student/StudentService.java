package com.example.demo.Student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private final StudentRepository studentRepository; 
	
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public List<Student> getStudents() {
		return studentRepository.findAll();
	}
	
	
	public void addNewStudent(Student student) {
		System.out.println(student);
		Optional<Student> studentOptional = studentRepository.findByEmail(student.getEmail());
		if (studentOptional.isPresent()) {
			throw new IllegalStateException("Email già presente");
		} else {
			studentRepository.save(student);
		}
	}

	public void deleteStudent(Long id) {
		boolean exist = studentRepository.existsById(id);
		if (!exist) {
			throw new IllegalStateException("studen with id " + id + " does not exist");
		}
		studentRepository.deleteById(id);
		
	}

}
