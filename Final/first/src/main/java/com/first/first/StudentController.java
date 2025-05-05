package com.first.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/all")
    /*public String getStudents(){
        return "Hi! this is JAVA Backend";
    }*/

    /*public List<Student> getStudents(){
        StudentRepository studentRepo = new StudentRepository();
        return studentRepo.getAll();
    }*/

    //Applying filter
    public List<Student> getStudent(){
        StudentRepository studentRepository = new StudentRepository();
        return studentRepository.getAll()
                .stream()
                .filter(student -> student.getCgpa() > 3.5)
                .collect(Collectors.toList());
    }

}
