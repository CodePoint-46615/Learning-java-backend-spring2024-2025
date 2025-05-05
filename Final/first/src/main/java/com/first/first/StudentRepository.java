package com.first.first;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    List<Student> getAll(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Saikot", 3.20));
        students.add(new Student(2, "Sony", 3.50));
        students.add(new Student(3, "Mridul", 3.60));
        return students;
    }

}
