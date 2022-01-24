package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeRepositoryImplTest {

    @Test
    @DisplayName("findAll should return a list")
    void findAllShouldReturnAList() {

        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

        var result = employeeRepository.findAll();

        assertThat(result).isInstanceOf(List.class);
    }

    @Test
    @DisplayName("save should add to list")
    void saveShouldAddToList() {
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        Employee employee = new Employee("Omar", 100);

        employeeRepository.save(employee);
        var result = employeeRepository.findAll();

        assertThat(result).contains(employee);
    }

    @Test
    @DisplayName("Add employees to list with constructor")
    void addToListWithConstructor() {
        Employee employee = new Employee("Omar", 100);
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl(List.of(employee));

        var result = employeeRepository.findAll();

        assertThat(result).contains(employee);
    }
}