package com.example.crud_app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud_app.entity.Student;


public interface StudentRepository extends JpaRepository <Student, Long> { 
    List<Student> findByName(String name); 
}