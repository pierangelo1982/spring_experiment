package com.example.demo.Student;

import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	// @Query("SELECT s FROM Student s WHERE s.email = ?1")
	Optional<Student> findByEmail(String email);
}
