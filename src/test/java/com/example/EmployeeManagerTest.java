package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class EmployeeManagerTest {
    @Test
    @DisplayName("payEmployees should return all employees that have been paid")
    void payEmployeesShouldReturnAllEmployees() {

        EmployeeRepository employeeRepository = mock(EmployeeRepository.class);
        BankService bankService = mock(BankService.class);
        EmployeeManager employeeManager = new EmployeeManager(employeeRepository, bankService);

        when(employeeRepository.findAll()).thenReturn(
                List.of(new Employee("Omar", 1000), new Employee("Mergueze", 40000)));

        var result = employeeManager.payEmployees();

        assertThat(result).isEqualTo(2);
    }

    @Test
    @DisplayName("payEmployees should catch RuntimeException")
    void payEmployeesShouldCatchException() {

        EmployeeRepository employeeRepository = new EmployeeRepositoryStub();
        BankService bankService = new BankServiceStub();
        EmployeeManager employeeManager = new EmployeeManager(employeeRepository, bankService);

        var result = employeeManager.payEmployees();
        var result1 = employeeRepository.findAll();

        assertThat(result).isEqualTo(1);
        assertThat(result1.get(0).isPaid()).isTrue();
        assertThat(result1.get(1).isPaid()).isFalse();
    }
}