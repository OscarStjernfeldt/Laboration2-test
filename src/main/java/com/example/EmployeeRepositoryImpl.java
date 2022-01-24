package com.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final List<Employee> employeeList;

    @Override
    public List<Employee> findAll() {
        return employeeList;
    }

    @Override
    public Employee save(Employee e) {
        employeeList.stream()
                .filter(employee -> employee.getId().equals(e.getId()))
                .findFirst()
                .ifPresent(this::removeExistingID);
        employeeList.add(e);
        return e;
    }

    public EmployeeRepositoryImpl(List<Employee> employeeList) {
        this.employeeList = new ArrayList<>(employeeList);
    }

    public EmployeeRepositoryImpl() {
        this.employeeList = new ArrayList<>();
    }

    private void removeExistingID(Employee employee) {
        employeeList.remove(employee);
    }
}