package org.example.Homework3;

public class Supervisor extends Employee {
    public Supervisor(String name, String lastname, String surname, String position, int salary, String hireDate) {
        super(name, lastname, surname, position, salary, hireDate);
    }

    public boolean changeSalary(Employee employee, int increase) {
        if (employee.getClass() != Supervisor.class) {
            employee.setSalary(increase);
            return true;
        }
        return false;
    }
}
