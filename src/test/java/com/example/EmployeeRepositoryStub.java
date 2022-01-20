package com.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryStub implements EmployeeRepository{

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Omar", 1000));
        employeeList.add(null);
        return employeeList;
    }

    @Override
    public Employee save(Employee e) {
        return null;
    }
}
