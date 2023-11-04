package org.example.Homework3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private static Long id = 0L;
    private final String name;
    private final String lastname;
    private final String surname;
    private final String position;
    private int salary;
    private Date hireDate;


    public Employee(String lastname, String name, String surname, String position, int salary, String hireDate) {
        id += 1L;
        this.lastname = lastname;
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            this.hireDate = dateFormat.parse(hireDate);
        } catch (ParseException e) {
            System.out.println("Incorrect date entered.");
        }
    }

    public Long getEmployeeId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName() {
        return lastname + " " + name + " " + surname;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public String getHireDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return dateFormat.format(hireDate);
    }

    public boolean wasWorking(int day, int month, int year) {
        Date incomeDate = null;
        try {
            incomeDate = new SimpleDateFormat("dd.MM.yyyy")
                    .parse(String.valueOf(day) + "." + String.valueOf(month) + "." + String.valueOf(year));
        } catch (ParseException e) {
            System.out.println("Incorrect date entered.");
        }

        assert incomeDate != null;
        return incomeDate.compareTo(hireDate) >= 0;
    }

    protected void setSalary(int increase) {
        this.salary += increase;
    }
}
