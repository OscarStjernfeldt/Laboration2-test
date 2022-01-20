package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class EmployeeManagerTest {
    @Test
    @DisplayName("payEmployees should return all emlpoyees that have been paid")
    void payEmployeesShouldReturnAllEmployees() {

        EmployeeRepository employeeRepository = mock(EmployeeRepository.class);
        BankService bankService = mock(BankService.class);
        EmployeeManager employeeManager = new EmployeeManager(employeeRepository, bankService);

        when(employeeRepository.findAll()).thenReturn(
                List.of(new Employee("Omar", 1000), new Employee("Mergueze", 40000)));

        var result = employeeManager.payEmployees();

        assertThat(result).isEqualTo(2);
    }
}