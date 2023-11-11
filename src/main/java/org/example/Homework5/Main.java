package org.example.Homework5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Dave", 4.1, 5.0, 4.5, 5.0, "Mathematics"),
                new Student("John", 4.1, 5.0, 4.5, 5.0, "Informatics"),
                new Student("Ivan", 4.1, 2.0, 4.5, 5.0, "Mathematics"),
                new Student("Dan", 4.1, 5.0, 4.5, 5.0, "Physics"),
                new Student("Liam", 4.1, 2.0, 4.5, 5.0, "Informatics"),
                new Student("Seth", 4.1, 5.0, 4.0, 5.0, "Informatics"),
                new Student("Lewis", 4.1, 5.0, 4.5, 5.0, "Biology"),
                new Student("Ethan", 4.1, 2.0, 4.5, 5.0, "Biology"),
                new Student("Isabel", 4.1, 5.0, 4.0, 5.0, "Biology"),
                new Student("Lucy", 4.1, 2.0, 4.5, 5.0, "Physics"),
                new Student("Janet", 4.1, 5.0, 4.0, 5.0, "Physics"),
                new Student("Alice", 3.1, 5.0, 4.5, 5.0, "Informatics"),
                new Student("Molly", 4.1, 5.0, 4.0, 5.0, "Mathematics"),
                new Student("Christina", 3.1, 5.0, 4.5, 5.0, "Biology"),
                new Student("Alison", 3.1, 5.0, 4.5, 5.0, "Mathematics"),
                new Student("Tracey", 4.1, 5.0, 4.5, 4.4, "Informatics"),
                new Student("Dave2", 4.1, 5.0, 4.5, 5.0, "Mathematics"),
                new Student("John2", 4.1, 5.0, 4.5, 5.0, "Informatics"),
                new Student("Ivan2", 4.1, 2.0, 4.5, 5.0, "Mathematics"),
                new Student("Dan2", 4.1, 5.0, 4.5, 5.0, "Physics"),
                new Student("Liam2", 4.1, 2.0, 4.5, 5.0, "Informatics"),
                new Student("Seth2", 4.1, 5.0, 4.0, 5.0, "Informatics"),
                new Student("Lewis2", 4.1, 5.0, 4.5, 5.0, "Biology"),
                new Student("Ethan2", 4.1, 2.0, 4.5, 5.0, "Biology"),
                new Student("Isabel2", 4.1, 5.0, 4.0, 5.0, "Biology"),
                new Student("Lucy2", 4.1, 2.0, 4.5, 5.0, "Physics"),
                new Student("Janet2", 4.1, 5.0, 4.0, 5.0, "Physics"),
                new Student("Alice2", 3.1, 5.0, 4.5, 5.0, "Informatics"),
                new Student("Molly2", 4.1, 5.0, 4.0, 5.0, "Mathematics"),
                new Student("Christina2", 3.1, 5.0, 4.5, 5.0, "Biology"),
                new Student("Alison2", 3.1, 5.0, 4.5, 5.0, "Mathematics"),
                new Student("Tracey2", 4.1, 5.0, 4.5, 4.4, "Informatics"),
                new Student("Dave3", 4.1, 5.0, 4.5, 5.0, "Mathematics"),
                new Student("John3", 4.1, 5.0, 4.5, 5.0, "Informatics"),
                new Student("Ivan3", 4.1, 2.0, 4.5, 5.0, "Mathematics"),
                new Student("Dan3", 4.1, 5.0, 4.5, 5.0, "Physics"),
                new Student("Liam3", 4.1, 2.0, 4.5, 5.0, "Informatics"),
                new Student("Seth3", 4.1, 5.0, 4.0, 5.0, "Informatics"),
                new Student("Lewis3", 4.1, 5.0, 4.5, 5.0, "Biology"),
                new Student("Ethan3", 4.1, 2.0, 4.5, 5.0, "Biology"),
                new Student("Isabel3", 4.1, 5.0, 4.0, 5.0, "Biology"),
                new Student("Lucy3", 4.1, 2.0, 4.5, 5.0, "Physics"),
                new Student("Janet3", 4.1, 5.0, 4.0, 5.0, "Physics"),
                new Student("Alice3", 3.1, 5.0, 4.5, 5.0, "Informatics"),
                new Student("Molly3", 4.1, 5.0, 4.0, 5.0, "Mathematics"),
                new Student("Christina3", 3.1, 5.0, 4.5, 5.0, "Biology"),
                new Student("Alison3", 3.1, 5.0, 4.5, 5.0, "Mathematics"),
                new Student("Tracey3", 4.1, 5.0, 4.5, 4.4, "Informatics")
        );

        List<String> result = students.stream()
                .filter(n -> n.getSpecialty().equals("Informatics"))
                .filter(n -> n.getAverageGrade() > 4.5)
                .limit(5)
                .map(n -> n.getName() + " with average grade = " + n.getAverageGrade())
                .toList();

        System.out.println(result);
    }
}
