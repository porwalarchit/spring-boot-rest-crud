package com.archit.demo.rest;

import com.archit.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    // define endpoint for "/students"

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> theStudents = new ArrayList<>(); 

        theStudents.add(new Student("Poornima", "Patel"));
        theStudents.add(new Student("Moria", "Rossi"));
        theStudents.add(new Student("Mary", "Smith"));

        return theStudents;
    }
}
