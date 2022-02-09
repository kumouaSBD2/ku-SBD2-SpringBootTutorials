package com.example.demo;

import java.util.*;

import org.springframework.stereotype.Service;

import java.time.*;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariam.jamal@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21));
    }

    public String hello() {
        return "Hello World";
    }
}