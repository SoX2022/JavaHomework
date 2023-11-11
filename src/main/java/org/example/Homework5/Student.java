package org.example.Homework5;

import java.util.Arrays;
import java.util.List;

public class Student {
    private final String name;
    private List<Double> grades;
    private String specialty;

    public Student(String name, Double firstGrade, Double secondGrade, Double thirdGrade, Double forthGrade, String specialty) {
        this.name = name;
        this.grades = Arrays.asList(firstGrade, secondGrade, thirdGrade, forthGrade);
        this.specialty = specialty;
    }

    public double getAverageGrade() {
        return grades.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getName() {
        return name;
    }
}
