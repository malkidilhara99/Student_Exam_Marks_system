package com.example.cs_2019_045ExamPractical.Service;

import com.example.cs_2019_045ExamPractical.Repository.StudentRepository;
import com.example.cs_2019_045ExamPractical.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

 @Autowired
    StudentRepository studentRepository;
 public  void  insertStudent(Student student){

     studentRepository.save(student);



 }
 public List<Student> getStudentMark(){

     return studentRepository.findAll();


 }
}
