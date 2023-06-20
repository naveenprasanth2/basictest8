package com.basictest.practise1;

import java.util.List;

public class EmployeeEvaluation {
    public static void main(String[] args) {

        Employee e1 = Employee.builder()
                .age(20)
                .name("naveen")
                .devices(List.of("apple", "apple1", "Android", "samsung", "samsung1"))
                .gender("male")
                .build();

        Employee e2 = Employee.builder()
                .age(21)
                .name("prasanth")
                .devices(List.of("samsung", "lg", "galaxy", "galaxy22", "galaxy24"))
                .gender("male")
                .build();

        List<Employee> test = List.of(e1, e2);

       test.stream().filter(x -> x.getName().equals("naveen"))
                .filter(x -> x.getDevices().contains("apple"))
               .forEach(System.out::println);

    }
}
