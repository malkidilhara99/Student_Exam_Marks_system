package com.example.cs_2019_045ExamPractical.Conttroller;

import com.example.cs_2019_045ExamPractical.Service.StudentService;
import com.example.cs_2019_045ExamPractical.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {


    @Autowired
    StudentService studentService;
    @RequestMapping("/add-Marks")
    public  String insertStudentMarks(Model model)
    {
        model.addAttribute("student",new Student());
        return  "insert-student-marks";


    }

    @RequestMapping(value = "/submit-Marks",method = RequestMethod.POST)
    public  String insertStudentMarks1(@ModelAttribute Student student, Model model)
    {
        student.setFinalMarks((student.getCA()*0.2)+(student.getPractical()*0.2+student.getTheory()*0.6));
        studentService.insertStudent(student);
        return "redirect:/add-Marks";

    }
    @RequestMapping("/viewStudent")
    public  String viewStudentMarks (Model model)
    {
        model.addAttribute("students",studentService.getStudentMark());
        return  "view-student-marks";

    }





}
