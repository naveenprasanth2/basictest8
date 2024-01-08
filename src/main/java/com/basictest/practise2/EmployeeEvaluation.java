package com.basictest.practise2;

import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.NoSuchElementException;

@Log4j2
public class EmployeeEvaluation {
    public static void main(String[] args) {
        Employee e1 = new Employee("naveen", 25, "male", List.of("apple", "apple1", "Android", "samsung", "samsung1"));
        Employee e2 = new Employee("prasanth", 22, "female", List.of("samsung", "lg", "galaxy", "galaxy22", "galaxy24"));

        Employee e3 = new Employee("prasanth111", 22, "female", List.of("samsung", "lg", "galaxy", "galaxy22", "galaxy24"));

        List<Employee> test = List.of(e1, e2, e3);

        test.stream().filter(x -> x.devices().contains("galaxy24"))
                .filter(x -> x.name().equals("prasanth"))
                .findFirst().ifPresent(log::info);
    }
}
