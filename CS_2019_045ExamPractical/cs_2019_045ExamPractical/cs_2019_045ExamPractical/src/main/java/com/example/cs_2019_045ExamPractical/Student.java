package com.example.cs_2019_045ExamPractical;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Student {


    @Id
    private  String id;
    @NonNull
    private  String Name;
    @NonNull
    private  int  CA;
    @NonNull
    private  int practical;
    @NonNull
    private  int Theory;
    @NonNull
    private  double finalMarks;





}
