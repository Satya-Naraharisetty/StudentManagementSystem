package com.sbproj.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbproj.sms.entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long>{
    List<Student> findByEmailContainingIgnoreCase(String EmailOrName);
    List<Student> findByFirstNameContainingIgnoreCase(String firstName);
}
