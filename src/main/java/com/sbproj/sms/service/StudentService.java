package com.sbproj.sms.service;

import java.util.List;

import com.sbproj.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

	List<Student> searchStudentsByEmailId(String keyword);

	List<Student> searchStudentsByFirstName(String keyword);
}
