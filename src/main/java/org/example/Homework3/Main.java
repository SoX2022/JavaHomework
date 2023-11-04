package org.example.Homework3;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> department = new ArrayList<>();

        department.add(new Supervisor("Ivanov", "Ivan", "Ivanovich", "Boss", 1000, "01.01.2020"));
        department.add(new Employee("Mitchel", "John", "Johnovich", "Specialist", 500, "01.01.2020"));
        department.add(new Employee("Mitchel", "Kate", "Johnovich", "Specialist", 500, "15.01.2020"));
        department.add(new Employee("Mitchel", "Simon", "Johnovich", "Specialist", 500, "01.02.2020"));

        Supervisor supervisor = null;

        for (Employee employee : department) {
            if (employee.getClass() == Supervisor.class) {
                supervisor = (Supervisor) employee;
                break;
            }
        }

        for (Employee employee : department) {
            System.out.print(employee.getEmployeeId() + "_" + employee.getFullName() + " was");

            if (!employee.wasWorking(20, 1, 2020)) {
                System.out.print("n`t");;
            }

            System.out.println(" working 20.01.2020");
            System.out.println("Employee salary is " + employee.getSalary());
        }

        System.out.println();

        if (supervisor != null) {
            for (Employee employee : department) {
                if (supervisor.changeSalary(employee, 100)) {
                    System.out.println(employee.getEmployeeId() + "_" + employee.getFullName());
                    System.out.println(employee.getPosition() + "`s salary increased to " + employee.getSalary() + " by " + supervisor.getName());
                }
            }
        }


    }
}
