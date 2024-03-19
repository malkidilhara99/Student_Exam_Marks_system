package com.example.cs_2019_045ExamPractical.Repository;

import com.example.cs_2019_045ExamPractical.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String> {
}
