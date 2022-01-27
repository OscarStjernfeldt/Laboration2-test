package com.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryStub implements EmployeeRepository {

    private final List<Employee> employeeList;

    public EmployeeRepositoryStub() {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee("Omar", 1000));
        employeeList.add(new Employee("test2", 8));
    }

    @Override
    public List<Employee> findAll() {
        return List.copyOf(employeeList);
    }

    @Override
    public Employee save(Employee e) {
        return null;
    }
}