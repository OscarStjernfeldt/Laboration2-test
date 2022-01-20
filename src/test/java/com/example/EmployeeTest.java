package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class EmployeeTest {

    @Test
    @DisplayName("getId should return correct id")
    void getIdShouldReturnCorrectId() {

        Employee employee = new Employee("Omar", 10);

        var result = employee.getId();

        assertThat(result).isEqualTo("Omar");
    }

    @Test
    @DisplayName("getSalary should return correct salary")
    void getSalaryShouldReturnCorrectSalary() {

        Employee employee = new Employee("Omar", 100);

        var result = employee.getSalary();

        assertThat(result).isEqualTo(100);
    }

    @Test
    @DisplayName("setId should return new id")
    void setIdShouldReturnNewId() {

        Employee employee = new Employee("Omar", 100);

        employee.setId("Oscar");
        var result = employee.getId();

        assertThat(result).isEqualTo("Oscar");
    }

    @Test
    @DisplayName("setSalary should return new salary")
    void setSalaryShouldReturnNewSalary() {

        Employee employee = new Employee("Omar", 100);

        employee.setSalary(1000);
        var result = employee.getSalary();

        assertThat(result).isEqualTo(1000);
    }

    @Test
    @DisplayName("isPaid should return false by default")
    void isPaidShouldReturnFalseByDefault() {

        Employee employee = new Employee("Omar", 100);

        var result =  employee.isPaid();

        assertThat(result).isEqualTo(false);
    }
}