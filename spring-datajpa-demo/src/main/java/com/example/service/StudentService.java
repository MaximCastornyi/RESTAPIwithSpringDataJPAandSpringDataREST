package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.StudentEntity;
import com.example.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	
	public List<StudentEntity> getAllStudents(){
		return studentRepository.findAll();
	};
	
	public StudentEntity getById(Long id) {
		return studentRepository.findById(id).get();
	}
	
	public StudentEntity createStudent(StudentEntity student) {
		return studentRepository.save(student);
	}
	
	public StudentEntity updateStudent(StudentEntity student) {
		return studentRepository.save(student);
	}
	
	public String deleteStudent(Long id) {
		studentRepository.deleteById(id);
		return "Student has been deleted";
	}
}
