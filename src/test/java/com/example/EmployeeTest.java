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

}